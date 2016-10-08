package lessons.builders;

/**
 * Created by dennis on 6/27/16.
 */
public class Person {
    private String firstName;
    private String lastName;
    private String middleName;

    public Person(String firstName,
                  String lastName,
                  String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName =middleName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public static class PersonBuilder {

        private final String firstName;
        private final String lastName;

        private String middleName;

        public PersonBuilder(final String firstName,
                             final String lastName) {

            this.firstName = firstName;
            this.lastName = lastName;
        }

        public PersonBuilder middleName(final String middleName) {
            this.middleName = middleName;
            return this;
        }

        public Person build() {
            return new Person(firstName, lastName, middleName);
        }
    }
}
