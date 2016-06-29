package lessons.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by dennis on 6/28/16.
 */
public class ArrayListDemo {

    public static void main(String[] args) {

        List<String> ll = new ArrayList();
        ll.add("the");
        ll.add("quick");
        ll.add("brown");
        ll.add("fox");
        ll.add("jumps");
        ll.add("over");
        ll.add("the");
        ll.add("lazy");
        ll.add("dog");
        ll.add("in");
        ll.add("the");
        ll.add("bank");
        ll.add("of");
        ll.add("the");
        ll.add("river");

        System.out.println("Size is :" +ll.size());

        String[] strArray = {"the", "quick", "brown","fox"};
        ll = Arrays.asList(strArray);
        System.out.println("Size is :" +ll.size());


    }
}
