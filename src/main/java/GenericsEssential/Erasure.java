package GenericsEssential;

// Additional methods are compiled into generic classes
interface Foo<T> {
    void foo(T param);
}

class Bar{}

public class Erasure implements Foo<Bar> {

    /**
     *
     * Java Generics is implemented by erasure.
     * This means that the generic information is removed when the class is compiled:
     *
     *     The erasure of List<Integer>, List<String>, List<List<Integer>> is List.
     *     The erasure of Comparable<? super T> is Comparable.
     *     The erasure of Object & Comparable is the leftmost, Object.
     *
     * Another thing to be aware of is that the implementation of generics with erasure
     * forces the compiler to insert additional methods into the class files.
     */

    public static void main(String[] args) {
        for (Method m : Bar.class.getMethods())
            if (m.getName().startsWith("foo"))
                System.out.println(m.toGenericString());
    }

    /*
    This can trip you up if you try to overload a method to accept Object as a parameter too.
    It has never been a good idea to overload with Object as well as a subclass of Object but
    now it will not even compile:

    Error:line (6)name clash: foo(java.lang.Object) in Bar and foo(T) in Foo<Bar> have the same erasure,
    yet neither overrides the other


     */

}

/**
 Compatibility

 All in all the implementation of generics in Java is a wonderful example of craftsmanship.
 The solution is binary compatible both backward and forward allowing new code to use old libraries
 as well as allowing old code to use new libraries.

 I do, however, wish that they would have skipped the compatibility and made generic classes aware of what they are at runtime.
 **/