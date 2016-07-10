package lessons.heap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by dennis on 7/5/16.
 */
public class HeapPollution {
 public static void main(String[] args) {

     List<Integer> myInts = new ArrayList<Integer>();
     myInts.add(1);
     myInts.add(2);
     //List<Number> myNums = myInts; //compiler error
     //myNums.add(3.14); //heap polution
 }
}
