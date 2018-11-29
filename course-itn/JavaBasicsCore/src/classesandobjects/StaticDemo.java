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
public class StaticDemo {

    StaticDemo() {
        this.id = (int) (Math.random() * 100) + sno++;

    }

    public static int sno = 10001;

    public String productName;
    public int price;
    public int id;

    public static final String BRAND_NAME = "Apple";

    public static void display(StaticDemo s) {
        System.out.println(s.id + " " + s.productName + " " + s.price);
    }

    public void displayProd() {

        System.out.println(id + " " + productName + " " + price + " " + BRAND_NAME);
    }

    static public void main(String[] args) {

        StaticDemo s1 = new StaticDemo();
        s1.productName = "Mouse";
        s1.price = 10000;
        display(s1); // static method

        StaticDemo s2 = new StaticDemo();
        s2.productName = "Earpods";
        s2.price = 25000;

        s2.displayProd(); // non static.. method

    }
}
