/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class NullPointerDemo {

    public static void main(String[] args) {
        String msg = "Hello";

        try {
            char c = msg.charAt(5);
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        String txt = null;

        try {
            char c = txt.charAt(5);
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Some last minute house keeping/ closing resources");
        }

        try {
            // Checked exceptions
            Class.forName("test");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(NullPointerDemo.class.getName()).log(Level.SEVERE, null, ex);
        }

        //number format exception
        try {
            int i = Integer.parseInt("abc");
            System.out.println(i);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }

    }
}
