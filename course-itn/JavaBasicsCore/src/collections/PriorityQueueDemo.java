/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 *
 * @author cswl
 */
public class PriorityQueueDemo {
    
    public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<>(5);
        
        pq.add("Apple");
        pq.add("Orange");
        pq.add("Mango");
        pq.add("Grapes");
        pq.add("Banana");
        pq.add("Guava2");
        pq.add("Guava3"); // generates exception if it fails to add an element
        pq.offer("Guava1"); // returns null value if it fails to add an element
       
        Iterator it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");  
        }
        
        // remove from queue
        pq.remove("Mango");
        pq.remove(); // removes an element from queue head
        pq.remove();
        System.out.println("\n\nAfter removing from queue");
        it = pq.iterator();
        while(it.hasNext()){
            System.out.print(it.next() + " ");  
        }
        System.out.println("\n\nCurrent queue head: " + pq.poll());
        // pq.poll();  // poll removes after retrival
        // to retrieve only 
        System.out.print(pq.peek());


    }
}
