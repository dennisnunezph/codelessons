package lessons.threads.wait;

/**
 * Created by dennis on 3/17/16.
 */
public class WaitDemo {

    public static void main(String[] args) {
        ThreadB threadB = new ThreadB();
        threadB.start();

        /**
        synchronized(threadB){
            try{
                System.out.println("Waiting for b to complete...");
                threadB.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }

            System.out.println("Total is: " + threadB.total);
        }
        */
        System.out.println("Total is: " + threadB.total);

    }
}

class ThreadB extends Thread {
   int total;

   @Override
   public void run() {
       synchronized (this) {
           for(int i=0; i < 100; i++) {
             total +=i;
           }
           notify();
       }
   }

}


