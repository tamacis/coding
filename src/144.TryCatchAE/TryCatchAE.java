class TryCatchAE {
    public static void main(String args[]) {
        int x = 0, y = 12, z = 0;

        try {
            x = y / z;
        } catch (ArithmeticException e) {
            System.out.println("Caught an arithmetic exception!");
        }
    
        z = Integer.MAX_VALUE + 5; // no exception, integer overflow ... data lost.
        System.out.println(z);
    
        try {
            z = Math.addExact(Integer.MAX_VALUE, 5);
        } catch (ArithmeticException e) { // try catching superclasses
            System.out.println("Caught an integer overflow exception: " + Integer.MAX_VALUE + " + " + 5);
            System.out.println("What can we do with the reference variable e?");
            System.out.println("getLocalizedMessage() = " + e.getLocalizedMessage());
            System.out.println("getMessage() = " + e.getMessage());
            System.out.println("toString() = " + e.toString());
            e.printStackTrace();
        }

        System.out.println("\n---------\n");
        try {
            z = Math.addExact(Integer.MAX_VALUE, y / x); // change x to 1
        } catch (ArithmeticException e ) {
            System.out.println(e.getMessage());
        }

        System.out.println("\nGood bye");
    }
}
