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
public class SwitchDemo {

    public static void main(String[] args) {
        int day = 5;
        String dName;
        switch (day) {
            case 1:
                dName = "Sunday";
                break;
            case 2:
                dName = "Monday";
                break;
            case 3:
                dName = "Tuesday";
                break;
            case 4:
                dName = "Wednesday";
                break;
            case 5:
                dName = "Thursday";
                break;
            case 6:
                dName = "Friday";
                break;
            case 7:
                dName = "Saturday";
                break;
            default:
                dName = "Unknown";
        }
        System.out.println("Today is " + dName);
    }

}
