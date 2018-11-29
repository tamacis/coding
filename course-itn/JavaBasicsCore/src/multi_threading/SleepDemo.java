/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package multi_threading;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

/**
 *
 * @author cswl
 */
public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("Thread priority: ");
        System.out.println("MAX: " + Thread.MAX_PRIORITY);
        
        System.out.println("MIN: " + Thread.MIN_PRIORITY);
        System.out.println("NORMAL: " + Thread.NORM_PRIORITY);
        IntStream.range(0, 10).forEach(i -> {
            try {
                System.out.print(i + " ");
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(SleepDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        });

    }
}
