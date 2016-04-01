package lessons.polymorphism;

/**
 * Created by dennis on 3/29/16.
 */
public class AnimalService {
    private static AnimalService ourInstance = new AnimalService();

    public static AnimalService getInstance() {
        return ourInstance;
    }

    private AnimalService() {
    }
}
