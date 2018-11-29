/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.File;

/**
 *
 * @author cswl
 */
public class FileTest {
    public static void main(String[] args) {
        String fname = "/tmp";
        
        // Pass the filename or directory name to file object
        File f = new File(fname);
        
        // apply File class methods on File Object
        System.out.println("File name: " + f.getName());
        System.out.println("Path:" + f.getPath());
        System.out.println("Absolute path:" + f.getAbsolutePath());
        System.out.println("Parent: " + f.getParent());
        System.out.println("Exists: " + f.exists());
        if(f.exists()) {
            System.out.println("Is writeale: " + f.canWrite());
            System.out.println("Is readable: " + f.canRead());
            System.out.println("Is a directory: " + f.isDirectory());
            System.out.println("File size in bytes: " + f.length());
        }
        if(f.isDirectory()) {
            String files[] = f.list();
            for(String s: files) {
                System.out.println(s);
            }
        }
               
    }
}
