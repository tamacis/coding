class TryCatchIOOBE {
    public static void main(String args[]) {
        String hello = "Hello World!";

        char test = hello.charAt(4);
        System.out.println(test);
        test = hello.charAt(27); // get the 27th character;

        /*try {
            char test = hello.charAt(4);
            System.out.println(test);
            test = hello.charAt(27); // get the 27th character;
            System.out.println(test);            
        } catch (IndexOutOfBoundsException e) {
            String s = "Only in this code block.";
            System.out.println("Oops, we can\'t get the 27th character in the string Hello World.");
        }*/

        //test = 'A'; // variable scope applies to try blocks
        //s = "Scope lesson also"; // variable scope applies to catch blocks
    
        System.out.println("\n-------");

        int array[] = { 12, 24, 36 };
        
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[array.length]);
        
        /*try {
            System.out.println(array[array.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Oops, we tried to access an element at an index that doesn't exist!");
        }*/
    }
}