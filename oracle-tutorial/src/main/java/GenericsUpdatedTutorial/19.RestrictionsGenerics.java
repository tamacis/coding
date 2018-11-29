
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/*
Restrictions on Generics

    Cannot Instantiate Generic Types with Primitive Types
    Cannot Create Instances of Type Parameters
    Cannot Declare Static Fields Whose Types are Type Parameters
    Cannot Use Casts or instanceof With Parameterized Types
    Cannot Create Arrays of Parameterized Types
    Cannot Create, Catch, or Throw Objects of Parameterized Types
    Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type

 */
class RestrictionGenerics {

    /*
    Cannot Instantiate Generic Types with Primitive Types
     */
    //Consider the following parameterized type:
    class Pair<K, V> {

        private K key;
        private V value;

        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }
//         When creating a Pair object, you cannot substitute a primitive type 
//          for the type parameter K or V:

        public void usage() {
            //Pair<int, char> p = new Pair<>(8, 'a');  // compile-time error
//You can substitute only non-primitive types for the type parameters K and V:
            Pair<Integer, Character> p = new Pair<>(8, 'a');

        }
        // ...
    }

    /*
    
    Cannot Create Instances of Type Parameters
     */
    public static <E> void append(List<E> list) {
//        E elem = new E();  // compile-time error
//        list.add(elem);
    }

//     As a workaround, you can create an object of a type parameter through reflection:
    public static <E> void append(List<E> list, Class<E> cls) {
        E elem;
        try {
            elem = cls.newInstance(); // OK
            list.add(elem);
        } catch (InstantiationException | IllegalAccessException ex) {

        }

    }

//You can invoke the append method as follows:
    public void TypeInstance() {
        List<String> ls = new ArrayList<>();
        append(ls, String.class);

    }

    /*
    Cannot Declare Static Fields Whose Types are Type Parameters
     */
//    A class's static field is a class-level variable shared by all non-static 
//    objects of the class. Hence, static fields of type parameters are not allowed. 
    class MobileDevice<T> {
//    private static T os; 

    }

//If static fields of type parameters were allowed, then the following code would be confused:
    class Smartphone {
    }

    class Pager {
    }

    class TabletPC {
    }
    MobileDevice<Smartphone> phone = new MobileDevice<>();
    MobileDevice<Pager> pager = new MobileDevice<>();
    MobileDevice<TabletPC> pc = new MobileDevice<>();

//Because the static field os is shared by phone, pager, and pc, what is the actual type of os? 
//It cannot be Smartphone, Pager, and TabletPC at the same time.
//You cannot, therefore, create static fields of type parameters. 
    /* Cannot Use Casts or instanceof with Parameterized Types
    
     */
//     Because the Java compiler erases all type parameters in generic code, 
//    you cannot verify which parameterized type for a generic type is being used at runtime:
    public static <E> void rtti(List<E> list) {
//    if (list instanceof ArrayList<Integer>) {  // compile-time error
    }

    /*
 The runtime does not keep track of type parameters, so it cannot tell the difference 
between an ArrayList<Integer> and an ArrayList<String>. 
The most you can do is to use an unbounded wildcard to verify that the list is an ArrayList:
     */
    public static void rttiUnbounded(List<?> list) {
        if (list instanceof ArrayList<?>) {  // OK; instanceof requires a reifiable type
            // ...
        }
    }

    /*
    Cannot Create Arrays of Parameterized Types
     */
    //  You cannot create arrays of parameterized types.
//    For example, the following code does not compile:
    public static void ParameterizedArrays() {
//        List<Integer>[] arrayOfLists = new List<Integer>[2];  // compile-time error
// The following code illustrates what happens when different types are inserted into an array:

        Object[] strings = new String[2];
        strings[0] = "hi";   // OK
        strings[1] = 100;    // An ArrayStoreException is thrown.

// If you try the same thing with a generic list, there would be a problem:
//Object[] stringLists = new List<String>[];  // compiler error, but pretend it's allowed
//stringLists[0] = new ArrayList<String>();   // OK
//stringLists[1] = new ArrayList<Integer>();  // An ArrayStoreException should be thrown,
        // but the runtime can't detect it.
//If arrays of parameterized lists were allowed,
// the previous code would fail to throw the desired ArrayStoreException.
    }

    /*
    Cannot Create, Catch, or Throw Objects of Parameterized Types
     */
//     A generic class cannot extend the Throwable class directly or indirectly. 
//    For example, the following classes will not compile:
// Extends Throwable indirectly
//class MathException<T> extends Exception { /* ... */ }    // compile-time error
// Extends Throwable directly
//class QueueFullException<T> extends Throwable { /* ... */ // compile-time error
    
    
//    A method cannot catch an instance of a type parameter:
//    public static <T extends Exception, J> void execute(List<J> jobs) {
//        try {
//            for (J job : jobs) // ...
//            {
//                
//            }
//        } catch (T e) {   // compile-time error
//            // ...
//        }
//    }

//     You can, however, use a type parameter in a throws clause:

class Parser<T extends Exception> {
    public void parse(File file) throws T {     // OK
        // ...
    }
}

/*
Cannot Overload a Method Where the Formal Parameter Types of Each Overload Erase to the Same Raw Type
*/

// A class cannot have two overloaded methods that will have the same signature after type erasure.

public class Example {
//    public void print(Set<String> strSet) { }
//    public void print(Set<Integer> intSet) { }
}

//The overloads would all share the same classfile representation and will generate a compile-time error.

}
