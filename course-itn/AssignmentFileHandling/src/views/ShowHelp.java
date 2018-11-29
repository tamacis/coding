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
public class ShowHelp {

    public static void render() {
        System.out.println(Quotify.quote(StudentActions.ADD)
                + " : to add a new student record");
        System.out.println(Quotify.quote(StudentActions.LIST)
                + " : to view list of student records");
        System.out.println(Quotify.quote(StudentActions.UPDATE)
                + " : to update a student record");
        System.out.println(Quotify.quote(StudentActions.QUIT)
                + " : to quit the program");
    }
}