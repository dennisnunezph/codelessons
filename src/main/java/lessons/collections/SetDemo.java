package lessons.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by dennis on 6/28/16.
 */
public class SetDemo {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("the");
        set.add("quick");
        set.add("brown");
        set.add("fox");
        set.add("jumps");

        for(String s : set) {
            System.out.println(s);
        }

        set = new TreeSet<>(set);
        System.out.println("Sorted Sets");
        for(String s : set) {
            System.out.println(s);
        }


    }
}
