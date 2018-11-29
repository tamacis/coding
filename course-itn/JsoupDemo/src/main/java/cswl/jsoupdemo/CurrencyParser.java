/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.jsoupdemo;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author cswl
 */
public class CurrencyParser {
    public static Currency parse(String n, String u, String b, String s) {
        // remove any whitespace
        String name = StringUtils.strip(n);
        int unit = Integer.parseInt(StringUtils.strip(u));
        double buy = Double.parseDouble(StringUtils.strip(b));
        double sell = Double.parseDouble(StringUtils.strip(s));
        
        return new Currency(name, unit, buy, sell);
    }
}
