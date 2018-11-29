/*
Thrash the memory.
*/

// need lots of random data
#define RANDOM_SOURCE "/dev/frandom"

#include <stdio.h>
#include <stdlib.h>

char* getRandomBytes(int nb) {
 FILE *pf;
 int i;
 char c;
 char *buf = malloc(nb+1);
 pf=fopen(RANDOM_SOURCE,"r");
 if(!pf) return NULL;
 while (1) {
 c=fgetc(pf);	
 if (c != EOF) { buf[i]=c; i++; }
 if (i == nb ) break;
 }
 free(buf);
 fclose(pf); 
 return buf;
}

int main(int argc, char *argv[]) {
int i;
int *mem_ref;
char *rb = getRandomBytes(8);

for (i=0;i<=1<<4;i++) {
	mem_ref = (int *) malloc(4<<20);
	// write a byte to random locatain
	mem_ref[0]  = &(mem_ref[i]);
}

if (rb == NULL ) {
printf ("Failed to read from %* \n",RANDOM_SOURCE);
return -1;
}
/*
for (i=0;i<4;i++) {
 printf("%dth byte is %c \n",i,rb[i]);
}*/

while(1){ 
	(void *) 0;
	sleep(1);
	 }
return 0;
}
