package lessons.threads.producerconsumer;

import java.util.Vector;

/**
 * Created by dennis on 7/5/16.
 */
public class FixProducerConsumer {

    public static void main(String[] args) {

        Vector sharedQueue = new Vector();
        int size = 4;
        Thread producerFix = new Thread(new ProducerFix(sharedQueue, size), "Producer");
        Thread consumerFix = new Thread(new ConsumerFix(sharedQueue, size), "Consumer");

        producerFix.start();
        consumerFix.start();
    }
}

class ProducerFix implements Runnable {

    private final Vector sharedQueue;
    private final int SIZE;

    public ProducerFix(Vector queue, int size) {
        this.sharedQueue = queue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        for (int i =0; i <= 7; i++) {
            System.out.println("Produced:" + i);

            try {
                produce(i);
            } catch (Exception ex) {

            }
        }
    }

    private void produce(int i) throws InterruptedException{

      while(sharedQueue.size() == SIZE) {
          synchronized (sharedQueue) {
              System.out.println("Queue is full " + Thread.currentThread().getName()
                      + " is waiting , size: " + sharedQueue.size());

              sharedQueue.wait();
          }
      }

       synchronized (sharedQueue) {
           sharedQueue.add(i);
           sharedQueue.notifyAll();
       }


    }
}

class ConsumerFix implements Runnable {
    private final Vector sharedQueue;
    private final int SIZE;

    public ConsumerFix(Vector sharedQueue, int size) {
        this.sharedQueue = sharedQueue;
        this.SIZE = size;
    }

    @Override
    public void run() {
        for (int i=0; i <= SIZE; i++) {
            try {
                System.out.println("Consuming :" + consume());
                Thread.sleep(50);
            } catch (Exception ex) {

            }
        }
    }

    private Integer consume() throws IllegalMonitorStateException{
        while(sharedQueue.isEmpty()) {
            synchronized (sharedQueue) {
                try {
                    System.out.println("Queue is empty " + Thread.currentThread().getName()
                            + " is waiting , size: " + sharedQueue.size());
                    sharedQueue.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        synchronized (sharedQueue) {
            sharedQueue.notifyAll();
            return (Integer) sharedQueue.remove(0);
        }
    }
}