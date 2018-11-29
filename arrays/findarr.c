#include <stdio.h>


	int main () {

	int  arr[] = {44,43,2,3,64,74,25,96,22,67};
	
	int pos;
        int n=64;
        int* start=&arr[0];
        int* end=start+10;

       for(int i=0;i<10;i++)  {
        if ( *(start+i)==n )  {
        pos=i;
        break;
        }
        }

        printf("Index of 64 is %d \n",pos);


	}
