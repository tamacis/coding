class ByteClass {
    public static void main(String args[]) {        
        System.out.println("Class variables - constants");
        System.out.println("Number of bytes in a byte: " + Byte.BYTES); 
        System.out.println("Number of bits in a byte: " + Byte.SIZE); 
        System.out.println("Maximum value of a byte: " + Byte.MAX_VALUE); 
        System.out.println("Minimum value of a byte: " + Byte.MIN_VALUE); 
        System.out.println();

        System.out.println("Constructors");
        Byte i1 = new Byte((byte)41); // cast a primitive int literal
        System.out.println("i1 = " + i1);
        Byte i2 = new Byte("41"); // String object type parameter
        System.out.println("i2 = " + i2);
        System.out.println();

        System.out.println("Common Methods");
        Byte temp = 0; // autobox temp reference variable for examples 
        Byte temp2 = 0; // autobox temp2 reference variable for examples 
        // byte byteValue() returns the value as a byte - may loose data if outside byte bounds
        temp = 41; // autobox
        byte b = temp.byteValue();
        System.out.println("byte b = " + b);
        //temp = 201; // autbox will fail if outside of bounds

        // static int compare(byte x, byte y) Compares the parameters for equality
        // returns the value of the first parameter - the second parameter. Nothing like Integer compare
        System.out.println("Byte.compare((byte)36, (byte)36) = " + Byte.compare((byte)36, (byte)36)); 
        System.out.println("Byte.compare((byte)30, (byte)40) = " + Byte.compare((byte)30, (byte)40)); 
        System.out.println("Byte.compare((byte)40, (byte)30) = " + Byte.compare((byte)40, (byte)30)); 
        System.out.println();

        // int compareTo(Byte anotherByte) Compares the Byte parameter against the current object
        // returns the value of the first parameter - the second parameter. Nothing like Integer compareTo
        temp = 35; 
        temp2 = 35; 
        System.out.println("temp.compareTo(temp2) (35 and 35) = " + temp.compareTo(temp2)); 
        temp2 = 40; 
        System.out.println("temp.compareTo(temp2) (35 and 40) = " + temp.compareTo(temp2)); 
        temp2 = 30; 
        System.out.println("temp.compareTo(temp2) (35 and 30) = " + temp.compareTo(temp2));
        System.out.println();

        // static Byte decode(String nm) returns an byte value from a string
        // String parameter can be decimal, hexadecimal, or octal
        System.out.println("Byte.decode(\"-128\") = " + Byte.decode("-128"));
        System.out.println("Byte.decode(\"0x2a\") = " + Byte.decode("0x2a"));
        System.out.println("Byte.decode(\"#2a\") = " + Byte.decode("#2a"));
        System.out.println("Byte.decode(\"0104\") = " + Byte.decode("0104"));
        System.out.println();

        // double doubleValue() simply returns a primitive double from the current object
        temp = 127;
        double d = temp.doubleValue();
        System.out.println("d = " + d);
        System.out.println();

        // boolean equals(Object obj) return true if the value of the current object is equal to the value of the parameter
        temp = 41;
        System.out.println("temp.equals((byte)41) = " + temp.equals((byte)41));
        System.out.println("temp.equals(41) = " + temp.equals(41));

        // float floatValue() simply returns a primitive float from the current object
        temp = 100;
        float f = temp.floatValue();
        System.out.println("f = " + f);
        System.out.println();

        // int hashCode() returns hashcode for the current Byte object
        // returns the primitive int value represented by this Byte object
        System.out.println("temp.hashCode() = " + temp.hashCode());
        System.out.println();

        // static int hashCode(byte value) returns a hash code for the parameter value
        // essentially returns the save thing as the parameter - not sure of the purpose of this method
        System.out.println("Byte.hashCode((byte)-23) = " + Byte.hashCode((byte)-23));
        System.out.println();

        // int intValue() returns an int primitive value from the current object
        int i = temp.intValue();
        System.out.println("i = " + i);
        System.out.println();

        // long longValue() returns a long primitive value from the current object
        long longVar = temp.longValue();
        System.out.println("longVar = " + longVar);
        System.out.println();

        // static byte parseByte(String s) returns an byte primitive value from the String parameter
        byte iParse1 = Byte.parseByte("+87");
        System.out.println("iParse1 = " + iParse1);
        System.out.println();

        // static byte parseByte(String s, int radix) returns an byte primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        byte iParse2 = Byte.parseByte("-62", 10); // base 10 decimal
        System.out.println("iParse2 = " + iParse2);
        byte iParse3 = Byte.parseByte("027", 8); // base 8 octal
        System.out.println("iParse3 = " + iParse3);
        byte iParse4 = Byte.parseByte("-2a", 16); // base 16 hexadecimal
        System.out.println("iParse4 = " + iParse4);
        System.out.println();

        // short shortValue() returns a short primitive value from the current object
        temp = 100;
        short s1 = temp.shortValue();
        System.out.println("s1 = " + s1);
        System.out.println();

        // String toString() returns a String object value from the current object
        temp = 100;
        String ts = temp.toString();
        System.out.println("ts = " + ts);
        System.out.println();
	
        // static String toString(byte b) returns a String object value from the parameter
        String ts1 = Byte.toString((byte)45);
        System.out.println("ts1 = " + ts1);
        System.out.println();

        // static Byte valueOf(byte b) returns a Byte object value from the primitive byte parameter
        temp = Byte.valueOf((byte)118);
        System.out.println("temp = " + temp);
        System.out.println();

        // static Byte valueOf(String s) returns a Byte object value from the String parameter
        temp2 = Byte.valueOf("19");
        System.out.println("temp2 = " + temp2);
        System.out.println();

        // static Byte valueOf(String s, int radix) returns a Byte object value from the String parameter
        Byte temp3 = Byte.valueOf("120", 10);
        System.out.println("temp3 = " + temp3);
        Byte temp4 = Byte.valueOf("2c", 16);
        System.out.println("temp4 = " + temp4);
        Byte temp5 = Byte.valueOf("017", 8);
        System.out.println("temp5 = " + temp5);
    }
}
