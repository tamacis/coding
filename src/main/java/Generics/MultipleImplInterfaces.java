/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author cswl
 */
public class MultipleImplInterfaces {

    public static void main(String[] args) {
        C c = new C();
        c.foo(0);
        c.foo("zero");
    }
}

interface A<T, R extends Number> {
    R foo(T t);
}

interface B<U, S extends String> {
    S foo(U u);
}
//
//class C<T, R extends Number, U, S extends String> implements A<T, R >, B<S, U> {
//    @Override 
//    public R foo(T t) {
//        return null;
//    }
//    
//    @Override 
//    public S foo(U u) {
//        return null;
//    }
//}
