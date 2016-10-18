package lessons.heap;

import java.util.*;

/**
 * Created by dennis on 7/5/16.
 */
public class HeapPollution {
 public static void main(String[] args) {

     //listHeapPollution();

     setHeapPollution();
 }

    private static void listHeapPollution() {
        List<Integer> myInts = new ArrayList<Integer>();
        myInts.add(1);
        myInts.add(2);
        //List<Number> myNums = myInts; //compiler error
        //myNums.add(3.14); //heap polution
    }

    private static void setHeapPollution() {
        Set s = new TreeSet<Integer>();
        Set<String> ss = s;            // unchecked warning
        s.add(new Integer(42));        // another unchecked warning
        Iterator<String> iter = ss.iterator();
        while (iter.hasNext())
        {
            String str = iter.next();   // ClassCastException thrown
            System.out.println(str);
        }
    }
}
