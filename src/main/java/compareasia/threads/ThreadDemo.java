package compareasia.threads;

/**
 * Created by dennis on 1/26/16.
 */
public class ThreadDemo extends Thread {

    public void run(){
        System.out.println("MyThread running");
    }

    public static void main(String[] args) {
        //ThreadDemo td = new ThreadDemo();
        //td.start();
        Thread td1 = new Thread(new ThreadDemo());
        td1.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("After sneeping");
        Thread td2 = new Thread(new ThreadDemo());
        td2.start();
    }
}
