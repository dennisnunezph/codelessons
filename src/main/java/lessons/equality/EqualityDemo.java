package lessons.equality;

/**
 * Created by dennis on 7/11/16.
 */
public class EqualityDemo {

   public static void main(String[] args) {
       Pet a = new Pet();
       a.name = "Kairos";
       Pet b = new Pet();
       b.name = "Kairos";

       System.out.println("A and B = " + (a == b));

       a = b;
       System.out.println("A and B is now = " + (a == b));

   }

}

class A {
    String name;
}

class B {
    String name;
}
