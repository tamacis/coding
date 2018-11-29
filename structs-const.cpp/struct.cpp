typedef struct foo {
	int test;
	const int bar;
 } foo;

int main(void) {
	foo ptr = {
	0,
	2
	};
	return 0;
}