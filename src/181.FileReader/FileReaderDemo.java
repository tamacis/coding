import java.io.*;
class FileReaderDemo {
    public static void main(String args[]) {
        try (FileReader fr = new FileReader("Example.txt")) {
            int letters = fr.read();
            while(fr.ready()) {
                System.out.print((char) letters);
                letters = fr.read();
            }            
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
