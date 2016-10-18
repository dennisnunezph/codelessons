package lessons.threads.multi;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 * Created by dennis on 10/14/16.
 */
public class CyclicBarrierdemo {

    public static void main(String[] args) {


        Runnable waiter1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Cyclic barrrier 1 executed");
            }
        };

        Runnable waiter2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Cyclic barrrier 2 executed");
            }
        };


        CyclicBarrier cb1 = new CyclicBarrier(2, waiter1);
        CyclicBarrier cb2 = new CyclicBarrier(2, waiter2);


        CBRunnable cbr1 = new CBRunnable(cb1, cb2);
        CBRunnable cbr2 = new CBRunnable(cb1, cb2);

        new Thread(cbr1).start();
        new Thread(cbr2).start();


}


 static class  CBRunnable implements Runnable {

     private final CyclicBarrier barrier1;
     private final CyclicBarrier barrier2;

     public CBRunnable(CyclicBarrier barrier1,
                       CyclicBarrier barrier2) {

           this.barrier1 = barrier1;
           this.barrier2 = barrier2;
        }

        @Override
        public void run() {

            try {
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName() + " waiting at Barrier 1");
                barrier1.await();

                System.out.println(Thread.currentThread().getName() + " waiting at Barrier 2");
                barrier2.await();

                System.out.println(Thread.currentThread().getName() + " done");


            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }

        }
    }
}