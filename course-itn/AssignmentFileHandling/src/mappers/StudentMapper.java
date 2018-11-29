/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mappers;

import java.util.logging.Level;
import java.util.logging.Logger;
import props.Student;

/**
 *
 * @author cswl
 */
public class StudentMapper {

    public static final String NAME = "Name";
    public static final String ROLL = "Roll";

    public static final String CLASS = "Class";
    public static final String SECTION = "Section";
    public static final String FACULTY = "Faculty";

   public static Student parse(String[] st) {
        boolean success = false;
        int id = 0;
        String name = null;
        int roll = 0;
        int classLevel = 0;
        String section = null;
        String faculty = null;

        try {
            id = Integer.parseInt(st[0]);
            name = st[1];
            roll = Integer.parseInt(st[2]);
            classLevel = Integer.parseInt(st[3]);
            section = st[4];
            faculty = st[5];
            success = true;
        } catch (NumberFormatException ex) {
            System.out.println("Some serious error in the saved file.");
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);

        }

        if (success) {
            return new Student(name, roll, classLevel, section, faculty, id);
        } else {
            return null;
        }
    }
}
