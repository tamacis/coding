package GenericsEssential;

import java.util.LinkedList;
import java.util.List;

public class WildCards {

    /*
Wildcards
To loosen the constraint above wildcards may be used.
Wildcards are used with the keywords extends and super.

  <? extends Number> means all types that are subclasses of Number are allowed.
  <? super Integer> means all types that are superclasses of Integer are allowed.

The Get and Put Principle: use extends only when you intend to get values out of a structure,
use super only when you intend to put values into a structure.

This also implies: don’t use any wildcards when you intend to both get and put values into and out of a structure.

   */
// Copy all elements, subclasses of T, from source to dest which contains elements that are superclasses of T.
    public static <T> void copy(List<? super T> dest, List<? extends T> source) {
        for (int i = 0; i < source.size(); i++) {
            dest.set(i, source.get(i));
        }
    }

    public static void main(String[] args) {
        // Extends wildcard violation
        List<Integer> integers = new LinkedList<>();
        List<? extends Number> numbers = integers;
        numbers.get(0);                                 // Works fine!
//            numbers.add(3);                                 // Won't compile!

        // Super wildcard violation
        List<Number> numbers1 = new LinkedList<>();
        List<? super Integer> integers1 = numbers1;
        numbers1.add(3);                                 // Works fine!
//            int i = numbers1.get(0);                         // Won't' compile!
        Object o = numbers1.get(0);                      // Works fine since object is the upper bound!

            /*
            Additional to the above principle there are also a few restrictions on wildcards:
            Don’t use wilcards when creating instances,
            specifying generic method calls and extending superclasses:
            */

        // Wild card type cannot be instatinated directly
//            List<?> integers2 = new LinkedList<?>();         // Won't compile!

//            List<?> integers3 = Lists.<?>factory();          // Won't compile!


//            abstract class AnyList implements List<?> {}             // Won't compile!


    }


}
