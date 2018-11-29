package GenericsUpdatedTutorial;

/* 
A generic class is defined with the following format:

class name<T1, T2, ..., Tn> { }

The type parameter section, delimited by angle brackets (<>), follows the class name. 
It specifies the type parameters (also called type variables) T1, T2, ..., and Tn.

 */

//A Simple Box Class
//class Box {
//    private Object object;
//
//    public void set(Object object) { this.object = object; }
//    public Object get() { return object; }
//}

/**
 * Generic version of the Box class.
 *
 * @param <T> the type of the value being boxed
 */ 

class Box<T> {

    // T stands for "Type"
    private T t;

    public void set(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }
    
}

/*
As you can see, all occurrences of Object are replaced by T.
A type variable can be any non-primitive type you specify: 
    any class type, any interface type, any array type, or even another type variable.
 */
 /*
Type Parameter Naming Conventions

By convention, type parameter names are single, uppercase letters.

The most commonly used type parameter names are:

    E - Element (used extensively by the Java Collections Framework)
    K - Key
    N - Number
    T - Type
    V - Value
    S,U,V etc. - 2nd, 3rd, 4th types
 */

 /*
Type Parameter and Type Argument Terminology: 

Many developers use the terms "type parameter" and "type argument" interchangeably, 
but these terms are not the same. 
When coding, one provides type arguments in order to create a parameterized type. 

Therefore, the T in Foo<T> is a type parameter and the String in Foo<String> f is a type argument

 */

 /*
Multiple Type Parameters

As mentioned previously, a generic class can have multiple type parameters. 
For example, the generic OrderedPair class, which implements the generic Pair interface:
 */
interface Pair<K, V> {

    public K getKey();

    public V getValue();
}

class OrderedPair<K, V> implements Pair<K, V> {

    private K key;
    private V value;

    public OrderedPair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

class PairDemo {

    public static void main(String[] args) {
        Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
        Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

        System.out.println(p1.getKey() + " " + p1.getValue());
        System.out.println(p2.getKey() + " " + p2.getValue());
   
// Or using diamond syntax

     OrderedPair<String, Integer> p3 = new OrderedPair<>("Even", 8);
        OrderedPair<String, String> p4 = new OrderedPair<>("hello", "world");

        System.out.println(p3.getKey() + " " + p3.getValue());
        System.out.println(p4.getKey() + " " + p4.getValue());
        /*
Parameterized Types

You can also substitute a type parameter (i.e., K or V) with a parameterized type 
(i.e., List<String>). For example, using the OrderedPair<K, V> example:
         */
        OrderedPair<String, Box<Integer>> p = new OrderedPair<>("primes", new Box<Integer>());
    }

}
