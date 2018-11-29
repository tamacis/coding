/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.io.IOException;

/**
 *
 * @author cswl
 */
public class ExceptionPropogation1 {
    public void mymethod1() throws IOException {
        throw new IOException("Device error");
    }
    public void mymethod2() throws IOException {
        mymethod1();
    }
    public static void main(String[] args) {
        ExceptionPropogation1 ep1 = new ExceptionPropogation1();
        try {
            ep1.mymethod2();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Normal flow of program");
    }
}
