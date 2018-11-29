/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

public class ArithmeticExpressionCasting {

    public static void main(String[] args) throws java.lang.Exception {

// Even though b1 and b2 are both bytes and b3, b4, b5 are declared
// as bytes.
// The rules of automatic type promotion in arithemtic expression
// will first cast or widen the bytes to int before doing the 
// arithemtic operation.. ( + - * / % )
        byte b1 = 2;

        byte b2 = 3;

//        byte b3 = b1 + b2;
//
//        byte b4 = (byte) b1 + b2; // we missed an parenthesis..

        byte b5 = (byte) (b1 + b2);

// * The expression must be contained inside a pair of opening and closing 
//   parenthesis.
// * If any of the operands are type double then the result is promoted to double.
// * Otherwise, if any of the operands are type float, then the result is promoted to float.
// * Otherwise, if any of the operands are type long, then the result is promoted to long.
// * Otherwise, if any or all of the operands are type byte, short, char, or int then 
//   the result is promoted to int.
    }
}
