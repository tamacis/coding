package FileCopyDemo;
// File classes

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
// File exceptions
import java.io.FileNotFoundException;
import java.io.IOException;

public class DemoCr {

    public void copyFile(String path) {
        File dir = new File(path);
        if (!dir.mkdir()) {
            System.out.println("SOme issues");
        } else {
            try {
                System.out.println("FIle Created");
                FileOutputStream fos = new FileOutputStream(path + "source.txt");
                //content
                String content = "Apple is good.";
                byte[] arr = content.getBytes();
                fos.write(arr);
                fos.close();

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
