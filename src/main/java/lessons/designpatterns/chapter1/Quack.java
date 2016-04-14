package lessons.designpatterns.chapter1;

/**
 * Created by dennis on 4/11/16.
 */
public class Quack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("I can quack");
    }
}
