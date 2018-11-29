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
public class FactTry {

    int fact(int res, int a) {
        if (a == 1) {
            return res;
        } else {
            return fact(res * a, --a);
        }
    }
    
    int factOverflow(int a) {
        
        int i = 1;
        if (a == 1) {
            return i;
        }
        else {
        i = i * a;
        return factOverflow(--a); 
        }
    }

    public static void main(String[] args) {
        FactTry f1 = new FactTry();

        System.out.println("Factorial of 5 is " + f1.fact(1, 5));
        System.out.println("Factorial of 10 is " + f1.fact(1, 10));
    }
}
