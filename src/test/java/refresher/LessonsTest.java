package refresher;

import lessons.builders.Person;
import org.junit.Test;

/**
 * Created by dennis on 6/29/16.
 */
public class LessonsTest {

    private Person person;

    public void init() {
        person = new Person.PersonBuilder("mogen", "nunez")
                .middleName("pacurib")
                .build();
    }


}
