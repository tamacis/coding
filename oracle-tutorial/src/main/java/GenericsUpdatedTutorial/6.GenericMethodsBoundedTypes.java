/* 
Generic Methods and Bounded Type Parameters

Bounded type parameters are key to the implementation of generic algorithms. 

Consider the following method that counts the number of elements in an array T[]
that are greater than a specified element elem.
 */

class GenMethBoundTypesErr {

    public static <T> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
//            if (e > elem) // compiler error
//            ++count;
        }
        return count;
    }
}

/*
The implementation of the method is straightforward, but it does not compile 
because the greater than operator (>) applies only to primitive types s
uch as short, int, double, long, float, byte, and char. 

You cannot use the > operator to compare objects. 
To fix the problem, use a type parameter bounded by the Comparable<T> interface
 */
interface Comparabull<T> {

    public int compareTo(T o);
}

class Bits implements Comparabull<Bits> {

    final int value;

    Bits(int b) {
        this.value = b;
    }

    @Override
    public int compareTo(Bits o) {
        return this.value > o.value ? 1 : 0;
    }
}

//The resulting code will be:
class GenMethBoundTypes {

    public static <T extends Comparabull<T>> int countGreaterThan(T[] anArray, T elem) {
        int count = 0;
        for (T e : anArray) {
            if (e.compareTo(elem) > 0) {
                ++count;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        Bits[] boo = {
            new Bits(0b10),
            new Bits(0b11),
            new Bits(0b101),
            new Bits(0b111)};

       int c = countGreaterThan(boo, new Bits(0b11));
        System.out.println(c);
    }

}
