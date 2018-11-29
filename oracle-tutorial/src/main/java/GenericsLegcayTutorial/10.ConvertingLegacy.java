
import java.util.Collection;

/* Converting Legacy Code to Use Generics */

 /*
Now, it's time to look at the harder problem of "generifying" old code.

If you decide to convert old code to use generics, you need to think carefully 
about how you modify the API.

You need to make certain that the generic API is not unduly restrictive; 
it must continue to support the original contract of the API. 
Consider again some examples from java.util.Collection.
The pre-generic API looks like:
 */
interface CollectionOld {

    public boolean containsAll(Collection c);

    public boolean addAll(Collection c);
}

/*
A naive attempt to generify it would be the following:
 */
interface CollectionNaive<E> {

    public boolean containsAll(CollectionNaive<E> c);

    public boolean addAll(CollectionNaive<E> c);
}

/*
While this is certainly type safe, it doesn't live up to the API's original
contract. The containsAll() method works with any kind of incoming collection.
It will only succeed if the incoming collection really contains only instances of E, but:

    The static type of the incoming collection might differ, perhaps because the
    caller doesn't know the precise type of the collection being passed in, 
    or perhaps because it is a Collection<S>,where S is a subtype of E.
    
    It's perfectly legitimate to call containsAll() with a collection of a 
    different type. The routine should work, returning false.

In the case of addAll(), we should be able to add any collection that consists
of instances of a subtype of E.
 */
interface CollectionsGeneric<E> {

    public boolean containsAll(CollectionsGeneric<? extends E> c);

    public boolean addAll(CollectionsGeneric<? extends E> c);
}

/*
You also need to ensure that the revised API retains binary compatibility 
with old clients. This implies that the erasure of the API must be the same as 
the original, ungenerified API. 
In most cases, this falls out naturally, but there are some subtle cases. 
We'll examine one of the subtlest cases we've encountered, the method Collections.max(). 
 */

 /*
a plausible signature for max() is: */
class BinaryCompatibility {

    public static <T extends Comparable<? super T>> T maxO(Collection<T> coll) {
        return null;
    }
    /* 
    This is fine, except that the erasure of this signature is:

    public static Comparable max(Collection coll)

    which is different than the original signature of max():

    public static Object max(Collection coll)
    */
    
    /*
    We can force the erasure to be different, by explicitly specifying a 
    superclass in the bound for the formal type parameter T.
    */
    public static <T extends Object & Comparable<? super T>> T maxG(Collection<T> coll) {
        return null;
    }
    
    /*
    This is an example of giving multiple bounds for a type parameter, 
    using the syntax T1 & T2 ... & Tn. 
    A type variable with multiple bounds is known to be a subtype of all of the
    types listed in the bound. When a multiple bound is used, the first type 
    mentioned in the bound is used as the erasure of the type variable.

    Finally, we should recall that max only reads from its input collection, 
    and so is applicable to collections of any subtype of T.

    This brings us to the actual signature used in the JDK:
    */

public static <T extends Object & Comparable<? super T>> 
        T max(Collection<? extends T> coll) {
            return null;
        }


}


/* 
Another issue to watch out for is covariant returns, that is, refining the 
return type of a method in a subclass. 

You should not take advantage of this feature in an old API. 
To see why, let's look at an example.
*/

class Foo1 {
    // Factory. Should create an instance of 
    // whatever class it is declared in.
    public Foo1 create() {
        return null;
    }
}

class Bar1 extends Foo1 {
    // Actually creates a Bar.
    public Foo1 create() {
       return new Bar1();
    }
}
/*
Taking advantage of covariant returns, you modify it to:
*/

class Foo2 {
    // Factory. Should create an instance of 
    // whatever class it is declared in.
    public Foo2 create() {
       return null;
    }
}

 class Bar2 extends Foo2 {
    // Actually creates a Bar.
    public Bar2 create() {
        return new Bar2();
    }
}

/*

Now, assume a third party client of your code wrote the following:

*/
class Baz2 extends Bar2 {
    // Actually creates a Baz.
//    public Foo2 create() {
//        return new Baz2();
//    }
}

/*
 Unless the class Baz is recompiled, it will not properly override the create()
method of Bar2. 
Furthermore, Baz will have to be modified, since the code will be rejected as 
written--the return type of create() in Baz is not a subtype of the return 
type of create() in Bar.
*/
