package lessons.research.bulkdata;

import com.compareasia.research.monads.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by dennis on 1/19/16.
 */
public class ClosureDemo {

    public static void main(String[] args) {

        iterateList();
        iterateMap();

    }

    private static void iterateMap() {
        Map<String, Integer> items = new HashMap<>();
        items.put("A", 10);
        items.put("B", 20);
        items.put("C", 30);
        items.put("D", 40);
        items.put("E", 50);
        items.put("F", 60);

        items.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));

        items.forEach((k,v)->{
            System.out.println("Item : " + k + " Count : " + v);
            if("E".equals(k)){
                System.out.println("Hello E");
            }
        });
    }

    private static void iterateList() {
        getPersons().stream().forEach(System.out :: println);
        getPersons().stream().forEach(p -> System.out.println(p.getName()));
    }

    private static List<Person> getPersons() {
        List<Person> personList = new ArrayList<>();

        int i = 0;
        while(i < 20) {
            Person person1 = new Person("onyok" + i);
            personList.add(person1);
            i++;
        }

        return personList;
    }



}
