/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.jsoupdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cswl
 */
public class NetworkingDemo {

    public static void main(String[] args) {

        String url = "https://www.nrb.org.np/";

        URL wbsite = null;
        BufferedReader br = null;
        try {
            wbsite = new URL(url);

            URLConnection connection = wbsite.openConnection();

            br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream())
            );
            String line = null;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            Logger.getLogger(NetworkingDemo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(NetworkingDemo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
}
