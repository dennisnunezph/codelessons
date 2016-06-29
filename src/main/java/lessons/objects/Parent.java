package lessons.objects;

/**
 * Created by dennis on 6/28/16.
 */
public class Parent {
    public Parent() {
        System.out.println("Parent Constructor");
    }
    static {
        System.out.println("Parent static block");
    }
    {
        System.out.println("Parent initialisation  block");
    }
}
