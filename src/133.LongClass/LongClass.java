class LongClass {
    public static void main(String args[]) {        
        System.out.println("Class variables - constants");
        System.out.println("Number of bytes in a long: " + Long.BYTES); 
        System.out.println("Number of bits in a long: " + Long.SIZE); 
        System.out.println("Maximum value of a long: " + Long.MAX_VALUE); 
        System.out.println("Minimum value of a long: " + Long.MIN_VALUE); 
        System.out.println();

        System.out.println("Constructors");
        Long i1 = new Long(41); // primitive long type parameter
        System.out.println("i1 = " + i1);
        Long i2 = new Long("41"); // String object type parameter
        System.out.println("i2 = " + i2);
        System.out.println();

        System.out.println("Common Methods");
        Long temp = 0L; // autobox temp reference variable for examples 
        Long temp2 = 0L; // autobox temp2 reference variable for examples 

        // byte byteValue() returns the value as a byte - may loose data if outside byte bounds
        temp = 41L; // autobox
        byte b = temp.byteValue();
        System.out.println("byte b = " + b);
        temp = 21_999L; 
        b = temp.byteValue(); // oops, lost data        
        System.out.println("byte b = (lost data) " + b);
        System.out.println();

        // static int compare(long x, long y) Compares the parameters for equality
        // returns 0 if equal, if x < y then -1, if x > y then 1
        System.out.println("Long.compare(36, 36) = " + Long.compare(36, 36)); 
        System.out.println("Long.compare(30, 40) = " + Long.compare(30, 40)); 
        System.out.println("Long.compare(40, 30) = " + Long.compare(40, 30)); 
        System.out.println();

        // int compareTo(Long anotherLong) Compares the Long parameter against the current object
        // returns 0 if equal, if current object < parameter then -1, if currentobject > parameter then 1
        temp = 35L; 
        temp2 = 35L; 
        System.out.println("temp.compareTo(temp2) (35 and 35) = " + temp.compareTo(temp2)); 
        temp2 = 40L; 
        System.out.println("temp.compareTo(temp2) (35 and 40) = " + temp.compareTo(temp2)); 
        temp2 = 30L; 
        System.out.println("temp.compareTo(temp2) (35 and 30) = " + temp.compareTo(temp2));
        System.out.println();

        // static Long decode(String nm) returns an Long value from a string
        // String parameter can be decimal, hexadecimal, or octal
        System.out.println("Long.decode(\"-4343\") = " + Long.decode("-4343"));
        System.out.println("Long.decode(\"0xFF\") = " + Long.decode("0xFF"));
        System.out.println("Long.decode(\"#FF\") = " + Long.decode("#FF"));
        System.out.println("Long.decode(\"0104\") = " + Long.decode("0104"));
        System.out.println();

        // double doubleValue() simply returns a primitive double from the current object
        temp = 1_000_000_000_123L;
        double d = temp.doubleValue();
        System.out.println("d = " + d);
        System.out.println();

        // boolean equals(Object obj) 
        temp = 98_333_555L;
        System.out.println("temp.equals(98_333_555L) = " + temp.equals(98_333_555L));
        System.out.println("temp.equals((long)98_333_555) = " + temp.equals((long)98_333_555));
        System.out.println("temp.equals(98_333_555) = " + temp.equals(98_333_555));
        System.out.println();
	
        // float floatValue() simply returns a primitive float from the current object - may loose data if outside byte bounds
        temp = 1_000_000L;
        float f = temp.floatValue();
        System.out.println("f = " + f);
        System.out.println();

        // static Long getLong(String nm) separate tutorial - Watch Gotcha! episode 2
        // getLong will not do what you might expect!
        //Episode 2 is about the Integer getInteger(String nm) method, but they do the exact same thing.

        // int hashCode() returns hashcode for the current Long object
        // returns the primitive int value represented by this Long object - possible data loss!
        System.out.println("temp.hashCode() = " + temp.hashCode());
        System.out.println();

        // static int hashCode(long value) returns a hash code for the parameter value - possible data loss!
        // essentially returns the same thing as the parameter - not sure of the purpose of this method
        System.out.println("Long.hashCode(300_000_000_000L) = " + Long.hashCode(300_000_000_000L));
        System.out.println("Long.hashCode(300_000_000L) = " + Long.hashCode(300_000_000L));
        System.out.println();

        // int intValue() returns an int primitive value from the current object - may loose data if outside byte bounds
        int i = temp.intValue();
        System.out.println("i = " + i);
        System.out.println();

        // long longValue() returns a long primitive value from the current object
        long longVar = temp.longValue();
        System.out.println("longVar = " + longVar);
        System.out.println();

        // static long parseLong(String s) returns an long primitive value from the String parameter
        long iParse1 = Long.parseLong("11987");
        System.out.println("iParse1 = " + iParse1);
        System.out.println();

        // static long parseLong(String s, int radix) returns an long primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        long iParse2 = Long.parseLong("-11567", 10); // base 10 decimal
        System.out.println("iParse2 = " + iParse2);
        long iParse3 = Long.parseLong("027", 8); // base 8 octal
        System.out.println("iParse3 = " + iParse3);
        long iParse4 = Long.parseLong("-FF", 16); // base 16 hexadecimal
        System.out.println("iParse4 = " + iParse4);
        System.out.println();

        // static long parseUnsignedLong(String s) returns an long primitive value from the String parameter
        long iParse5 = Long.parseUnsignedLong("2001");
        System.out.println("iParse5 = " + iParse5);
        System.out.println();

        // static long parseUnsignedLong(String s, int radix) returns an long primitive value from the String parameter
        // the radix parameter is essentially what base numbering system to use
        long iParse6 = Long.parseUnsignedLong("75", 10); // base 10 decimal
        System.out.println("iParse6 = " + iParse6);
        long iParse7 = Long.parseUnsignedLong("011", 8); // base 8 octal
        System.out.println("iParse7 = " + iParse7);
        long iParse8 = Long.parseUnsignedLong("aC", 16); // base 16 hexadecimal
        System.out.println("iParse8 = " + iParse8);
        System.out.println();

        // static long remainderUnsigned(long dividend, long divisor) essentially what the % operator does
        System.out.println("Long.remainderUnsigned(15, 6) = " + Long.remainderUnsigned(15, 6)); 
        System.out.println();

        // static long reverse(long i) doesn't return 4321 from 1234
        // returns long value by reversing the order of the bits in the two's complement representation 
        // don't worry about this method
        System.out.println("Long.reverse(1) = " + Long.reverse(1));
        System.out.println();

        // short shortValue() returns a short primitive value from the current object - possible data loss
        temp = 10_000L;
        short s1 = temp.shortValue();
        System.out.println("s1 = " + s1);
        System.out.println();

        // static String toBinaryString(long i) returns a String object in binary format
        System.out.println("Long.toBinaryString(255) = " + Long.toBinaryString(255));
        System.out.println();
	
        // static String toHexString(long i) returns a String object in hexadecimal format
        System.out.println("Long.toHexString(255) = " + Long.toHexString(255));
        System.out.println();
	
        // static String toOctalString(long i) returns a String object in octal format
        System.out.println("Long.toOctalString(255) = " + Long.toOctalString(255));
        System.out.println();

        // String toString() returns a String object value from the current object
        temp = 10_000L;
        String ts = temp.toString();
        System.out.println("ts = " + ts);
        System.out.println();
	
        // static String toString(long i) returns a String object value from the parameter
        String ts1 = Long.toString(45);
        System.out.println("ts1 = " + ts1);
        System.out.println();

        // static String toString(long i, int radix) returns a String object value from the parameter
        // the radix parameter is essentially what base numbering system to use
        String ts2 = Long.toString(255, 10);
        System.out.println("ts2 = " + ts2);
        String ts3 = Long.toString(255, 16);
        System.out.println("ts3 = " + ts3);
        String ts4 = Long.toString(255, 8);
        System.out.println("ts4 = " + ts4);
        System.out.println();

        // static Long valueOf(long i) returns a Long object value from the primitive long parameter
        temp = Long.valueOf(918);
        System.out.println("temp = " + temp);
        System.out.println();

        // static Long valueOf(String) returns a Long object value from the String parameter
        temp2 = Long.valueOf("8675309");
        System.out.println("temp2 = " + temp2);
        System.out.println();

        // static Long valueOf(String, int radix) returns a Long object value from the String parameter
        Long temp3 = Long.valueOf("255", 10);
        System.out.println("temp3 = " + temp3);
        Long temp4 = Long.valueOf("FF", 16);
        System.out.println("temp4 = " + temp4);
        Long temp5 = Long.valueOf("011", 8);
        System.out.println("temp5 = " + temp5);
    }
}

