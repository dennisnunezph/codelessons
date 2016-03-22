package compareasia.threads;

/**
 * Created by dennis on 2/4/16.
 */
public class ThreadStop {

    public static void  main(String[] args) {
        ThreadA ta = new ThreadA();
        Thread ts = new Thread(ta);
        ts.start();

    }
}


