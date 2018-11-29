

#include <stdio.h>

int main() {
#define printf(...) printf(__VA_ARGS__); \
	printf("\n")

	int int_x;
	unsigned int uint_x;
	long int lint_x;
	unsigned long int luint_x;
	long long int llint_x;
	unsigned long long lluint_x;

	printf (" size of int : %d", sizeof int_x);
	printf (" size of u int : %d",sizeof  uint_x);
	printf (" size of l int : %d", sizeof lint_x);
	printf (" size of ul int : %d", sizeof luint_x);
	printf (" size of ll int : %d", sizeof  llint_x);
	printf (" size of ull int : %d", sizeof lluint_x);
}
