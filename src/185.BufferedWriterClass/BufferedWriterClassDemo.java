
import java.io.*;
class BufferedWriterClassDemo {
    public static void main(String args[]) {
        try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw.write("Type whatever you want to go into a file called Sample.txt,");
            bw.newLine();
            bw.write("type EXIT on a new line and Enter to stop writing to the file: ");
            bw.newLine();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Example.txt"))) {
            bw.write("Hello BufferedWriter");
            bw.newLine();
            bw.write("Love the newLine() method :)");
            bw.newLine();
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String inputString = br.readLine();
            while(!inputString.equals("EXIT")){
                try (BufferedWriter bw = new BufferedWriter(new FileWriter("Sample.txt", true))) {
                    bw.write(inputString);
                    bw.newLine();
                } catch(IOException e) {
                    System.out.println(e.getMessage());
                }
                inputString = br.readLine();
            } 
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

