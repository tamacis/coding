/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 *
 * @author cswl
 */
public class FileInputDemo {
    public static void main(String[] args) {
        File file = new File("/tmp/f986.txt");
        FileInputStream fis = null;
        
        try{
           fis = new FileInputStream(file); 
            int c;
            while ( (c=fis.read()) != -1 ){
                System.out.print((char) c);
            }
            
        } 
        catch (IOException e) {
            System.out.println("No such file");
        }
        finally {
            try {
                if(fis != null) fis.close();
            } catch (IOException ex) {
                System.out.println("Some serious error!");   
            }
        }
    }
}
