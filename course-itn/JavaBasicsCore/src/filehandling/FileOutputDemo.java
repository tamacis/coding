/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

/**
 *
 * @author cswl
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        File file = new File("/tmp/f986.txt");
        File dest = new File("/tmp/f986_copy.txt");
        
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try{
           fis = new FileInputStream(file); 
           fos = new FileOutputStream(dest);
            int c;
            while ( (c=fis.read()) != -1 ){
                fos.write(c);
            }
            
        } 
        catch (IOException e) {
            System.out.println("No such file");
        }
        finally {
            try {
                if(fis != null) fis.close();
                if(fos != null) fos.close();
            } catch (IOException ex) {
                System.out.println("Some serious error!");   
            }
        }
    }
}

