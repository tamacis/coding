#include <stdio.h>

int main() {
int a[8] = {2,56,35,33,35,21,36,74};
int b[8] = {24,14,51,63,65,83,13,63};
int c[8] = {13,45,62,57,17,88,32,67};
int d[8] = {46,21,75,56,72,62,92,46};

#define BUF_SIZE ( ((8*4)+7+1) *4)
int i; char buf[BUF_SIZE+1]; void *p;int ret;
buf[BUF_SIZE+1] = '\0';


for ( i=0;i<8;++i) {
a[i]++;
b[i]++;
c[i]++;
d[i]++;
}

ret=0;
for(i=0;i<8;++i) {
ret=sprintf(buf+(i*ret),"%d",a[i]);
buf[(i*ret)+1] = ' ';
//buf[ (i*4) + i + 1  ] = ' ';
//p = ( buf + (i*4) + i );
//*((int *)p) = a[i] ;
}
 
for(i=0;i<BUF_SIZE;++i) {
if ( buf[i] == '\0') buf[i] = '.';
}


printf("%s", buf);

return 0;
}