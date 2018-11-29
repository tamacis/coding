/* Create directories and files for javacjava tutorials */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class CreateTutDirs {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please specify directory");
            System.out.println("Usage: dir csv index");
            return;
        }
        final String dir = args[0];
        final String csv = args[1];
        int idx = Integer.parseInt( args[2]);

        final Path currentPath = Paths.get(System.getProperty("user.dir"));
        final Path filePath = Paths.get(currentPath.toString(), csv);
        final String absDir = Paths.get(dir).toAbsolutePath().normalize().toString();
        System.out.println(filePath);
        System.out.println(absDir);

        try {
            FileInputStream fstream = new FileInputStream(filePath.toString());

            try (BufferedReader br = new BufferedReader(new InputStreamReader(fstream))) {
                for (String line; (line = br.readLine()) != null;) {
                    final String clsName;
                    String[] splitted = line.split(" ");
                    final String head = splitted[0];
                    final String input = splitted[1].replace("()", "").replace("(...)", "");
                    String tail = input.substring(0, 1).toUpperCase() + input.substring(1);
                    clsName = head + tail;

                    final Path cDir = Paths.get(absDir, idx + "." + clsName);
                    final Path cFile = Paths.get(cDir.toString(), clsName + ".java");
                    System.out.println(cDir.toString());
                    System.out.println(cFile.toString());
                    Files.createDirectories(cDir);
                    Files.createFile(cFile);
                    idx++;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }
}