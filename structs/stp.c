struct pair {
int a; int b;
};

struct pairlist {
	struct pair *pairs;
	int *d;
};

struct pair_data {
struct pair pairs[10];
int d[];
};

struct pairdata sample_pair_data = {
	.pairs = {{1,2}, {2,5}},
	.d = {6,7}
};

struct pairlist mypairlist = {
	.pairs= sample_pair_data.pairs,
	.d =  sample_pair_data.pairs,
};

struct pairlist *pptr = &mypairlist;


#include <stdio.h>


int main () {
printf ("hellp \n");
}
