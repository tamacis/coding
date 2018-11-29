
import java.io.*;
class FilePartOne {
    public static void main(String args[]) {
        System.out.println("Let's see the values of the File class 4 static fields (properties):");
        System.out.println("pathSeparator = " + File.pathSeparator); // returns a String
        System.out.println("pathSeparatorChar = " + File.pathSeparatorChar); // returns a char
        System.out.println("separator = " + File.separator); // returns a String
        System.out.println("separatorChar = " + File.separatorChar);// returns a char
        System.out.println();

        System.out.println("Test the constructors:");
        File myDir = new File(File.separator);
        System.out.println("myDir.getAbsolutePath() = " + myDir.getAbsolutePath());
        System.out.println("myDir.isDirectory() = " + myDir.isDirectory());
        System.out.println("myDir.isFile() = " + myDir.isFile());
        System.out.println();

        myDir = new File(File.separator+"Java"+File.separator+"FilePartOne");
        System.out.println("myDir.getAbsolutePath() = " + myDir.getAbsolutePath());
        System.out.println("myDir.isDirectory() = " + myDir.isDirectory());
        System.out.println("myDir.isFile() = " + myDir.isFile());
        System.out.println();

        File myFile = new File(myDir, "Temp.txt");
        System.out.println("myFile.getAbsolutePath() = " + myFile.getAbsolutePath());
        System.out.println("myFile.isDirectory() = " + myFile.isDirectory());
        System.out.println("myFile.isFile() = " + myFile.isFile());
        System.out.println("myFile.exists() = " + myFile.exists());
        try { 
            myFile.createNewFile(); 
        } catch (IOException e) { 
            System.out.println(e.getMessage()); 
        }
        System.out.println("After myFile.createNewFile()"); 
        System.out.println("myFile.exists() = " + myFile.exists());
        System.out.println("myFile.isFile() = " + myFile.isFile());
        myFile.delete();
        System.out.println("After myFile.delete()");
        System.out.println("myFile.exists() = " + myFile.exists());
        System.out.println();
	
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(myFile))) {
            bw.write("Creating a File object dynamically is the way to go.");
            bw.newLine();
            bw.write("It really isn\'t that hard to do!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new FileReader(myFile))) {
            System.out.println("The contents of " + myFile.getAbsolutePath());
            while(br.ready()) {
                System.out.println(br.readLine());
            }		
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        String entireName = File.separator+"Java"+File.separator+"FilePartOne"+File.separator+"Sample.txt";        
        try (BufferedWriter bw = new BufferedWriter( new FileWriter(new File(entireName)) ) ) {
            bw.write("Another nice thing about dynamically building your path is that you don\'t have to");
            bw.newLine();
            bw.write("hard code \\\\ backslash characters in a huge string literal!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

