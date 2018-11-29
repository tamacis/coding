class IntegerEquals {
    public static void main(String args[]) {
        Integer ref1 = new Integer(419);
        Integer ref2 = new Integer("419");
        Integer ref3 = 419;        
        System.out.println("ref1.equals(ref2) = " + ref1.equals(ref2));
        System.out.println("ref1.equals(ref3) = " +ref1.equals(ref3 )); 
        System.out.println("ref1.equals(419) = " +ref1.equals(419));
        System.out.println("ref1.equals(612) = " +ref1.equals(612));

        System.out.println("");

        Integer r1 = new Integer(419);
        Integer r2 = new Integer(419);
        Integer r3 = r1;
        System.out.println("r1 == r2 " + (r1 == r2)); 
        System.out.println("r1 == r3 " + (r1 == r3)); 

        System.out.println("");
        
        Integer i1 = 127;
        Integer i2 = 127;
        System.out.println("i1 == i2 " + (i1 == i2)); 
        Integer i3 = 128;
        Integer i4 = 128;
        System.out.println("i3 == i4 " + (i3 == i4)); 


        Integer i5 = new Integer(127);
        Integer i6 = new Integer(127);
        System.out.println("i5 == i6 " + (i5 == i6)); 
        Integer i7 = new Integer(128);
        Integer i8 = new Integer(128);
        System.out.println("i7 == i8 " + (i7 == i8)); 

        System.out.println();        
        System.out.println("i1 == 127 " + (i1 == 127)); 
        System.out.println("i3 == 128 " + (i3 == 128)); 
        Integer tricky = 8675309;
        System.out.println("tricky == 8675309 " + (tricky == 8675309)); // auto-unbox
    }
}
