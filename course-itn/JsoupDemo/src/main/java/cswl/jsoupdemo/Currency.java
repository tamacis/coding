/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cswl.jsoupdemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 *
 * @author cswl
 */
@AllArgsConstructor
public class Currency {

    @Getter
    private String name;
    @Getter
    private int unit;
    @Getter
    private double buyValue;
    @Getter
    private double sellValue;

    private final String toStringFmt = "| %-30s | %-4d | %-6.2f | %-6.2f |";
    
    @Override
    public String toString() {
        return String.format(toStringFmt, name, unit, buyValue, sellValue);
    }
}
