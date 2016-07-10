package lessons.inheritance;

/**
 * Created by dennis on 7/7/16.
 */
public class FirstChild extends BaseClass{

    int intVal = 1;
    public FirstChild() {
        System.out.println("FirstChild constructor");
    }

    @Override
    public void checkout() {
        System.out.println("FirstChild checkout");
    }
}
