/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputs;

import actions.StudentActions;
import backends.StorageBackend;
import dal.StudentDal;
import java.util.ArrayList;
import java.util.Scanner;
import props.Student;
import views.InputPrompt;
import views.ShowHelp;
import views.StudentTable;

/**
 *
 * @author cswl
 */
public class CommandsEvaluator {


    public static void start() {
        
        Scanner sc = new Scanner(System.in);
        CommandsEvaluator cl = new CommandsEvaluator();
        String input;

        do {
            InputPrompt.render();
            
            input = sc.nextLine().toLowerCase();
            
            if (input.equals(StudentActions.HELP)) {
                ShowHelp.render();
            } else if (input.equals(StudentActions.ADD)) {
                InputManager im = new InputManager();
                
                StorageBackend sctrl = new StorageBackend();
                Student s = im.addStudent(sc);
                sctrl.save(s);
            } else if (input.equals(StudentActions.LIST)) {
                
                ArrayList<Student> as = StudentDal.getStudents(); 
                StudentTable.render(as);
                
                }
        } while (!input.equals(StudentActions.QUIT));
    }
}
