/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package typecasting;

/**
 *
 * @author cswl
 */
public class DecimalPointScientificNotation {

    public static void main(String[] args) {
        // Decimal point are implicilty converted to 
        // scientific form.. or exponenital form unless 
        // explicilty casted

        int i = 2_147_483_647;
        long L = 9_223_372_036_854_775_807L;
        float f1 = 0.0F;
        double d1 = 0.0D;

        System.out.println("----float ----");
        f1 = i;
        System.out.println("Assignment from int: " + f1);
        f1 = i;
        System.out.println("Assignment from int: " + (int) f1);

        System.out.println("----double ----");
        d1 = L;
        System.out.println("Assignment from long: " + d1);
        d1 = L;
        System.out.println("Assignment from long: " + (long) d1);
    }
}
