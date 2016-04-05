package lessons.threads.multi;

/**
 * Created by dennis on 4/5/16.
 */
public class MultiThreadDemo {

    public static void main(String[] args) throws InterruptedException {




        MyThreadDemo mt2 = new MyThreadDemo("Thread2");
        Thread t2 = new Thread(mt2);
        t2.start();

        MyThreadDemo mt1 = new MyThreadDemo("Thread1");
        Thread t1 = new Thread(mt1);
        t1.start();
        t1.join();
        t2.join();

        System.out.println("Threads completed");
    }
}
