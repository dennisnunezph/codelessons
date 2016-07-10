package lessons.inheritance;

/**
 * Created by dennis on 7/7/16.
 */
public class AbstractDemo {

    public static void main(String[] args) {
        FirstChild fc = new FirstChild();
        fc.checkout();
        System.out.println("Value of int :" + fc.intVal);
        fc.compute();


    }
}
