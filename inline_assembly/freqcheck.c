#include <stdio.h>
#include <omp.h>

void sample_frequency(const int nsamples, double *max, int nthreads) {

    *max = 0;
    double diffxy;

    {
        double dtimex,dtimey;

        dtimex = omp_get_wtime();
        for(int i=0; i<nsamples; i++) {
             #pragma omp barrier
             asm ("mov r0, r0");
        }
       dtimey = omp_get_wtime();
       diffxy=(dtimey-dtimex)/nsamples;   
    }
    *max = diffxy;
}


int main(void) {
    int ncores = 1;
    printf("num_threads %d, num_cores %d\n", omp_get_max_threads(), ncores);     
  
    for (int j=0;j<=5;j++) {
        double max;
        sample_frequency(10000, &max, ncores);
        printf("1 thread: %e \n",max);
    }

}

