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
public class BankAccount {

    public int accNo; // accessible from import 
    protected String accType; // package or inherited subclass
    String name; // default access: package only
    private double amount; // private: accessible only from class

    public void showAcc() {
        System.out.println("Acc No: " + accNo);
        System.out.println("Name: " + name);
    }

    protected void showProtAcc() {
        System.out.println("Acc No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Acc Type: " + accType);
    }
    
    private void showAllDetails() {
        System.out.println("Acc No: " + accNo);
        System.out.println("Name: " + name);
        System.out.println("Acc Type: " + accType);
        System.out.println("Amount: " + amount);
    }
    
    
    void withDrawl(double a) {
        amount = amount - a;
    }
    
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.accNo = 12312214;
        acc.name = "Ellie";
        acc.accType = "Current Account";
        acc.amount = 1000.00;
        
        acc.showAllDetails(); // access to private members
    }
}
