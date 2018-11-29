

#include "lib.h"


static struct device devs[] = {
	{.id=123, .name="test"},
	{.id=245, .name="foo"}
};

struct device *get_devices(int* nr_devs) {
	*nr_devs=2;
	return devs;
}