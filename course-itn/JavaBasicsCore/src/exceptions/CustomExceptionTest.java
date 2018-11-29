/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author cswl
 */
class InvalidAgeException extends Exception {
    InvalidAgeException(String s) {
        super(s);
    }
} 

public class CustomExceptionTest {
    static void validate(int age) throws InvalidAgeException {
        if(age < 18)
            throw new InvalidAgeException("Not valid age");
                    else
            System.out.println("Welcome to vote!");
    }
    public static void main(String[] args) {
        try {
        validate(17);
        }
        catch (InvalidAgeException ex) {
            System.out.println(ex);
        }
    }
}
