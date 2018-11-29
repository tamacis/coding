class IntegerClass {
    public static void main(String args[]) {        
        System.out.println("Class variables - constants");
        System.out.println("Number of bytes in an int: " + Integer.BYTES); 
        System.out.println("Number of bits in an int: " + Integer.SIZE); 
        System.out.println("Maximum value of an int: " + Integer.MAX_VALUE); 
        System.out.println("Minimum value of an int: " + Integer.MIN_VALUE); 
        System.out.println();

        System.out.println("Constructors");
        Integer i1 = new Integer(41); // primitive int type parameter
        System.out.println("i1 = " + i1);
        Integer i2 = new Integer("41"); // String object type parameter
        System.out.println("i2 = " + i2);
        System.out.println();

        System.out.println("Common Methods");
        Integer temp = 0; // autobox temp reference variable for examples 
        Integer temp2 = 0; // autobox temp2 reference variable for examples 

        // byte byteValue() returns the value as a byte - may loose data if outside byte bounds
        temp = 41; // autobox
        byte b = temp.byteValue();
        System.out.println("byte b = " + b);
        temp = 201; 
        b = temp.byteValue(); // oops, lost data
        System.out.println("byte b = (lost data) " + b);
        System.out.println();

        // static int compare(int x, int y) Compares the parameters for equality
        // returns 0 if equal, if x < y then -1, if x > y then 1
        System.out.println("Integer.compare(36, 36) = " + Integer.compare(36, 36)); 
        System.out.println("Integer.compare(30, 40) = " + Integer.compare(30, 40)); 
        System.out.println("Integer.compare(40, 30) = " + Integer.compare(40, 30)); 
        System.out.println();

        // int compareTo(Integer anotherInteger) Compares the Integer parameter against the current object
        // returns 0 if equal, if current object < parameter then -1, if currentobject > parameter then 1
        temp = 35; 
        temp2 = 35; 
        System.out.println("temp.compareTo(temp2) (35 and 35) = " + temp.compareTo(temp2)); 
        temp2 = 40; 
        System.out.println("temp.compareTo(temp2) (35 and 40) = " + temp.compareTo(temp2)); 
        temp2 = 30; 
        System.out.println("temp.compareTo(temp2) (35 and 30) = " + temp.compareTo(temp2));
        System.out.println();

        // static Integer decode(String nm) returns an int value from a string
        // String parameter can be decimal, hexadecimal, or octal
        System.out.println("Integer.decode(\"-4343\") = " + Integer.decode("-4343"));
        System.out.println("Integer.decode(\"0xFF\") = " + Integer.decode("0xFF"));
        System.out.println("Integer.decode(\"#FF\") = " + Integer.decode("#FF"));
        System.out.println("Integer.decode(\"0104\") = " + Integer.decode("0104"));
        System.out.println();

        // double doubleValue() simply returns a primitive double from the current object
        temp = 1_000_000;
        double d = temp.doubleValue();
        System.out.println("d = " + d);
        System.out.println();

        // boolean equals(Object obj) separate tutorial
	
        // float floatValue() simply returns a primitive float from the current object
        temp = 1_000_000;
        float f = temp.floatValue();
        System.out.println("f = " + f);
        System.out.println();

        // static Integer getInteger(String nm) separate tutorial - Gotcha! episode
        // int hashCode() returns hashcode for the current Integer object
        // returns the primitive int value represented by this Integer object
        System.out.println("temp.hashCode() = " + temp.hashCode());
        System.out.println();

        // static int hashCode(int value) returns a hash code for the parameter value
        // essentially returns the save thing as the parameter - not sure of the purpose of this method
        System.out.println("Integer.hashCode(8723) = " + Integer.hashCode(8723));
        System.out.println();

        // int intValue() returns an int primitive value from the current object
        int i = temp.intValue();
        System.out.println("i = " + i);
        System.out.println();

        // long longValue() returns a long primitive value from the current object
        long longVar = temp.longValue();
        System.out.println("longVar = " + longVar);
        System.out.println();

        // static int parseInt(String s) returns an int primitive value from the String parameter
        int iParse1 = Integer.parseInt("+2015");
        System.out.println("iParse1 = " + iParse1);
        System.out.println();

        // static int parseInt(String s, int radix) returns an int primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        int iParse2 = Integer.parseInt("-11567", 10); // base 10 decimal
        System.out.println("iParse2 = " + iParse2);
        int iParse3 = Integer.parseInt("027", 8); // base 8 octal
        System.out.println("iParse3 = " + iParse3);
        int iParse4 = Integer.parseInt("-FF", 16); // base 16 hexadecimal
        System.out.println("iParse4 = " + iParse4);
        System.out.println();

        // static int parseUnsignedInt(String s) returns an int primitive value from the String parameter
        int iParse5 = Integer.parseUnsignedInt("2001");
        System.out.println("iParse5 = " + iParse5);
        System.out.println();

        // static int parseUnsignedInt(String s, int radix) returns an int primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        int iParse6 = Integer.parseUnsignedInt("75", 10); // base 10 decimal
        System.out.println("iParse6 = " + iParse6);
        int iParse7 = Integer.parseUnsignedInt("011", 8); // base 8 octal
        System.out.println("iParse7 = " + iParse7);
        int iParse8 = Integer.parseUnsignedInt("aC", 16); // base 16 hexadecimal
        System.out.println("iParse8 = " + iParse8);
        System.out.println();

        // static int remainderUnsigned(int dividend, int divisor) essentially what the % operator does
        System.out.println("Integer.remainderUnsigned(15, 6) = " + Integer.remainderUnsigned(15, 6)); 
        System.out.println();

        // static int reverse(int i) doesn't return 4321 from 1234
        // returns int value by reversing the order of the bits in the two's complement representation 
        // don't worry about this method
        System.out.println("Integer.reverse(1) = " + Integer.reverse(1));
        System.out.println();

        // short shortValue() returns a short primitive value from the current object
        temp = 10_000;
        short s1 = temp.shortValue();
        System.out.println("s1 = " + s1);
        System.out.println();

        // static String toBinaryString(int i) returns a String object in binary format
        System.out.println("Integer.toBinaryString(255) = " + Integer.toBinaryString(255));
        System.out.println();
	
        // static String toHexString(int i) returns a String object in hexadecimal format
        System.out.println("Integer.toHexString(255) = " + Integer.toHexString(255));
        System.out.println();
	
        // static String toOctalString(int i) returns a String object in octal format
        System.out.println("Integer.toOctalString(255) = " + Integer.toOctalString(255));
        System.out.println();

        // String toString() returns a String object value from the current object
        temp = 10_000;
        String ts = temp.toString();
        System.out.println("ts = " + ts);
        System.out.println();
	
        // static String toString(int i) returns a String object value from the parameter
        String ts1 = Integer.toString(45);
        System.out.println("ts1 = " + ts1);
        System.out.println();

        // static String toString(int i, int radix) returns a String object value from the parameter
        // the radix parameter is essentially what base numbering system to use
        String ts2 = Integer.toString(255, 10);
        System.out.println("ts2 = " + ts2);
        String ts3 = Integer.toString(255, 16);
        System.out.println("ts3 = " + ts3);
        String ts4 = Integer.toString(255, 8);
        System.out.println("ts4 = " + ts4);
        System.out.println();

        // static Integer valueOf(int i) returns a Integer object value from the primitive int parameter
        temp = Integer.valueOf(918);
        System.out.println("temp = " + temp);
        System.out.println();

        // static Integer valueOf(String) returns a Integer object value from the String parameter
        temp2 = Integer.valueOf("8675309");
        System.out.println("temp2 = " + temp2);
        System.out.println();

        // static Integer valueOf(String, int radix) returns a Integer object value from the String parameter
        Integer temp3 = Integer.valueOf("255", 10);
        System.out.println("temp3 = " + temp3);
        Integer temp4 = Integer.valueOf("FF", 16);
        System.out.println("temp4 = " + temp4);
        Integer temp5 = Integer.valueOf("011", 8);
        System.out.println("temp5 = " + temp5);
    }
}

