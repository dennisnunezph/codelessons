package lessons.threads.wait;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by dennis on 10/18/16.
 */
public class UniqueNumberDemo {

    public static void main(String[] args){

        Runnable t1 = new Runnable() {
            @Override
            public void run() {
                SequencedNumber sq = new SequencedNumber();
                System.out.println(sq.getYourNumber());
            }
        };

        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                SequencedNumber sq = new SequencedNumber();
                System.out.println(sq.getYourNumber());
            }
        };

        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<Runnable> result = es.submit(t1, t2);
        System.out.println(result.isDone());
    }
}

class SequencedNumber {
    static private int myCount = 0;
    int yourNumber;
    private static synchronized int nextCount()
    {
        return ++myCount;
    }

    public int getYourNumber()
    {
        return nextCount();
    }
}