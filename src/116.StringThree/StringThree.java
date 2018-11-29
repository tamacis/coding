class StringThree {
    public static void main(String args[]) {
        for (int i = 99; i > 0; i--) {
      	        System.out.println( i + " bottles of beer on the wall " + i + new String(" bottles of beer. Take one down, pass it around ...") );
        } 
        System.out.println("\n-------");
        String s1 = "TEST";	
        String s2 = "TEST";
        String s3 = new String("TEST");
        String s4 = new String("TEST");
        String s5 = new String("TEST").intern();

        System.out.println("s1 == s2 " + (s1 == s2) );
        System.out.println("s3 == s1 " + (s3 == s1) );
        System.out.println("s3 == s4 " + (s3 == s4) );
        System.out.println("s5 == s1 " + (s5 == s1) );
        System.out.println("s5 == s2 " + (s5 == s2) );

    }
}