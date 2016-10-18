package lessons.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by dennis on 7/8/16.
 */
public class SimpleFileDemo {

    public static void main(String[] args) {
       // classicBufferedReader();
       viaPaths();

    }

    private static void viaPaths()  {
        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get("", "sample.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        lines.forEach(s -> System.out.println(s));
    }

    private static void classicBufferedReader() {
        BufferedReader reader;
        String currentLine = null;

        try {
            reader = new BufferedReader(
                    new FileReader("sample.txt"));

            while((currentLine = reader.readLine()) != null) {
                System.out.println(currentLine);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void openFile1() {
        //String path = SimpleFileDemo.class.getProtectionDomain().getCodeSource().getLocation().getFile();
        //System.out.println("my path is" + path);
        SimpleFileDemo demo = new SimpleFileDemo();
        InputStream stream = demo.getFile();

        String line;
        try {
            File file = new File("/home/dennis/workspace/lessons/codelessons/src/main/java/lessons/io/sample.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while((line = br.readLine()) != null) {
               System.out.println(line);
            }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
         } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public InputStream getFile() {
        return getClass().getClassLoader().getResourceAsStream("sample.txt");
    }
}
