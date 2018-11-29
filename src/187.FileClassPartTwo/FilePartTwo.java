import java.io.*;
import java.net.*;
class FilePartTwo {
    public static void main(String args[]) {
        File f = new File(File.separator+"Java"+File.separator+"FilePartTwo");

        File f1 = new File(f, "One");
        f1.mkdir();
        File f2 = new File(f, "Two");
        f2.mkdir();
        File f3 = new File(f, "Three");
        f3.mkdir();
        File f4 = new File(f, "Four");
        f4.mkdir();

        String sArray[] = f.list();
        System.out.println("All of the files and folders contained in " + f.getAbsolutePath());
        for (String temp : sArray) {
            System.out.println(f.getAbsolutePath()+"\\" + temp);
        }
        System.out.println("\n---------\n");

        new File(f1,"States.txt").delete(); // delete for multiple runs of this program

        URL url = null;
        try {
            url = new URL("http://www.JavacJava.com/states.txt");
        } catch (MalformedURLException e) {
            System.out.println("Something wrong with the URL syntax");
        }

        try (BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()))) {
            while(br.ready()) {
                String line = br.readLine();
                System.out.println(line);
                try (BufferedWriter bw = new BufferedWriter( new FileWriter(new File(f1,"States.txt"), true) ) ) {
                    bw.write(line);
                    bw.newLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }			
            }
        } catch (IOException e) {
            System.out.println("Trouble with your internet connection " + e.getMessage());
        }
	
        copyFile(new File(f1,"States.txt"), new File(f2, "US States.txt"));
        copyFile(new File(f1,"States.txt"), new File(f3, "Fifty States.txt"));
        copyFile(new File(f1,"States.txt"), new File(f4, "All 50 States.txt"));
    } // end main method

    static boolean copyFile(File source, File destination) {
        if (!source.exists()) { return false; }
        destination.delete(); // delete file if it exists, we would normally prompt for an operation like this
        try (BufferedReader br = new BufferedReader(new FileReader(source))) {
            while(br.ready()) {
                String line = br.readLine();
                try (BufferedWriter bw = new BufferedWriter( new FileWriter(destination, true) ) ) {
                    bw.write(line);
                    bw.newLine();
                } catch (Exception e) {
                    e.printStackTrace();
                }			
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (destination.exists()) { return true; }
        return false;	
    }
}
