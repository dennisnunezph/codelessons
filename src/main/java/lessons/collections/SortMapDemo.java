package lessons.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by dennis on 10/18/16.
 */
public class SortMapDemo {
    public static void main(String[] args) {
        Map<String, String> unsortMap = new HashMap<String, String>();
        unsortMap.put("Z", "z");
        unsortMap.put("B", "b");
        unsortMap.put("A", "a");
        unsortMap.put("C", "c");
        unsortMap.put("D", "d");
        unsortMap.put("E", "e");
        unsortMap.put("Y", "y");
        unsortMap.put("N", "n");
        unsortMap.put("J", "j");
        unsortMap.put("M", "m");
        unsortMap.put("F", "f");
        //System.out.println(SortByValue8.sort(unsortMap));
        System.out.println(SortByTreeMap.sort(unsortMap));
    }
}

class SortByValue8{

    public static Map<String, String> sort(Map<String, String> mapData) {
        Map<String, String> result = new HashMap<>();

        mapData.entrySet()
                .stream()
                .sorted(Map.Entry.<String, String>comparingByKey())
                .forEachOrdered(x -> result.put(x.getKey(), x.getValue()));

        return result;
    }
}

class SortByTreeMap{
    public static Map<String, String> sort(Map<String, String> mapData) {
        return new TreeMap<>(mapData);
    }
}