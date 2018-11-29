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
public class Tiger extends Animal {

    @Override
    public void eat() {
        System.out.println("Tiger eats flesh.");
    }

    public void hunt() {
        System.out.println("Tiger hunts for food.");
    }

    Tiger() {
        name = "Sita";
    }

    public static void main(String[] args) {
        Animal a1 = new Animal();
        System.out.println(a1.name);
        a1.eat();
        a1.breath();
        System.out.println();

        Animal a2 = new Tiger();
        System.out.println(a2.name);
        a2.eat();
        a2.breath();
//        a2.hunt();
        System.out.println();

        Tiger a3 = new Tiger();
        System.out.println(a3.name);
        a3.eat();
        a3.breath();
        a3.hunt();
        System.out.println();

// Incompatible Types
//        Tiger a4 = new Animal();

// Runtime ClassCastException
//        Tiger a5 = (Tiger) a1;
//        System.out.println(a5.name);
//        a5.eat();
        
    }
}
