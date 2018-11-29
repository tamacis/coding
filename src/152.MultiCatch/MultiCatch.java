import java.io.*;
class MultiCatch {
static String fileName;
    public static void main(String args[]) {
        fileName = "c:\\Java\\Hello.txt";
        try {
            File f = new File(fileName); // throws NullPointerException
            f.createNewFile(); // throws IOException or SecurityException
            System.out.println("Created file c:\\Java\\Hello.txt");
        } catch ( NullPointerException | IOException | SecurityException e ) {
            System.out.println("Unable to create Hello.txt ... " + e);
        } 
    }
}