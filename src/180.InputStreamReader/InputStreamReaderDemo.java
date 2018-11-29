import java.io.*;

class InputStreamReaderDemo {
    public static void main(String args[]) {
        try (InputStreamReader isr = new InputStreamReader(System.in)) {
            System.out.print("Enter some letters: ");
            int letters = isr.read();
            System.out.print("You entered: ");
            while (isr.ready()) {
                System.out.print((char) letters);
                letters = isr.read();
            }
            // isr.close(); // try-with-resources automatically calls this so we don't have to worry about missing this step
            System.out.println("\n---------");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
