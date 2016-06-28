package lessons.builders;

/**
 * Created by dennis on 6/27/16.
 */
public class PersonDemo {

    public static void main(String[] args) {
        Person tao = new Person.PersonBuilder("mogen", "nunez")
                .middleName("pacurib")
                .build();

        System.out.println("Boy's middle name " + tao.getMiddleName());
    }
}
