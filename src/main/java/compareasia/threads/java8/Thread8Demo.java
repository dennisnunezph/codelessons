package compareasia.threads.java8;

/**
 * Created by dennis on 2/11/16.
 */
public class Thread8Demo {

    public static void main(String[] args) {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String tname = Thread.currentThread().getName();
                System.out.println("Runnable -" + tname);
            }
        };

        Thread tr = new Thread(runnable);
        tr.start();

    }
}
