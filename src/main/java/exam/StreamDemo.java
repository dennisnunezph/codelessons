package exam;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.toList;

/**
 * Created by dennis on 10/6/16.
 */
public class StreamDemo {

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();
        persons.add(new Person(1, "One"));
        persons.add(new Person(3, "Three"));
        persons.add(new Person(2, "Two"));

        persons.stream()
                .forEach(t -> System.out.println(t));
        List<Person> result = persons.stream()
                .sorted(comparing(Person::getId))
                .collect(toList());


    }
}

class Person {
    int id;
    String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id:" + id +
                "name:" + name;
    }
}
