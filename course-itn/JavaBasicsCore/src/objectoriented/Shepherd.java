/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectoriented;

/**
 *
 * @author cswl
 */
public class Shepherd extends Dog {

    String color;

    public void run() {
        System.out.println("Shepherd can run.");
    }

    public void bark() {
        System.out.println("Shepherd can bark");
    }

    Shepherd(String name, String color) {
        super(name);
        this.color = color;
    }

    public static void main(String[] args) {
        Shepherd s1 = new Shepherd("Bruno", "Brown");
        System.out.println(s1.name + " is color of " + s1.color);

        s1.eat();
        s1.breath();
        s1.jump();
        s1.bark();
        s1.run();
    }
}
