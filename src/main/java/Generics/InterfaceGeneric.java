package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* 
    Concatable takes two collections the concats it.
    We use generics to provide type bounds 
*/

@FunctionalInterface
interface Concatable<E,F> {
    void concat(Collection<? extends E> c, Collection<? extends F> d);
}

class BiMapper<E, F> implements Concatable<E, F> {

    @Override
    public void concat(Collection<? extends E> c, Collection<? extends F> d) {
        final int s = c.size();
        final int t = d.size();
        if (s != t) {
            throw new RuntimeException(
                    new UnsupportedOperationException(
                            "Cannot map over unequal lengths"));
        }
        final Iterator ic = c.iterator();
        final Iterator id = d.iterator();
        for (int i = 0; i < t; ++i) {
            System.out.println(ic.next() + " " + id.next());
        }
    }
}

public class InterfaceGeneric {

    public static void main(String[] args) {
        ArrayList<String> alS = new ArrayList<>();
        ArrayList<Number> alI = new ArrayList<>();
        alS.add("a");
        alI.add(1);
        alS.add("b");
        alI.add(2.0); // We can add any number to it.
   
        Concatable<String, Number> all = new BiMapper<>();
        all.concat(alS, alI);
    }

}
