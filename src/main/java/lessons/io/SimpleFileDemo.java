package lessons.io;

import java.io.*;

/**
 * Created by dennis on 7/8/16.
 */
public class SimpleFileDemo {

    public static void main(String[] args) {
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
