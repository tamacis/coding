/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Calendar;

/**
 *
 * @author cswl
 */
public class WelcomeMessage {

    public static void render() {
        System.out.println(greeting());
        System.out.println("Welcome to CS Student management Console.");

    }

    private static String greeting() {
        Calendar calendar = Calendar.getInstance();
        int timeOfDay = calendar.get(Calendar.HOUR_OF_DAY);
        String res = "Greetings";
        if (timeOfDay >= 0 && timeOfDay < 12) {
            res = "Good Morning";
        } else if (timeOfDay >= 12 && timeOfDay < 16) {
            res = "Good Afternoon";
        } else if (timeOfDay >= 16 && timeOfDay < 21) {
            res = "Good Evening";
        } 
        return res;
    }
}
