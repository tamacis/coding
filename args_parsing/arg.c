
#include <stdio.h>
#include <stdlib.h>
#define NUL "\0"

int main( int argc, char* args[]) 
{
    char foo[]="boo" ;
    char* bar="baz" ;
    char* strs[2];
       strs[0] = foo   ;
       strs[1] = bar;
   printf(" %s %s\n" , strs[0], strs[1] );
  int  memc = 0 ;
  int charc;
   for ( int i=1; i<argc ; i++ )     {
   charc=0;
      while ( charc != -1)  {
        if (  ((args[i])[charc]) == '\0' )  {
         printf ( "chars in %d argument = %d \n ", i, charc);
         charc=-1; 
         break; }
        else {
        charc++ ;
        }
    }
    memc += sizeof(&args[i]   ) ;
    }

   printf ("%d", memc );

}

   
