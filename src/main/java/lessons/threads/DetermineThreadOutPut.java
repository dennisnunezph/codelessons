package lessons.threads;

/**
 * Created by dennis on 10/18/16.
 */
public class DetermineThreadOutPut implements Runnable {
    String myString = "Yes";

    @Override
    public void run() {
        this.myString = "No";
    }

    public static void main(String[] args) {
        DetermineThreadOutPut to = new DetermineThreadOutPut();
        new Thread(to).start();
        for(int i=0;i<10;i++) {
            System.out.println(to.myString);
        }
    }
}
