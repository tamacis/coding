package GenericsUpdatedTutorial;

import java.util.List;

/* Generics, Inheritance, and Subtypes

As you already know, it is possible to assign an object of one type to an object
of another type provided that the types are compatible. 

For example, you can assign an Integer to an Object, since Object is one of Integer's supertypes:

 */

class IsARelation {

    {
        Object someObject = new Object();
        Integer someInteger = new Integer(10);
        someObject = someInteger;   // OK
    }

    /*
In object-oriented terminology, this is called an "is a" relationship. 
Since an Integer is a kind of Object, the assignment is allowed. 
But Integer is also a kind of Number, so the following code is valid as well:
     */
    public static void someMethod(Number n) {
    }

    static {
        someMethod(new Integer(10));   // OK
        someMethod(new Double(10.1));   // OK

        /*
The same is also true with generics. 
You can perform a generic type invocation, passing Number as its type argument, 
and any subsequent invocation of add will be allowed if the argument is compatible with Number:
         */
        Box<Number> box = new Box<Number>();
        box.set(new Integer(10));   // OK
        box.set(new Double(10.1));  // OK

    }

    public void boxTest(Box<Number> n) {
    }

    /*
 Now consider the above method:

What type of argument does it accept? 
By looking at its signature, you can see that it accepts a single argument 
whose type is Box<Number>. 
But what does that mean? Are you allowed to pass in Box<Integer> or Box<Double>,
as you might expect? The answer is "no", 
because Box<Integer> and Box<Double> are not subtypes of Box<Number>.


Given two concrete types A and B (for example, Number and Integer), 
MyClass<A> has no relationship to MyClass<B>, regardless of whether or not 
A and B are related. 
The common parent of MyClass<A> and MyClass<B> is Object.

     */
}

/*
Generic Classes and Subtyping
 You can subtype a generic class or interface by extending or implementing it. 

The relationship between the type parameters of one class or interface and the 
type parameters of another are determined by the extends and implements clauses.

Now imagine we want to define our own list interface, PayloadList, 
that associates an optional value of generic type P with each element.
Its declaration might look like:

*/

interface PayloadList<E,P> extends List<E> {
  void setPayload(int index, P val);
}

/*
 The following parameterizations of PayloadList are subtypes of List<String>:

    PayloadList<String,String>
    PayloadList<String,Integer>
    PayloadList<String,Exception>
*/