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

enum Course {
    JAVA, PHP, PYTHON, JS;
    
    public void newMethod() {
        System.out.println(PHP);
        System.out.println(JS);
    }
}

public class EnumDemo {
    public static void main(String[] args) {
        Course c1 = Course.JAVA;
        Course c2 = Course.PYTHON;
        
        System.out.println(c1);
        System.out.println(c2);
        
        c1.newMethod();
    }
}
