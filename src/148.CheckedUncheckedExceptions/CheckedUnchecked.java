import java.io.*;

class CheckedUnchecked {
    public static void main(String args[]) {       
        uncheckedTester();
        checkedTester();
        System.out.println("Checked and Unchecked exceptions are all about compiling!");
    }

    static void uncheckedTester() {
        int x = Integer.parseInt("3"); // parseInt throws NumberFormatException - derived from RuntimeException - unchecked exception
        //int y = Integer.parseInt("Huh?");
    }

    //static void checkedTester() throws IOException {
    static void checkedTester() {
        File f = new File("c:\\java\\Hello.txt"); // throws NullPointerException - derived from RuntimeException - unchecked exception

        // createNewFile() method throws either IOException or SecurityException
        // SecurityException - derived from RuntimeException - unchecked exception
        // IOException - derived from Exception - checked exception!
        //f.createNewFile();  
    
        /*try {
            f.createNewFile();
        } catch ( IOException e ) {
            System.out.println("Oh no! Not another IOException!");
        } catch ( SecurityException e ) {
            System.out.println("Quick run! The file police are coming!");
        } */
    }
}
