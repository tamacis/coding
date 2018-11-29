

int main () {
asm volatile ( " mcr p15, 0,  %0, c9, c14, 0" :: "r"(1) );
return 0;
}
