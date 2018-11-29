/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author cswl
 */
public class OverloadingDemo {

    public void sum(int a, int b) {
        System.out.println("Int: The sum of " + a + " and " + b + " is " + (a + b));
    }
//   
//    public int sum(int x, int y) {
//    return x+y;
//    }

    void sum(int a, byte b) {
        System.out.println("Byte: The sum of " + a + " and " + b + " is " + (a + b));
    }

    void sum(float f, float g) {
        System.out.println("Float: The sum of " + f + " and " + g + " is " + (f + g));
    }

    void sum(double s, double t) {
        System.out.println("Double: The sum of " + s + " and " + t + " is " + (s + t));
    }

    void sum(String x, String y) {
        System.out.println("The concat operation results in: " + (x + y));
    }

    public static void main(String[] args) {
        OverloadingDemo od = new OverloadingDemo();
        od.sum(10, 15);
        od.sum(100, (byte) 12);
        od.sum(12.33f, 19.20f);
        od.sum(100.53, 299.12);
        od.sum("Apple", "Ball");
    }
}
