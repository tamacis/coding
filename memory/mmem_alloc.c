


#include <stdlib.h>
#include <stdio.h>
#include <unistd.h>


int main() {
void *p1,*p2;
p1 = malloc(32<<20);
p2 = malloc(32<<20);

printf("Heap start at:  %u and %u \n",
(unsigned int)p1, (unsigned int)p2);
unsigned int d;
d=(unsigned int)p1 - (unsigned int)p2;
printf("Heap difference: %u bytes, ( %u MiB) \n",
d, d>>20);


unsigned int *c1,*c2, i;
c1 = (unsigned int *)p1;
c2 = (unsigned int *)p2;

for(i=0;i<(31<<20);i++) {
//printf("Writing %d byte \r", i);
//c1[i]= i^0xdeadbeef ;//(unsigned int) p1;
//c2[i]= i^0xeababaff ;//(unsigned int) p2;
}

//while(1){ sleep(1);}
}
