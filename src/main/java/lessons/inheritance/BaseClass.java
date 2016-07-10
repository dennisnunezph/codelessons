package lessons.inheritance;

/**
 * Created by dennis on 7/7/16.
 */
public abstract class BaseClass {

    int intVal = 0;

    public BaseClass() {
        System.out.println("BaseClass constructor");
    }

    public abstract void checkout();

    public void compute() {
        System.out.println("compute base class");
    }
}
