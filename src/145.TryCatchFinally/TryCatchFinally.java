/*

    No independent statements can exist between the code blocks of a try/catch/finally statement.

    At a minimum, a try block must have either a catch block or a finally block.

    A finally block will execute even if there is a return statement in the try or catch block.

    A finally block will execute if there are exceptions or no exceptions - basically all the time.
    
    The only way a finally block will ever fail to execute is if program termination occurs (extremely rare).

*/

import java.io.*;

class TryCatchFinally {
    public static void main(String args[]) {
        int x = 0;
        try {
            x = 13 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: " + e.getMessage());
        } finally {
            System.out.println("First finally just executed.\n");
        }

        try {
            String sArray[] = { "Hello", "World", "No problem here" };
            System.out.println(sArray[sArray.length - 1]);
        } finally {
            System.out.println("Second finally just executed.\n");
        }

        //new FileIntro().makeFile();

        try {
            System.out.println("Calling the return statement");
            return; // replace with System.exit(1);
        } finally {
            System.out.println("Finally evens runs after a return statement!");
        }        
    }
}

class FileIntro {
    // Demonstrate finally for closing file handles     
    void makeFile() {
        FileWriter f = null; // initialize within scope
        BufferedWriter out = null;
        try {
            f = new FileWriter("c:\\java\\Hello.txt");
            out = new BufferedWriter(f);
            out.write("Hello file maker.");
        } catch (IOException e ) {
            System.out.println("Unable to create the file: " + e.getMessage());
        } finally {
            try { out.close(); } catch (IOException e) { }
            try { f.close(); } catch (IOException e) { }
        }
    }    
}

