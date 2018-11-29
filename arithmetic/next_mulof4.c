#include <stdio.h>

unsigned int test_constant_bytes[5] = {
 14*1024*1024,
 21*1024*1024,
 12*1024*1024,
 8*1024*1024,
 980000,	
};

unsigned int find_next_mul4(unsigned int ubytes) {
unsigned int mod4,ret;

// convert to MiB
ret = ubytes >> 20;
// a value of 0 means less than 1MiB
if (!ret) {
	ret=4;
}
// we need the next one
else {
	mod4=(ret % 4);
	ret += (mod4 ? 4-mod4 : 4 );
}
return ret;
}

int main() {
unsigned int i,  mul4 ;
      for (i=0;i<=4;i++) {
	 mul4 = find_next_mul4(test_constant_bytes[i]);
	 printf ("next mul of %u bytes is %u \n",
	test_constant_bytes[i], mul4);
      }

return 0;
}


