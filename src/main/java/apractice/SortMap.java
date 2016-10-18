package apractice;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dennis on 10/18/16.
 */
public class SortMap {

    public static void main(String[] args){

        Map<String, String> mapData = new HashMap<>();
        mapData.put("1", "The");
        mapData.put("3", "quick");
        mapData.put("2", "brown");

        Map<String, String> result = new HashMap<>();


        mapData.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        System.out.println("Sorted:" + result);

    }
}
