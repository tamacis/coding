/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package multi_threading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class MultiThreading extends Thread {
   @Override
    public void run() {
       System.out.println("Another thread started.");
       System.out.println(Thread.currentThread().getName());
       try {
           Thread.sleep(500);
       } catch (InterruptedException ex) {
           Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
       }
       
   }
    public static void main(String[] args) {
        MultiThreading t1 = new MultiThreading();
        MultiThreading t2 = new MultiThreading();
        MultiThreading t3 = new MultiThreading();
    
        t1.setPriority(MIN_PRIORITY);
        t1.setPriority(NORM_PRIORITY);
        t1.setPriority(MAX_PRIORITY);
        
        t1.setName("Thread 1");
        t2.setName("Thread 2");
        t3.setName("Thread 3");
        
        t1.start();
       try {
           t1.join();
       } catch (InterruptedException ex) {
           Logger.getLogger(MultiThreading.class.getName()).log(Level.SEVERE, null, ex);
       }
        t2.start();
        t3.start();
    }
}
