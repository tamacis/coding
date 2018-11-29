


#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

int main() {

       int index;
       unsigned long long hash;
       unsigned long crc;

       int data_sz = sizeof(index)+sizeof(hash)+sizeof(crc);
	void *data = malloc(data_sz);
	printf("data start at: %x \n", &data);
	printf("size of data: %d \n\n", data_sz);

	for (int i=0;i<4;i++)
		printf("raw byte of data: %d \n", (char) (data+i) );

       /*
       void *heap = malloc(1<<16);
 printf("Heap start at %p \n ",&heap);
        int bits[] = {0,1}, *cur;
        int i=0;
    for ( int i=0; i<4;i++) {
         cur =  i+ (int*) &heap;
    printf("Wrote one byte %d at %p \n", bits[i%2], cur); 
        }*/
}
