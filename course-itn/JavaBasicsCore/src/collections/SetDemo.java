/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author cswl
 */
public class SetDemo {
    public static void main(String[] args) {
        System.out.println("Hashset example");
        Set<String> s1 = new HashSet<>();
        s1.add("Books");
        s1.add("Notebooks");
        s1.add("Pencils");
        s1.add("Erasers");
        s1.add("Pens");
        s1.add("Paper");
        s1.add("Books"); // repeating entry
        
       
    // the elements of hashset are not in there insertion order
        for(String s: s1){
            System.out.println(s);
        }
        
        System.out.println("Linkedhashset example");
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("Football");
        s2.add("BasketBall");
        s2.add("TennisBall");
        s2.add("TableTennisBall");
        s2.add("VolleyBall");
        System.out.println(s2);
        for(String s: s2){
            System.out.println(s);
        }
        
        System.out.println("Treeset example");
        SortedSet<String> s3 = new TreeSet<>();
        s3.add("Pakistan");
        s3.add("U.S.A");
        s3.add("Jamaica");
        s3.add("Australia");
        s3.add("Thailand");
       
       for(String e: s3){
           System.out.println(e); 
        }
        
    }
    
    
}
