/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class FileSizeandContentsDemo  {

    public static void main(String[] args) throws FileNotFoundException {
        // We're on the project root dir.
        File f = new File("src/java.txt");
        System.out.println("The size of the file is:" + f.length());
        System.out.println("Contents of the file is");
        
        // Ideally we'd use try catch/with.. but we are assured we have the file
        Scanner input = new Scanner(f);

        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
}
