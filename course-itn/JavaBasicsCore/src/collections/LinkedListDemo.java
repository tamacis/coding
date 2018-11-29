/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author cswl
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> al = new LinkedList<>();
        al.add("Apple");
        al.addAll(Arrays.asList("HP", "Dell", "Lenovo", "Acer"));
        
        System.out.println(al.get(2));
        Iterator it = al.iterator(); 
        while(it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        
        System.out.println("");
        al.remove("Apple");
        
        Comparator<Integer> fc = (x, y) -> x < y ? 1 : 0;
         
        it = al.iterator();
        while(it.hasNext()) {
            System.out.print(it.next() + "\t");
        }
        
    }
}
