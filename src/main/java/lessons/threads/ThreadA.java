package lessons.threads;

/**
 * Created by dennis on 2/4/16.
 */
public class ThreadA implements Runnable {
    @Override
    public void run() {
        System.out.println("Running A");
    }
}
