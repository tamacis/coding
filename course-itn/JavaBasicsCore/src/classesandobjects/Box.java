/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class Box {

    public int length;
    public int breadth;
    public int height = 5; // default value;
    public static final String material = "paper";

    public Box() { // default constructor 
        length = 5;
        breadth = 5;
        height = 10;
    }

    public Box(int l, int b, int h) {
        length = l;
        breadth = b;
        height = h;
    }

    public void showVolume() {
        System.out.println("The volume of box is: "
                + (length * breadth * height));
    }
    public void showVolume(String id) {
        
        System.out.println("The volume of box " + id +" is: "
                + (length * breadth * height));
    }

    public static void main(String[] args) {
        Box b1; // refrence variable to Box object
        b1 = new Box(); // instanciating an Box object
        Scanner sc = new Scanner(System.in);
        System.out.println("The boxes are made from " + Box.material);
        System.out.println("Enter length, breadth and height.");
        b1.length = sc.nextInt();
        b1.breadth = sc.nextInt();
        b1.height = sc.nextInt();
        b1.showVolume();

        Box b2 = new Box();

        Box b3 = b2; // using b3 refrrence to hold Box object from b2
        b2 = null;
        b3.length = 10;
        b3.breadth = 20;

        b3.showVolume();

        Box b4 = new Box(10, 15, 15);
        b4.showVolume("b4");

    }
}
