package lessons.research.monads;

/**
 * Created by dennis on 7/30/15.
 */
public class Person {
    private final String name;
    private Optional<Car> car;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Optional<Car> getCar() {
        return car;
    }
}
