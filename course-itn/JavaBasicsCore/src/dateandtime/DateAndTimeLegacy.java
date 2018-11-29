/*
 * Copyright (c) 2018 Cswl Coldwind <cswl1337@gmail.com>
 * Licensed under the (CC BY-SA 4.0) license
 */
package dateandtime;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cswl
 */
public class DateAndTimeLegacy {

    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());

        SimpleDateFormat formats = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(formats.format(date));

        formats = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formats.format(date));
        
        formats = new SimpleDateFormat("dd-MM-yyyy hh:mm:ss");
        System.out.println(formats.format(date));
        
        formats = new SimpleDateFormat("dd-MM-yy hh:mm:ss a z");
        System.out.println(formats.format(date));
        
        formats = new SimpleDateFormat("dd MMMM, yyyy");
        System.out.println(formats.format(date));
        
    }
}
