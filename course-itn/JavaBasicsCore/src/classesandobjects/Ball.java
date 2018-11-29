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
public class Ball {

    // state
    // member variable or instance variable
    int airpressure;
    String color;
    int radius = 7;

    // behaviour 
    // method
    public void showBall() {
        System.out.println("Color: " + color);
        System.out.println("Airpressure: " + airpressure);
        System.out.println("Size: " + radius);
    }

    // default constructor
    public Ball() {

    }

    // constructor
    public Ball(String c, int a) {
        this.airpressure = a;
        this.color = c;
    }

    public static void main(String[] args) {
        Ball b1 = new Ball();
        b1.color = "Red";
        b1.airpressure = 80;
        System.out.println("Ball b1: ");
        b1.showBall();

        System.out.println();

        Ball b2 = new Ball("Blue", 85);
        System.out.println("Ball b2");
        b2.showBall();
        System.out.println();

        // Refrence variable only points to object
        // b is just another alias for the object
        Ball b = b1;
        b1 = null;
//      System.out.println(b1.color); // will throw an NullPointerException
        System.out.println(b.color);

        // Object can also be constructed without refrence
        System.out.println((new Ball()).radius);
    }
}
