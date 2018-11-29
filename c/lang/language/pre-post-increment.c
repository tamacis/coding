
#include <stdio.h>

int main (void) {


	int a = 5;
	int b = 1;
	int c = 5;
	
	int d = a++ + b;
	int e = ++c + b;

	printf(" d = %d", d);
	printf(" e = %d", e);

	return 0;

}
