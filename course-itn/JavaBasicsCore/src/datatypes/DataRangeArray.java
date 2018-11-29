/*
Licensed under the ISC License
 */
package datatypes;

import java.lang.reflect.Field;

/**
 * @author cswl
 */
public class DataRangeArray {

    public static void main(String[] args) {
        String[] data_classes = { // Numeric types and char types
            "Byte",
            "Short",
            "Integer",
            "Long",
            "Float",
            "Double",
            "Character"
        };

        for (String d : data_classes) {
            try {
                Field max = Class.forName("java.lang." + d).getField("MAX_VALUE");
                System.out.println(d + " Max value: " + max.get(max));
                Field min = Class.forName("java.lang." + d).getField("MIN_VALUE");
                System.out.println(d + " Min value: " + min.get(min));
                System.out.println();

            } catch (IllegalAccessException | ClassNotFoundException | NoSuchFieldException e) {
                e.printStackTrace();
            }
        }
        // Boolean has only true or false
        System.out.println("Boolean True value: " + Boolean.TRUE);
        System.out.println("Double False value: " + Boolean.FALSE);

    }
}
