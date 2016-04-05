package lessons.threads.multi;

/**
 * Created by dennis on 4/5/16.
 */
public class MyThreadDemo implements Runnable{

    private String threadName;

    public MyThreadDemo(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
