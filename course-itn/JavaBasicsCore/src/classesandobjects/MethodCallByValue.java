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
public class MethodCallByValue {
    public int a = 5;
    
    public void change(int a) {
        a = 10;
    }
    
    public static void main(String[] args) {
        MethodCallByValue m = new MethodCallByValue();
        m.change(m.a);
        System.out.println(m.a);
    }
}
