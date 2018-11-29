
#include <sys/time.h>
#include <stdio.h>

int main() {

clock_t start, end;

double cpu_time_used;

start=clock(); 

end = clock(); 

cpu_time_used = ((double) (end  - start ))/1000000;

printf("Time elapsed : %d \n", cpu_time_used);

return 0;

}
