/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 *
 * @author cswl
 */
public class ArrayListDemo {

    public static void main(String[] args) {
        // non generic .. type unsafe array list
        ArrayList al = new ArrayList();
        al.add(100);
        al.add("Hello");
        al.add('A');
        al.add(100.0f);

        for (int i = 0; i < al.size(); ++i) {
            System.out.print(al.get(i) + "  ");
        }

        System.out.println("");
//        // 
//        System.out.println(al.get(0));
//        System.out.println(al.get(2));
        al.remove(3);
        for (Object o : al) {
            System.out.print(o + "  ");
        }

        System.out.println("");
       Iterator il = al.iterator();
       while(il.hasNext()) {
           
           System.out.print(il.next() + "\t");
       }
        
        System.out.println("");
        ArrayList<Integer> all = new ArrayList<>();
        all.addAll(Arrays.asList(100, 20, 30, 60, 90));

        for (int i = 0; i < all.size(); ++i) {
            System.out.print(all.get(i) + " , ");
        }
        System.out.println("");

        for (int i : all) {
            System.out.print(i + "| ");
        }

        System.out.println("");
        Iterator it = all.iterator();

        while (it.hasNext()) {
            System.out.print(it.next() + "; ");
        }
        System.out.println("");
        
        System.out.println("---------------------");
        al.addAll(all);
        al.forEach( x -> System.out.print(x + "\t"));
        System.out.println("");
        al.retainAll(all);
        al.forEach(x -> System.out.print(x + "  "));
        
    }
}
