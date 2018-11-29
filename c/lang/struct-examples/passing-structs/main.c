#include <stdio.h>
#include <stdlib.h>

#include "lib.h"

extern struct device *get_devices(int* nr_devs);

int main() {
	int i,n;
	struct device *devs;
	struct device *dev;

	devs = get_devices(&n);

	printf("i=%d \n",n);
	printf("devs=%p \n", devs);

		for (i = 0; i < n; i++) {
		dev = &devs[i];
	    printf("id=%d",dev->id );
	}
}