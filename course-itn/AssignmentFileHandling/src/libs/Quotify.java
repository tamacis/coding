/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libs;

/**
 *
 * @author cswl
 */
public class Quotify {
    public static String quote(String input) {
        StringBuilder sb = new StringBuilder();
        sb.append("\"");
        sb.append(input);
        sb.append("\"");
        return sb.toString();
    }   
}
