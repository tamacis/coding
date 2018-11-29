/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.FileInputStream;


/**
 *
 * @author cswl
 */
public class TryWithResources {
    public static void main(String[] args) {
        File file = new File("/tmp/f987.txt");
        
        try (FileInputStream fis = new FileInputStream(file)) {
            int c;
            while( (c=fis.read()) != -1) {
                System.out.print( (char) c);
            }
        } catch ( Exception e) {
            System.out.println(e);
        }
        
    }
}
