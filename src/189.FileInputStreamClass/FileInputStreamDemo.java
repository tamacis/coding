
import java.io.*;
class FileInputStreamDemo {
    public static void main(String args[]) {
        File f = new File(File.separator+"Java"+File.separator+"FIS"+File.separator+"test.bmp");
        File fbmp = new File(File.separator+"Java"+File.separator+"FIS"+File.separator+"newBMP.bmp");
        
        buildOriginalBitmap(f);

        try (FileInputStream fis = new FileInputStream(f)) {
            byte bArray[] = new byte[fis.available()];
            fis.read(bArray);

            /*int counter = 0;
            for (int i = 25; i < 219; i++) {
                switch(counter) {
                    case 0:
                    case 1:
                    case 2:
                        bArray[i] = 0;
                        break;
                    case 4:
                    case 5:
                    case 6:
                        bArray[i] = (byte)255;					
                        break;
                }
                counter++;
                if (counter > 6) counter = 0;
            }*/
    
            try (FileOutputStream newBMP = new FileOutputStream(fbmp)) {
                newBMP.write(bArray);
            } catch (IOException e) {
                e.printStackTrace();
            } 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void buildOriginalBitmap(File f) {
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
            for (int i = 0; i < 8; i ++) {
                fos.write(255);
                fos.write(0);
                fos.write(0);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(0);
                fos.write(255);
                fos.write(0);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(0);
                fos.write(0);
                fos.write(255);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(127);
                fos.write(127);
                fos.write(127);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(180);
                fos.write(200);
                fos.write(47);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(200);
                fos.write(60);
                fos.write(199);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(32);
                fos.write(165);
                fos.write(100);			
            }
            for (int i = 0; i < 8; i ++) {
                fos.write(155);
                fos.write(10);
                fos.write(134);			
            }
            fos.write(0);
            fos.write(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

