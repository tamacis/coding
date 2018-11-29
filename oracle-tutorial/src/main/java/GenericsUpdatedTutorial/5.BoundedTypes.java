/* Bounded Type Parameters

There may be times when you want to restrict the types that can be used as 
type arguments  in a parameterized type. 
For example, a method that operates on numbers might only want to accept 
instances of Number or its subclasses. 

This is what bounded type parameters are for.

To declare a bounded type parameter, list the type parameter's name, 
followed by the extends keyword, followed by its upper bound, which 
in this example is Number. 
 */

class BoundedTypes {

    static class Box<T> {

        private T t;

        public void set(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }

        public <U extends Number> void inspect(U u) {
            System.out.println("T: " + t.getClass().getName());
            System.out.println("U: " + u.getClass().getName());
        }

    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.set(new Integer(10));
//        integerBox.inspect("some text"); // error: this is still String!
        System.out.println(integerBox.get());
        
        NaturalNumber<Integer> n = new NaturalNumber<>(10);
        System.out.println("n " + n.isEven());
    }

//In addition to limiting the types you can use to instantiate a generic type, 
//bounded type parameters allow you to invoke methods defined in the bounds:
    static class NaturalNumber<T extends Integer> {

        private T n;

        public NaturalNumber(T n) {
            this.n = n;
        }

        public boolean isEven() {
            return n.intValue() % 2 == 0;
        }

    }


    /*
Multiple Bounds

The preceding example illustrates the use of a type parameter with a single bound, 
but a type parameter can have multiple bounds:

<T extends B1 & B2 & B3>

A type variable with multiple bounds is a subtype of all the types listed in the bound. 
If one of the bounds is a class, it must be specified first. For example:

     */
    class A {
        /* ... */ }

    interface B {
        /* ... */ }

    interface C {
        /* ... */ }

    class D<T extends A & B & C> {
        /* ... */ }

//If bound A is not specified first, you get a compile-time error:
//    class F<T extends B & A & C> // compile-time error {
//    }  

}
