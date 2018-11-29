
#include <stdio.h>
#include <stdint.h>

static inline uint64_t get_cycles() ;

int main() {

printf ("%d",  get_cycles()) ;

return 0;
#include <stdio.h>

int main() {


}

}

static inline uint64_t get_cycles()
{
  uint64_t t;
  asm volatile ("rdtsc" : "=A"(t));
  return t;
}
