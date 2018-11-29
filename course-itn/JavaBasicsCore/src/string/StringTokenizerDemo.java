/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string;

import java.util.StringTokenizer;

/**
 *
 * @author cswl
 */
public class StringTokenizerDemo {

    public static void main(String[] args) {
        String line = "Java,class,,for,beginners";
        String[] words = line.split(",");
        for (String s : words) {
            System.out.print(s + "--");

        }
        System.out.println("");
        
        String delim = ",";
        StringTokenizer st = new StringTokenizer(line, delim);
        
        while(st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
