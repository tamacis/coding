

int main() {


asm("mov %[result], %[value], ror #1"
 : [result] "=r" (y) :
 [value] "r" (x));



return 0;
}
