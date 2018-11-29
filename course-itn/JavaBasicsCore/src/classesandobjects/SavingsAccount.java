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
public class SavingsAccount extends BankAccount{
    
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        b1.accNo = 1913123; //public access
        b1.accType = "Savings account"; // protected access
        b1.name = "Taylor"; // default access
//      b1.amount;  // because private member doesnt have access outside class

        b1.showAcc(); //public
        System.out.println();
        b1.showProtAcc(); // protected
    }
}
