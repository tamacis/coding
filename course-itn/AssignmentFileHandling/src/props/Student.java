/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package props;

import dal.StudentDal;

/**
 *
 * @author cswl
 */
public class Student {

    private int id;
    private String name;
    private int roll;
    int classLevel;
    private String section;
    private String faculty;

    // Generates unique ID based on previous students
    public Student(String name, int roll, int classLevel, String section, String faculty) {
        this(name, roll, classLevel, section, faculty, StudentDal.generateUniqueID());
    }

    public Student(String name, int roll, int classLevel, String section, String faculty, int id) {
        this.id = id;
        this.name = name;
        this.roll = roll;
        this.classLevel = classLevel;
        this.section = section;
        this.faculty = faculty;
    }

    public String stringfy() {
        StringBuilder sb = new StringBuilder();
        sb.append(id);
        sb.append(", ");

        sb.append(name);
        sb.append(", ");

        sb.append(roll);
        sb.append(", ");

        sb.append(classLevel);
        sb.append(", ");

        sb.append(section);
        sb.append(", ");

        sb.append(faculty);

        return sb.toString();

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getClassLevel() {
        return classLevel;
    }

    public void setClassLevel(int classLevel) {
        this.classLevel = classLevel;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }
}
