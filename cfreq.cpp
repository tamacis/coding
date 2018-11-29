#include <signal.h>
#include <sys/time.h>
#include <iostream>
#include <cstdlib>
#include <unistd.h>

using namespace std;

long long int counter = 0;
struct timeval last_time;
struct timeval curr_time;
double dif = 0.0;
double freq_sum = 0.0;
double reps = 0.0;
double freq_min = 99999.0;
double freq_max = 0.0;
long long int num_too_low = 0;

void time_check(int data)
{
    // work out the frequecy of the SIGALRMs
    ++counter;
    if (counter >= 1000)
    {

        // need to work out time since last 1000 ticks
	gettimeofday(&curr_time, NULL);
	dif = ((curr_time.tv_usec + curr_time.tv_sec * 1000000)
		- (last_time.tv_usec + last_time.tv_sec * 1000000));
        double freq = (counter / dif)  * 1000000;

        freq_sum = ((freq_sum * reps) + freq) / (reps + 1) ;

        ++reps;
//         if (freq < 800)
                cout << "Frequency = " << freq << " reps= " << dif / 1000000 << endl;
        if (freq_min > freq) freq_min = freq;
        if (freq_max < freq) freq_max = freq;
        if (freq < 950) 
            ++num_too_low;
        last_time = curr_time;
        counter = 0;
    }
}


int main (int argc, char * argv[])
{
    cout << "go" /* << "\a \a \a" */ << endl;
	
    int res;
    gettimeofday(&last_time, NULL);
    struct sigaction action;

    struct itimerval timer_value;

    timer_value.it_value.tv_sec = 0;
    timer_value.it_value.tv_usec = 1;
    timer_value.it_interval.tv_sec = 0;
    timer_value.it_interval.tv_usec = 1;

    action.sa_handler = time_check;
    action.sa_flags = SA_NOMASK;
    sigemptyset(&action.sa_mask);

    sigaction( SIGALRM, &action, NULL);
    res = setitimer( ITIMER_REAL, &timer_value, NULL );
    if (res == -1)
        cout << "error in setitimer" << endl;

    cout << "Starting CPU Test program" << endl;
    // loop for a long time

    while (reps < 3000.0)
    {
        sleep(1);
    }
    cout << "average CPU frequency = " << freq_sum << endl;
    cout << "reps = " << reps << endl;
    cout << "Min = " << freq_min << "  Max = " << freq_max << endl;
    cout << "number of low = " << num_too_low << endl;
    return 0;
}
