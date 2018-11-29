
import java.io.*;
class IOIntro {
    public static void main(String args[]) throws IOException {
        int letter = 0;

        System.out.print("Type a letter and press Enter: ");
        letter = System.in.read();
        System.out.println("You typed: " + letter);
        System.out.println("You typed: " + (char) letter);
        System.out.println("--------");

        //while((letter = System.in.read ()) != '\n') {
        //  System.out.println((char) letter);
        //}

        /*
        System.out.print("Type another letter and press Enter: ");
        letter = System.in.read();
        System.out.println("You typed: " + letter);
        System.out.println("You typed: " + (char) letter);
        System.out.println("--------");

        while((letter = System.in.read ()) != '\n') {
            System.out.println((char) letter);
        }

        byte bArray[] = new byte[10];
        System.out.print("Type some letters and press Enter: ");
        System.in.read(bArray);
        System.out.print("You typed: ");
        for(byte b: bArray) {
            System.out.print((char) b);
        }
        */
    }
}

