
/* Generic Methods */
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* 
Consider writing a method that takes an array of objects and a collection 
and puts all objects in the array into the collection. Here's a first attempt:
 */
class GenericMethods {

    static void fromArrayToCollectionFail(Object[] a, Collection<?> c) {
        for (Object o : a) {
//            c.add(o); // compile-time error
        }
    }

    /*
    The way to do deal with these problems is to use generic methods. 
Just like type declarations, method declarations can be generic—that is,
parameterized by one or more type parameters.
     */
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        for (T o : a) {
            c.add(o); // Correct
        }
    }
// We can call this method with any kind of collection whose element type is a 
//    supertype of the element type of the array.

    public static void main(String[] args) {
        Object[] oa = new Object[100];
        Collection<Object> co = new ArrayList<Object>();

// T inferred to be Object
        fromArrayToCollection(oa, co);

        String[] sa = new String[100];
        Collection<String> cs = new ArrayList<String>();

// T inferred to be String
        fromArrayToCollection(sa, cs);

// T inferred to be Object
        fromArrayToCollection(sa, co);

        Integer[] ia = new Integer[100];
        Float[] fa = new Float[100];
        Number[] na = new Number[100];
        Collection<Number> cn = new ArrayList<Number>();

// T inferred to be Number
        fromArrayToCollection(ia, cn);

// T inferred to be Number
        fromArrayToCollection(fa, cn);

// T inferred to be Number
        fromArrayToCollection(na, cn);

// T inferred to be Object
        fromArrayToCollection(na, co);

// compile-time error
//        fromArrayToCollection(na, cs);
    }

    // One question that arises is: when should I use generic methods, and when
//    should I use wildcard types? 
//    To understand the answer, let's examine a few methods from the Collection libraries.
    interface Collectable<E> {

        public boolean containsAll(Collection<?> c);

        public boolean addAll(Collection<? extends E> c);
    }

//    We could have used generic methods here instead:
    interface CollectableMethod<E> {

        public <T> boolean containsAll(Collection<T> c);

        public <T extends E> boolean addAll(Collection<T> c);
        // Hey, type variables can have bounds too!
    }

    /*
However, in both containsAll and addAll, the type parameter T is used only once. 
The return type doesn't depend on the type parameter, nor does any other argument 
to the method (in this case, there simply is only one argument). 
This tells us that the type argument is being used for polymorphism; 
its only effect is to allow a variety of actual argument types to be used 
at different invocation sites. If that is the case, one should use wildcards. 
Wildcards are designed to support flexible subtyping, which is what we're trying to express here.

Generic methods allow type parameters to be used to express dependencies among the types 
of one or more arguments to a method and/or its return type. 
If there isn't such a dependency, a generic method should not be used.

It is possible to use both generic methods and wildcards in tandem. 
Here is the method Collections.copy():

     */
    class Collections {

        public <T> void copy(List<T> dest, List<? extends T> src) {
        }

        /* Note the dependency between the types of the two parameters. 
            Any object copied from the source list, src, must be assignable to the 
            element type T of the destination list, dst. 
            So the element type of src can be any subtype of T — we don't care which. 
            The signature of copy expresses the dependency using a type parameter,
            but uses a wildcard for the element type of the second parameter. 
            
            We could have written the signature for this method another way,
            without using wildcards at all:
         */
        public <T, S extends T> void copyGenericOnly(List<T> dest, List<S> src) {

        }

        /* 
        This is fine, but while the first type parameter is used both in the type of dst 
        and in the bound of the second type parameter, S, S itself is only used once, 
        in the type of src —n othing else depends on it. 
        
        This is a sign that we can replace S with a wildcard. 
        Using wildcards is clearer and more concise than declaring explicit type parameters, 
        and should therefore be preferred whenever possible.
        */
    }

}
