

#include <stdio.h>

using namespace std;

#define max_n 5000000

int mod = 1000000;
int memo[max_n];

int fib(int n) {
if (n==1) return 0;
if (n==2) return 1;
if (memo[n] > 0) return memo[n];
