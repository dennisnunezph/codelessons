package lessons.polymorphism;

/**
 * Created by dennis on 3/29/16.
 */
public class DogFactory implements AnimalFactory {
    public Dog createAnimal() {
        return new Dog();
    }
}
