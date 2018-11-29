#include <stdio.h>
#include <stdlib.h>

int main() {
int i;
	int *ptr;
	void* myint = malloc (10e6*sizeof (int));
        ptr = (int*) myint;
	for (i=0;i<=10e6;i++) {
		ptr++;
		*ptr=i;
 //printf ("%p %p %d \n", &ptr, &(*ptr),*ptr);
	}
return 0;
}
