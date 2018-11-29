/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import actions.StudentActions;
import libs.Quotify;

/**
 *
 * @author cswl
 */
public class InputPrompt {
    public static void render() {
        System.out.print("Enter a command: " + Quotify.quote(StudentActions.HELP)
                    + " for commands " + Quotify.quote(StudentActions.QUIT) + " to quit: ");
 
    }
}
