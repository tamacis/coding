package GenericsEssential;

import java.util.LinkedList;
import java.util.List;

public class SubTyping {
    /*
Subtyping
The Liskov Substitution Principle does not apply for generic elements!

Integer is a subtype of Number.
Integer is a subtype of Comparable.
List is a subtype of Collection.
List<Integer> is a subtype of Collection<Integer>.
List<Integer> is not a subtype of List<Number>.
List<Integer> is not a subtype of List<Comparable>.
 */
    public static void main(String[] args) {

// Example why generic elements are not proper subtypes:
        List<Integer> integers = new LinkedList<Integer>();
//List<Number> numbers = integers;            // Won't compile!
//numbers.add(3.14);                          // since integers cannot contain 3.14

    }
}
