/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package dateandtime;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Year;

/**
 *
 * @author cswl
 */
public class LocalDateDemo {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        
        LocalDate ld1 = LocalDate.of(1902, Month.MARCH, 8);
        System.out.println(ld1);
        
        boolean leapyear = LocalDate.of(2016, 1 , 1).isLeapYear();
        System.out.println("");
        
        Clock c = Clock.systemDefaultZone();
        System.out.println(c);
        
        LocalTime lt = LocalTime.now(c);
        System.out.println(lt);
        
        LocalTime t = LocalTime.parse("12:38:10");
        System.out.println(Year.now(c));
                
        
    }
}
