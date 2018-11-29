/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backends;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import props.Student;

/**
 *
 * @author cswl
 */
public class StorageBackend {

    static final String FILE_PATH
            = "/home/cswl/learn/java/lang/course_itn/AssignmentFileHandling/src/backends/";

    static final String FILE_NAME = "students_list.csv";

    static final File backingFile = new File(FILE_PATH.concat(FILE_NAME));

    public ArrayList<String> read() {
        ArrayList<String> stds = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(backingFile))) {
            String str;
            while ((str = br.readLine()) != null) {
                stds.add(str);
            }
        } catch (IOException ex) {
            System.out.println("Error while reading to file:");
            Logger.getLogger(StorageBackend.class.getName()).log(Level.SEVERE, null, ex);
        }
        return stds;
    }

    public void save(Student s) {
        String str = s.stringfy();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(backingFile, true))) {
            if (!backingFile.exists()) {
                bw.write(str);
                bw.append(System.lineSeparator());
            } else {
                bw.append(str);
                bw.append(System.lineSeparator());
            }
        } catch (IOException ex) {
            System.out.println("Error while saving to file:");
            Logger.getLogger(StorageBackend.class.getName()).log(Level.SEVERE, null, ex);

        }
    }
}
