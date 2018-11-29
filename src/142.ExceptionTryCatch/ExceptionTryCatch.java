class ExceptionTryCatch {
    public static void main(String args[]) {
        for(String temp : args) {
            tripleIt(temp);
        }        
    }

    static void tripleIt(String s) {
        // Integer i = Integer.valueOf(s);
        // System.out.println("Triple the value of " + i + " is: " + (i*3));

        try {
            Integer i = Integer.valueOf(s);
            System.out.println("Triple the value of " + i + " is: " + (i*3));
        } catch (NumberFormatException nfe) {
            System.out.println("Cannot triple " + s + ", try again with a valid number.");
        }

    }
}


