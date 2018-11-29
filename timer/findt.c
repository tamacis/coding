#include <stdio.h>
#include <unistd.h>
#include <sys/time.h>
#include <time.h>

int main(int argc, char** argv) {
    struct timeval now; // wall clock times
    struct timeval later;
    clock_t tNow = clock(); // clock measures  CPU time of this Linux thread
    gettimeofday(&now, NULL); // wall clock time when CPU time first read
    clock_t tLater = tNow;
    while (tNow == tLater)
           tLater = clock(); // consume CPU time
    gettimeofday(&later, NULL); 
// wall clock time when CPU time has ticked

    printf("CLOCKS_PER_SEC %ld\n",CLOCKS_PER_SEC);
    double cpuRes = (double)(tLater - tNow)/CLOCKS_PER_SEC;
    printf("CPU time usage resolution looks to be %f seconds\n", cpuRes);
    unsigned long long nowUs = ((unsigned  long long)now.tv_sec) * 1000000ULL;
    nowUs += (unsigned long long)now.tv_usec;
    unsigned long long laterUs = ((unsigned long long)later.tv_sec) * 1000000ULL;
    laterUs += (unsigned long long)later.tv_usec;
    printf("gettimeofday changed by %d uS when CPU time changed by %f seconds\n", (int)(laterUs - nowUs), cpuRes);
    // now measure resolution of gettimeofday
    gettimeofday(&now, NULL);//
    later = now;
    while ((now.tv_sec == later.tv_sec) && (now.tv_usec == later.tv_usec))
            gettimeofday(&later, NULL);
    nowUs = ((unsigned long long)now.tv_sec)  * 1000000ULL;
    nowUs += (unsigned long long)now.tv_usec;
    laterUs = ((unsigned long long)later.tv_sec) * 1000000ULL;
    laterUs += (unsigned long long)later.tv_usec;
    printf("gettimeofday resolution looks to be %d us\n", (int)(laterUs - nowUs));
}
