/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author cswl
 */
public class BufferPractice {

    public static void main(String[] args) {
        try (Scanner s = new Scanner(
                new BufferedReader(
                        new FileReader("/tmp/f987.txt")))) {
            s.useDelimiter(System.lineSeparator());
            while (s.hasNext()) {
                System.out.println(s.next());
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
