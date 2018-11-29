/*

In some cases, the compiler infers the type of a wildcard. 
For example, a list may be defined as List<?> but, when evaluating an expression, 
the compiler infers a particular type from the code. 
This scenario is known as wildcard capture.

 */

import java.util.Arrays;
import java.util.List;

class WildcardError {

    void foo(List<?> i) {
//        i.set(0, i.get(0));
    }
}

/*
The code is attempting to perform a safe operation, so how can you work around 
the compiler error? 

You can fix it by writing a private helper method which captures the wildcard.
 */
class WildcardFixed {

    void foo(List<?> i) {
        fooHelper(i);
    }

    // Helper method created so that the wildcard can be captured
    // through type inference.
    private <T> void fooHelper(List<T> l) {
        l.set(0, l.get(0));
    }
//      Thanks to the helper method, the compiler uses inference to determine that T is CAP#1, 
//    the capture variable, in the invocation. 

}

class WildcardErrorBad {

    static void swapFirst(List<? extends Number> l1, List<? extends Number> l2) {
        Number temp = l1.get(0);
//        l1.set(0, l2.get(0)); // expected a CAP#1 extends Number,
        // got a CAP#2 extends Number;
        // same bound, but different types
//        l2.set(0, temp);	    // expected a CAP#1 extends Number,
        // got a Number
    }

    public static void main(String[] args) {
//        The code is attempting an unsafe operation. 
//For example, consider the following invocation of the swapFirst method:

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<Double> ld = Arrays.asList(10.10, 20.20, 30.30);
        swapFirst(li, ld);

//        While List<Integer> and List<Double> both fulfill the criteria of List<? extends Number>, 
// it is clearly incorrect to take an item from a list of Integer values and attempt to place it 
// into a list of Double values.
    }
}
