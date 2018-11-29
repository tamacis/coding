/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author cswl
 */
public class MapDemo {
    public static void main(String[] args) {
        
        Map<Integer, String> m1 = new HashMap<>();
        m1.put(5, "One");
        m1.put(4, "Two");
        m1.put(3, "Three");
        m1.put(2, "Four");
        m1.put(1, "Five");
         
        // print using toString method.
         System.out.println(m1);
         
         for(Map.Entry<Integer,String> e: m1.entrySet()){
             System.out.print("Key: "+e.getKey() + " ");
             System.out.print("Value: "+e.getValue() + " \n");
         }
        System.out.println("");
         Map<String,String> m2 = new LinkedHashMap<>();
         m2.put("NP", "Nepal");
         m2.put("IN", "India");
         m2.put("PK", "Pakistan");
         m2.put("AFG", "Afganistan");
         m2.put("BG", "bangladesh");
         
         System.out.println(m2);
         // accessing using key
         System.out.println(m2.get("NP"));
         
         for(Map.Entry<String,String> entry: m2.entrySet()){
             System.out.print("Key --> "+entry.getKey());
             System.out.print("  value --> "+entry.getValue());
             System.out.println();
         }
         System.out.println("");
         
         SortedMap<String,Integer> m3 = new TreeMap<>();
         
         m3.put("Communication Skills", 104);
         m3.put("Industrial Maagement", 504);
         m3.put("Statistical Analysis", 406);
         m3.put("Database Management", 205);
         m3.put("Electronic Device", 310);
         
         System.out.println("Subject \t\t Code");
         for(Map.Entry<String,Integer> e : m3.entrySet()){
             System.out.println(e.getKey()+"\t "+e.getValue());
         }
         
    }
}
