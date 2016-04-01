package lessons.polymorphism;

/**
 * Created by dennis on 3/29/16.
 */
public class AbstractFactoryDemo {

    public static void main(String[] args) {

        DogFactory df = new DogFactory();
        Dog animal = df.createAnimal();

    }
}
