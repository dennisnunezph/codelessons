package lessons.sorting;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by dennis on 3/28/16.
 */
public class FindHighestNumbers {

    public static void main(String[] args) {
        int numbers[] = {6,3,37,12,46,5,64,21};
        //Integer numObjs = Arrays.asList(numbers);
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -1]);
    }
}
