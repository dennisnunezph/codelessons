package lessons.threads;

/**
 * Created by dennis on 2/10/16.
 */
public class ThreadQuirkDemo {

    public static void main(String[] args) {
        ThreadExtends te = new ThreadExtends();
        te.start();

        ThreadA ta = new ThreadA();
        Thread tad = new Thread(ta);
        tad.start();
    }
}
