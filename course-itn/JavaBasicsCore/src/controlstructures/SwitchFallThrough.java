/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlstructures;

/**
 *
 * @author cswl
 */
public class SwitchFallThrough {

    public static void main(String[] args) {
        int day = 2;
        String dName;
        switch (day) {
            case 1:
                dName = "Start of week day";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
                dName = "Week days";
                break;
            case 6:
            case 7:
                dName = "Week end";
                break;
            default:
                dName = "Unknown";
                break;
        }
        System.out.println("Today is " + dName);
    }

}
