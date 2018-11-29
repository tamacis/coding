

#include <stdio.h>
#include <string.h>

struct app {
char  name[32];
int version;
};


int main() {

struct app Myapp;

strcpy(Myapp.name,"Foo");
Myapp.version=1;

struct app *foo;
foo = &Myapp;

printf (" app name %s /n app version %d \n",   foo->name,foo->version);


}
