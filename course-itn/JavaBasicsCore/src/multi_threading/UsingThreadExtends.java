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
public class UsingThreadExtends extends Thread {

    @Override
    public void run() {
        System.out.println("Running a thread");
        IntStream.range(0,10).forEach(i -> {

            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(UsingThreadExtends.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    public static void main(String[] args) {
        System.out.println("In main thread.");
        Thread t = new Thread(new UsingThreadExtends());
        t.start();
        IntStream.range(0, 10).forEach(i -> {

            System.out.print(i + " ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(UsingThreadExtends.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

}
