
import java.util.Arrays;
import java.util.List;

/* 
Upper Bounded Wildcards

To write the method that works on lists of Number and the subtypes of Number, 
such as Integer, Double, and Float, you would specify List<? extends Number>. 

The term List<Number> is more restrictive than List<? extends Number> because 
the former matches a list of type Number only, whereas the latter matches a 
list of type Number or any of its subclasses.

 */
class UpperBoundedWildcards {
// Consider the following process method:

//     The upper bounded wildcard, <? extends Foo>, where Foo is any type, matches Foo 
// and any subtype of Foo. The process method can access the list elements as type Foo:
    public static void process(List<? extends Foo> list) {
        for (Foo elem : list) {
            // ...
        }
    }

    class Foo {
    }

//     The sumOfList method returns the sum of the numbers in a list:
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    public static void main(String[] args) {

//The following code, using a list of Integer objects, prints sum = 6.0:
        List<Integer> li = Arrays.asList(1, 2, 3);
        System.out.println("sum = " + sumOfList(li));

//A list of Double values can use the same sumOfList method. The following code prints sum = 7.0:
        List<Double> ld = Arrays.asList(1.2, 2.3, 3.5);
        System.out.println("sum = " + sumOfList(ld));

    }
}
