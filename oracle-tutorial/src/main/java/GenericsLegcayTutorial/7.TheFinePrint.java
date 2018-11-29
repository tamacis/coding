
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* A Generic Class is Shared by All Its Invocations */

 /*
What does the following code fragment print?
 */
class GenericSharing {

    public static void main(String[] args) {
        List<String> l1 = new ArrayList<String>();
        List<Integer> l2 = new ArrayList<Integer>();
        System.out.println(l1.getClass() == l2.getClass());

    }

}

/*
You might be tempted to say false, but you'd be wrong. 
It prints true, because all instances of a generic class have the 
same run-time class, regardless of their actual type parameters.

Indeed, what makes a class generic is the fact that it has the same behavior 
for all of its possible type parameters; the same class can be viewed as 
having many different types. 

As consequence, the static variables and methods of a class are also shared 
among all the instances. That is why it is illegal to refer to the type 
parameters of a type declaration in a static method or initializer, 
or in the declaration or initializer of a static variable.

 */

 /* Casts and InstanceOf */

 /*
Another implication of the fact that a generic class is shared among all its
instances, is that it usually makes no sense to ask an instance if it is 
an instance of a particular invocation of a generic type:
 */
class CastsAndInstanceOf {

    public static void main(String[] args) {

        Collection cs = new ArrayList<String>();
        // Illegal.
        //if (cs instanceof Collection<String>) {  }

        //similarly, a cast such as
        Collection<String> cstr = (Collection<String>) cs; // Unchecked warning,

        /*
gives an unchecked warning, since this isn't something the runtime system is going to check for you.
The same is true of type variables
         */
    }

    // Unchecked warning. 
    <T> T badCast(T t, Object o) {
        return (T) o;
    }

    /*
Type variables don't exist at run time. This means that they entail no 
performance overhead in either time nor space, which is nice. 
Unfortunately, it also means that you can't reliably use them in casts.
     */
}


/* Arrays */
 /*
The component type of an array object may not be a type variable or a 
parameterized type, unless it is an (unbounded) wildcard type.
You can declare array types whose element type is a type variable or a 
parameterized type, but not array objects.
 */
class ArraysGenerics {

    public static void main(String[] args) {
        /*
        If arrays of parameterized type were allowed, the previous example would
        compile without any unchecked warnings, and yet fail at run-time. 
        We've had type-safety as a primary design goal of generics. 
         */

        // Not really allowed.
        /*
        List<String>[] lsa = new List<String>[10];
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        // Unsound, but passes run time store check
        oa[1] = li;

        // Run-time error: ClassCastException.
        String s = lsa[1].get(0);
         */
 /*
        However, you can still use wildcard arrays. 
        The following variation on the previous code forgoes the use of both
        array objects and array types whose element type is parameterized.
        As a result, we have to cast explicitly to get a String out of the array.
         */
        // OK, array of unbounded wildcard type.
        List<?>[] lsa = new List<?>[10];
        Object o = lsa;
        Object[] oa = (Object[]) o;
        List<Integer> li = new ArrayList<Integer>();
        li.add(new Integer(3));
        // Correct.
        oa[1] = li;
        // Run time error, but cast is explicit.
        String s = (String) lsa[1].get(0);

    }

    /*
    Similarly, attempting to create an array object whose element type is a type
    variable causes a compile-time error:
     */
    /*
    <T> T[] makeArray(T t) {
        return new T[100]; // Error.
    } 
    */

    /*
Since type variables don't exist at run time, there is no way to determine what 
the actual array type would be. */
}
