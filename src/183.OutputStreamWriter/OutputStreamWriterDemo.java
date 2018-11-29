import java.io.*;
class OutputStreamWriterDemo {
    public static void main(String args[]) {
        try (OutputStreamWriter OSW = new OutputStreamWriter(System.out)) {
            OSW.write("Hello World\n");
            OSW.write(97);
            OSW.write(98);
            OSW.write(99);
            OSW.write(49);
            OSW.write(50);
            OSW.write(51);
            OSW.write(10);
            OSW.write('A');
            OSW.write('B');
            OSW.write('C');
            OSW.write('1');
            OSW.write('2');
            OSW.write('3');
            OSW.write('\n');
            char cArray[] = "Hello World".toCharArray();
            OSW.write(cArray);
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }
}