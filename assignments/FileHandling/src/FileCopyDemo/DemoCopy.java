package FileCopyDemo;

// File classes
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// File exceptions
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoCopy {

    public static void main(String[] args) {
        String tmpdir = System.getProperty("java.io.tmpdir");

        DemoCr demo = new DemoCr();
        demo.copyFile(tmpdir);

        try {
            File desFile = new File(tmpdir + "source.txt");
            desFile.createNewFile();

            FileInputStream fis = new FileInputStream(tmpdir + "source.txt");
            FileOutputStream fos = new FileOutputStream(tmpdir + "destination.txt");
            int ch;
            while ((ch = fis.read()) != -1) {
                fos.write(ch);
                System.out.print((char) ch);
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }//main ends
}//class ends
