
#include <stdio.h>

int main() {

int a[10] = {5,3,4,42,35};
int *p;

p=a;

printf ( "%d == %d," , p[3], *(p+3)  );

return 129;
}
