package lessons.collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by dennis on 6/28/16.
 */
public class LinkedListDemo {

    public static void main(String[] args) {

        //linkedListAPI();
        linkedListManualDemo();
    }

    private static void linkedListManualDemo() {

        LinkedListManual llm = new LinkedListManual();

        llm.add("the");
        llm.add("quick");

        Iterator<String> itr = llm.iterator();

        while(itr.hasNext()) {
            String result = itr.next();
            System.out.println(result);
        }

    }

    private static void linkedListAPI() {
        LinkedList<String> ll = new LinkedList<>();

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

        for(String s : ll) {
            System.out.println(s);
        }
    }
}
