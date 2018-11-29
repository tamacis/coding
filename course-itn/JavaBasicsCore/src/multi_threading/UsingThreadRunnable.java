/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package multi_threading;

/**
 *
 * @author cswl
 */
public class UsingThreadRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("New thread started");
    }
    
    public static void main(String[] args) {
        System.out.println("inside main thread");
        Thread thread = new Thread(new UsingThreadRunnable());
        thread.start();
    }
    
}
