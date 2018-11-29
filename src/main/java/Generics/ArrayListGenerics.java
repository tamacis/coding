package Generics;

import java.util.ArrayList;

interface Rope<E> {
    abstract void add(E e);
}

 class RopeList<E> implements Rope<E> {
     @Override
    public void add(E e) {
        System.out.println(e);
    }
}

public class ArrayListGenerics {
    public static void main(String[] args) {
    
        RopeList<Integer> r1 = new RopeList<>();
        r1.add(10);


        RopeList<? extends Number> r2 = new RopeList<>();
//        r2.add(Integer.valueOf (10));

        //  Bounded type <String>
        ArrayList<String> a1 = new ArrayList<>();
        a1.add("test");

        // Wildcard type <? any>
        ArrayList<?> a2 = new ArrayList<>();
//         a2.add(Integer.valueOf (10));
//         a2.add(10.0);

        ArrayList<? extends Number> a3 = new ArrayList<Number>();
        // a3.add(Integer.valueOf (10));

        ArrayList<? super CharSequence> a4 = new ArrayList<>();
    }

}