
import java.util.ArrayList;
import java.util.List;

/*

Generic classes or interfaces are not related merely because there is a relationship between their types. 
However, you can use wildcards to create a relationship between generic classes or interfaces.

Given the following two regular (non-generic) classes:

    class A { }
    class B extends A {  }

It would be reasonable to write the following code:

    B b = new B();
    A a = b;

This example shows that inheritance of regular classes follows this rule of subtyping: 
class B is a subtype of class A if B extends A. This rule does not apply to generic types:

    List<B> lb = new ArrayList<>();
L   List<A> la = lb;   // compile-time error

Given that Integer is a subtype of Number, what is the relationship between List<Integer> and List<Number>?
The common parent of List<Number> and List<Integer> is the list of unknown type List<?>.

Although Integer is a subtype of Number, List<Integer> is not a subtype of List<Number> 
and, in fact, these two types are not related. 
The common parent of List<Number> and List<Integer> is List<?>.
 */
 /*

 In order to create a relationship between these classes so that the code can access 
Number's methods through List<Integer>'s elements, use an upper bounded wildcard:

Because Integer is a subtype of Number, and numList is a list of Number objects, 
a relationship now exists between intList (a list of Integer objects) and numList.
 */
class WildcardSubtyping {

    public static void main(String[] args) {
        List<? extends Integer> intList = new ArrayList<>();
        // OK. List<? extends Integer> is a subtype of List<? extends Number>
        List<? extends Number> numList = intList;
   
           List<? extends Duck> d = new ArrayList<>();
        List<? extends Animal> a  = d;
    }
}

class Animal {}
class Duck extends Animal{}
