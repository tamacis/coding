import java.io.*;
import java.util.concurrent.ThreadLocalRandom;

class FileOutputStreamDemo {

    private static int getRandomByte() {
        return ThreadLocalRandom.current().nextInt(0, 255 + 1);
    }

    public static void main(String args[]) {
        File f = new File("." + File.separator + "test.bmp");
        f.delete();
        try (FileOutputStream fos = new FileOutputStream(f)) {
            fos.write(66); // ascii 'B' 
            fos.write(77); // ascii 'M' - BM is the file type
            fos.write(220); // Size of the file = Header (26) + (length * width * 3 = 192) + 2 closing null 0's
            fos.write(0); // Size of the file
            fos.write(0); // Size of the file
            fos.write(0); // Size of the file
            fos.write(0); // Reserved 1
            fos.write(0); // Reserved 1
            fos.write(0); // Reserved 2
            fos.write(0); // Reserved 2
            fos.write(26); // 4 Byte number representing Byte# for start of Pixel data
            fos.write(0); // 4 Byte number representing Byte# for start of Pixel data
            fos.write(0); // 4 Byte number representing Byte# for start of Pixel data
            fos.write(0); // 4 Byte number representing Byte# for start of Pixel data - End of File Header here
            fos.write(12); // 4 Byte number representing Image header size - Image header starts here
            fos.write(0); // 4 Byte number representing Image header size
            fos.write(0); // 4 Byte number representing Image header size
            fos.write(0); // 4 Byte number representing Image header size
            fos.write(8); // 2 Byte number representing Image width
            fos.write(0); // 2 Byte number representing Image width
            fos.write(8); // 2 Byte number representing Image height
            fos.write(0); // 2 Byte number representing Image height
            fos.write(1); // number of planes in the image
            fos.write(0); // number of planes in the image
            fos.write(24); // number of bits per pixel 24 = 3 bytes per pixel = RGB
            fos.write(0); // number of bits per pixel

            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }
            for (int i = 0; i < 8; i++) {
                getRandomByte();
                getRandomByte();
                getRandomByte();
            }

            fos.write(0);
            fos.write(0);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}