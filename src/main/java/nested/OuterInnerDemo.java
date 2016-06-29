package nested;

/**
 * Created by dennis on 6/29/16.
 */
public class OuterInnerDemo {

    public static void main(String[] args) {

        Outer outer = new Outer();
        Outer.Inner outIn = outer.new Inner();

    }
}
