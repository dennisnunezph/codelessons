package lessons.objects;

/**
 * Created by dennis on 6/28/16.
 */
public class Child extends Parent {
    {
        System.out.println("Child initialisation block");
    }
    static {
        System.out.println("Child static block");
    }

    public Child() {
        System.out.println("Child Constructor");
    }
    public static void main(String[] args) {
        new Child();
    }
}
