package lessons.threads.multi;

import java.util.concurrent.CountDownLatch;

/**
 * Created by dennis on 10/14/16.
 */
public class CountdownLatchDemo {

    public static void main(String[] args) {
        final CountDownLatch latch = new CountDownLatch(3);

        Runnable waiter = new Runnable() {
            @Override
            public void run() {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("Waiter is released");
            }
        };


        Runnable decrementer = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    latch.countDown();

                    Thread.sleep(1000);
                    latch.countDown();

                    Thread.sleep(1000);
                    latch.countDown();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(waiter).start();
        new Thread(decrementer).start();

        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}

