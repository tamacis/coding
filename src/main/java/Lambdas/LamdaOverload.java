/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lambdas;

@FunctionalInterface
interface Foo<T> {

    int apply(T e);
}

@FunctionalInterface
interface Boo<T> {

    boolean apply(T e);
}

/**
 *
 * @author cswl
 */
public class LamdaOverload {

    public static void someMethod(Foo f) {
        System.out.println(f.apply(10));
    }

    public static void someMethod(Boo f) {
        System.out.println(f.apply(9));
    }

    public static void main(String[] args) {
        Foo<Integer> f = x -> x + 1;
        Boo<Integer> g = x -> x > 10;

        /**
         * ** Compiler gets confused. ***
         */
//        someMethod( x -> x + 1);
//        someMethod( x -> x > 10);
        /**
         * ** Okay
         */
        someMethod(f);
        someMethod(g);

        someMethod((Foo<Integer>)x -> x + 1);
        someMethod((Boo<Integer>)x -> x > 10);
    }
}
