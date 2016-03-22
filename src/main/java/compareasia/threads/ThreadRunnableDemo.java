package compareasia.threads;

/**
 * Created by dennis on 1/26/16.
 */
public class ThreadRunnableDemo implements Runnable{

    @Override
    public void run() {
        System.out.println("Runnable");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new ThreadRunnableDemo());
        t.start();
    }
}


