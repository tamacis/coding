/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class BufferedDemo {

    public static void main(String[] args) {
        File rFile = new File("/tmp/f987.txt");
        File wFile = new File("/tmp/copy_f987.txt");

        BufferedReader br = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        FileWriter fw = null;

        try {
            fr = new FileReader(rFile);
            fw = new FileWriter(wFile);

            bw = new BufferedWriter(fw);
            br = new BufferedReader(fr);

            String str;
            int lineNo = 0;

            while ((str = br.readLine()) != null) {
                lineNo++;
                if (lineNo == 1) {
                    bw.write(lineNo + ": " + str);
                } else {
                    bw.append(lineNo + ": " + str);
                }
                bw.append(System.lineSeparator());
            }

        } catch (IOException e) {
            System.out.println(e);
        } finally {
            try {
                bw.close();
                br.close();
                fw.close();
                fr.close();
            } catch (IOException ex) {
                Logger.getLogger(BufferedDemo.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
}
