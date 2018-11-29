class ShortClass {
    public static void main(String args[]) {        
        System.out.println("Class variables - constants");
        System.out.println("Number of bytes in a short: " + Short.BYTES); 
        System.out.println("Number of bits in a short: " + Short.SIZE); 
        System.out.println("Maximum value of a short: " + Short.MAX_VALUE); 
        System.out.println("Minimum value of a short: " + Short.MIN_VALUE); 
        System.out.println();

        System.out.println("Constructors");
        Short i1 = new Short((short)41); // cast a primitive int literal
        System.out.println("i1 = " + i1);
        Short i2 = new Short("41"); // String object type parameter
        System.out.println("i2 = " + i2);
        System.out.println();

        System.out.println("Common Methods");
        Short temp = 0; // autobox temp reference variable for examples 
        Short temp2 = 0; // autobox temp2 reference variable for examples 

        // byte byteValue() returns the byte as a short - may loose data if outside short bounds
        temp = 41; // autobox
        byte b = temp.byteValue();
        System.out.println("byte b = " + b);


        // static int compare(short x, short y) Compares the parameters for equality
        // returns the value of the first parameter - the second parameter. Nothing like Integer compare
        System.out.println("Short.compare((short)36, (short)36) = " + Short.compare((short)36, (short)36)); 
        System.out.println("Short.compare((short)30, (short)40) = " + Short.compare((short)30, (short)40)); 
        System.out.println("Short.compare((short)40, (short)30) = " + Short.compare((short)40, (short)30)); 
        System.out.println();

        // int compareTo(Short anotherShort) Compares the Short parameter against the current object
        // returns the value of the first parameter - the second parameter. Nothing like Integer compareTo
        temp = 35; 
        temp2 = 35; 
        System.out.println("temp.compareTo(temp2) (35 and 35) = " + temp.compareTo(temp2)); 
        temp2 = 40; 
        System.out.println("temp.compareTo(temp2) (35 and 40) = " + temp.compareTo(temp2)); 
        temp2 = 30; 
        System.out.println("temp.compareTo(temp2) (35 and 30) = " + temp.compareTo(temp2));
        System.out.println();

        // static Short decode(String nm) returns a Short value from a string
        // String parameter can be decimal, hexadecimal, or octal
        System.out.println("Short.decode(\"-328\") = " + Short.decode("-328"));
        System.out.println("Short.decode(\"0x2a\") = " + Short.decode("0x2a"));
        System.out.println("Short.decode(\"#2a\") = " + Short.decode("#2a"));
        System.out.println("Short.decode(\"0104\") = " + Short.decode("0104"));
        System.out.println();

        // double doubleValue() simply returns a primitive double from the current object
        temp = 23900;
        double d = temp.doubleValue();
        System.out.println("d = " + d);
        System.out.println();

        // boolean equals(Object obj) return true if the value of the current object is equal to the value of the parameter
        temp = 41;
        System.out.println("temp.equals((short)41) = " + temp.equals((short)41));
        System.out.println("temp.equals(41) = " + temp.equals(41));
        System.out.println();

        // float floatValue() simply returns a primitive float from the current object
        temp = 10_000;
        float f = temp.floatValue();
        System.out.println("f = " + f);
        System.out.println();

        // int hashCode() returns hashcode for the current Short object
        // returns the primitive int value represented by this Short object
        System.out.println("temp.hashCode() = " + temp.hashCode());
        System.out.println();

        // static int hashCode(short value) returns a hash code for the parameter value
        // essentially returns the save thing as the parameter - not sure of the purpose of this method
        System.out.println("Short.hashCode((short)-2399) = " + Short.hashCode((short)-2399));
        System.out.println();

        // int intValue() returns an int primitive value from the current object
        int i = temp.intValue();
        System.out.println("i = " + i);
        System.out.println();

        // long longValue() returns a long primitive value from the current object
        long longVar = temp.longValue();
        System.out.println("longVar = " + longVar);
        System.out.println();

        // static short parseShort(String s) returns a short primitive value from the String parameter
        short iParse1 = Short.parseShort("+9797");
        System.out.println("iParse1 = " + iParse1);
        System.out.println();

        // static short parseShort(String s, int radix) returns a short primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        short iParse2 = Short.parseShort("-620", 10); // base 10 decimal
        System.out.println("iParse2 = " + iParse2);
        short iParse3 = Short.parseShort("0271", 8); // base 8 octal
        System.out.println("iParse3 = " + iParse3);
        short iParse4 = Short.parseShort("-2c78", 16); // base 16 hexadecimal
        System.out.println("iParse4 = " + iParse4);
        System.out.println();

        // short shortValue() returns a short primitive value from the current object
        temp = 10_000;
        short s1 = temp.shortValue();
        System.out.println("s1 = " + s1);
        System.out.println();

        // String toString() returns a String object value from the current object
        temp = 10_000;
        String ts = temp.toString();
        System.out.println("ts = " + ts);
        System.out.println();
	
        // static String toString(short b) returns a String object value from the parameter
        String ts1 = Short.toString((short)32_767);
        System.out.println("ts1 = " + ts1);
        System.out.println();

        // static Short valueOf(short b) returns a Short object value from the primitive short parameter
        temp = Short.valueOf((short)118);
        System.out.println("temp = " + temp);
        System.out.println();

        // static Short valueOf(String s) returns a Short object value from the String parameter
        temp2 = Short.valueOf("19178");
        System.out.println("temp2 = " + temp2);
        System.out.println();

        // static Short valueOf(String s, int radix) returns a Short object value from the String parameter
        Short temp3 = Short.valueOf("1200", 10);
        System.out.println("temp3 = " + temp3);
        Short temp4 = Short.valueOf("2c13", 16);
        System.out.println("temp4 = " + temp4);
        Short temp5 = Short.valueOf("0617", 8);
        System.out.println("temp5 = " + temp5);
    }
}