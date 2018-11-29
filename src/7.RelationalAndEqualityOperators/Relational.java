/*

The equality and relational operators are used to compare two operands and return a true/false value. This tutorial will provide a simple example of how the relational operators function. The Java relational operators are as follows:
== equal to
> greater than
>= greater than or equal to
< less than
<= less than or equal to
!= not equal to
*/

class Relational {
    public static void main(String args[]) {
        //declaration statements can string together comma-separated variables as long as the data type is the same.
        int a=5, b=6; // don't confuse the assignment operator equals = with the relational operator == equal to.

        System.out.println(a == b); // equal to relational operator
        System.out.println(a > b); // greater than relational operator
        System.out.println(a >= b); // greater than or equal to relational operator
        System.out.println(a < b); // less than relational operator
        System.out.println(a <= b); // less than or equal to relational operator
        System.out.println(a != b); // not equal to relational operator
       
    }
}