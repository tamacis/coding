/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import inputs.CommandsEvaluator;
import views.WelcomeMessage;

/**
 *
 * @author cswl
 */
public class MangementConsole {

    public static void main(String[] args) {
        // Welcome the user
        WelcomeMessage.render();

        // Start the command 
        CommandsEvaluator.start();

    }

}
