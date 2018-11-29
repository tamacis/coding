/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class FileDemo {
    public static void main(String[] args) {
        FileWriter fw = null;
        try{
        fw = new FileWriter("/tmp/f986.txt", true);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = sc.nextLine();
        System.out.println("Enter your address");
        String addr = sc.nextLine();
          fw.write(name +", " + addr  + "\n");
        } 
        catch (IOException e) {
            System.out.println("No such file");
        }
        finally {
            try {
                if(fw != null) fw.close();
            } catch (IOException ex) {
                System.out.println("Some serious error!");   
            }
        }
    }
}
