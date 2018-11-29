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
public class Dog extends Animal {
    
    @Override
    public void eat() {
        System.out.println("Dog can chew and eat.");
    }
    
    public void jump() {
        System.out.println("Dog can jump.");
    }
    
    Dog() {
        this.name = "Rambo";
    }
    
    Dog(String name) {
        this.name  = name;
    }
    
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Animal a1 = new Dog();
        
//        Dog d2 = new Animal(); not allowed

        System.out.println(d1.name);
        d1.breath();
        d1.eat();
        d1.jump();
        
        System.out.println(a1.name);
        a1.breath();
        a1.eat();
//        a1.jump(); not allowed
        
    }
}
