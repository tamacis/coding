
import java.util.Arrays;
import java.util.List;

/*
Unbounded Wildcards

The unbounded wildcard type is specified using the wildcard character (?), 
for example, List<?>. This is called a list of unknown type. 
There are two scenarios where an unbounded wildcard is a useful approach:

* If you are writing a method that can be implemented using functionality provided in the Object class.
* When the code is using methods in the generic class that don't depend on the type parameter. 
  For example, List.size or List.clear. 
  In fact, Class<?> is so often used because most of the methods in Class<T> do not depend on T.

 */
// Consider the following method, printList:
class UnboundedWildcard {

    public static void printListFail(List<Object> list) {
        for (Object elem : list) {
            System.out.println(elem + " ");
        }
        System.out.println();
    }
    // The goal of printList is to print a list of any type, but it fails to achieve that goal 
    // it prints only a list of Object instances; 
    /// it cannot print List<Integer>, List<String>, List<Double>, and so on, 
    // because they are not subtypes of List<Object>. 

    //To write a generic printList method, use List<?>:
    // Consider a method that takes an unbounded wildcard
    public static void printList(List<?> list) {
        for (Object elem : list) {
            System.out.print(elem + " ");
        }
        System.out.println();
    }

    // Consider an method that returns an unbounded wildcard.. 
    public static List<?> makeList() {
        // It can return any type of List
        List<?> l = Arrays.asList(1, 2, 3);
        l = Arrays.asList("foo", "boo", "poo");
        return l;
    }

    public static void main(String[] args) {
        // Because for any concrete type A, List<A> is a subtype of List<?>, 
        // you can use printList to print a list of any type:

        List<Integer> li = Arrays.asList(1, 2, 3);
        List<String> ls = Arrays.asList("one", "two", "three");
        printList(li);
        printList(ls);

        // Fail
//        printListFail(li);
        // Calling the method that returns an unbounded wildcard.. 
        // https://stackoverflow.com/a/36656333/5026445
        List<Integer> ml = (List<Integer>) makeList();
        printList(makeList());
    }

}
