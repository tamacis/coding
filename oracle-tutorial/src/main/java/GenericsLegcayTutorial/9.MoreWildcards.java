
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* Now consider the inverse, a write-only data structure. 
The interface Sink is a simple example of this sort.
 */
interface Sink<T> {

    void flush(T t);
}

/*
 The method writeAll() is designed to flush all elements of the collection coll 
to the sink snk, and return the last element flushed.
 */
class WriteOnly {

    static Sink<Object> s;
    static Collection<String> cs;

    public static <T> T writeAll(Collection<T> coll, Sink<T> snk) {
        T last = null;
        for (T t : coll) {
            last = t;
            snk.flush(last);
        }
        return last;
    }

    public static void main(String[] args) {
//        String str = writeAll(cs, s); // Illegal call.
    }

    /*
    As written, the call to writeAll() is illegal, as no valid type argument can
    be inferred; neither String nor Object are appropriate types for T, 
    because the Collection element and the Sink element must be of the same type.
    
    
    We can fix this error by modifying the signature of writeAll() as shown below, using a wildcard.
     */
    public static <T> T writeAllUpperBound(Collection<? extends T> c, Sink<T> t) {
        return null;
    }

    public static void callWriteAllUpper(String[] args) {

// Call is OK, but wrong return type. 
//        String str = writeAllUpperBound(cs, s);

        /*  The call is now legal, but the assignment is erroneous, since the return 
    type inferred is Object because T matches the element type of s, which is Object.
         */
    }

    /*
    The solution is to use a form of bounded wildcard we haven't seen yet: 
    wildcards with a lower bound. The syntax ? super T denotes an unknown type 
    that is a supertype of T (or T itself; 
    remember that the supertype relation is reflexive). 

    It is the dual of the bounded wildcards we've been using, 
    where we use ? extends T  to denote an unknown type that is a subtype of T.
     */
    public static <T> T writeAllLowerBound(Collection<T> coll, Sink<? super T> snk) {
        return null;
    }

    public static void callWriteAllLowerBound(String[] args) {

        /*
Using this syntax, the call is legal, and the inferred type is String, as desired.
         */
        String str = writeAllLowerBound(cs, s); // Yes! 
    }

}

/* Now let's turn to a more realistic example. 
A java.util.TreeSet<E> represents a tree of elements of type E that are ordered.

One way to construct a TreeSet is to pass a Comparator object to the constructor.
That comparator will be used to sort the elements of the TreeSet according to a desired ordering.

 */
//The Comparator interface is essentially:
interface Comparator<T> {

    int compare(T fst, T snd);
}

class TreeSetGeneric {

    <E> TreeSetGeneric(Comparator<E> c) {

    }
}

/*
    Suppose we want to create a TreeSet<String> and pass in a suitable comparator, 
    We need to pass it a Comparator that can compare Strings. 
    This can be done by a Comparator<String>, but a Comparator<Object> will do 
    just as well. However, we won't be able to invoke the constructor given above 
    on a Comparator<Object>. 
    We can use a lower bounded wildcard to get the flexibility we want:
 */
class TreeSetWildcard {
//    This code allows any applicable comparator to be used.

    <E> TreeSetWildcard(Comparator<? super E> c) {

    }
}

/*
As a final example of using lower bounded wildcards, lets look at the method 
Collections.max(), which returns the maximal element in a collection passed 
to it as an argument. 
Now, in order for max() to work, all elements of the collection being passed in 
must implement Comparable. 

Furthermore, they must all be comparable to each other.

A first attempt at generifying this method signature yields:
 */
class FailedCollections {

    public static <T extends Comparable<T>> T max(Collection<T> coll) {
        return null;
    }
}

/*
That is, the method takes a collection of some type T that is comparable to 
itself, and returns an element of that type. 
However, this code turns out to be too restrictive. 
To see why, consider a type that is comparable to arbitrary objects:
 */
class Foo implements Comparable<Object> {

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        /* 
    Every element of cf is comparable to every other element in cf, 
    since every such element is a Foo, which is comparable to any object,
    and in particular to another Foo. 
    However, using the signature above, we find that the call is rejected. 
    The inferred type must be Foo, but Foo does not implement Comparable<Foo>.
         */

        Collection<Foo> cf = new ArrayList<>();
        Collections.max(cf); // Should work.
    }
}

/*
It isn't necessary that T be comparable to exactly itself. 
All that's required is that T be comparable to one of its supertypes. 
This give us:
 */
class FixedCollections {

    public static <T extends Comparable<? super T>> T max(Collection<T> coll) {
        return null;
    }

}

/* Wildcard Capture */
 /*
Given:
 */
class UnknownType {

    /* Add an element  t to a Set s. */
    public static <T> void addToSet(Set<T> s, T t) {
    }

    public static void main(String[] args) {
        Set<?> unknownSet = new HashSet<String>();

        //The call below is illegal.
//        addToSet(unknownSet, "abc"); // Illegal.
    }
    /* 
    It makes no difference that the actual set being passed is a set of strings;
    what matters is that the expression being passed as an argument is a set of
    an unknown type, which cannot be guaranteed to be a set of strings, 
    or of any type in particular.
     */

}

/*

Now, consider the following code:

 */
class CollectionsCapture {

    public static <T> Set<T> unmodifiableSet(Set<T> set) {
        return null;
    }

    public static void main(String[] args) {
        /*
        It seems this should not be allowed; yet, looking at this specific call,
        it is perfectly safe to permit it. After all, unmodifiableSet() does 
        work for any kind of Set, regardless of its element type.

        Because this situation arises relatively frequently, there is a special
        rule that allows such code under very specific circumstances in which 
        the code can be proven to be safe. 
        This rule, known as wildcard capture, allows the compiler to infer the 
        unknown type of a wildcard as a type argument to a generic method.
         */
        Set<?> unknownSet = new HashSet<String>();
        Set<?> s = Collections.unmodifiableSet(unknownSet); // This works! Why?
    }
}
