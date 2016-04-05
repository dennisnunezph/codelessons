package lessons.threads.java8;

import java.util.concurrent.TimeUnit;

/**
 * Created by dennis on 2/11/16.
 */
public class Thread8Demo {

    public static void main(String[] args) {

        Runnable runnable = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread tr = new Thread(runnable);
        tr.start();

    }
}
