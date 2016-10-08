package lessons.string;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by dennis on 7/4/16.
 */
public class CountRecurringDemo {

    public static void main(String[] args) {
        String srcString = "stress";
        firstCharArray(srcString);
        String firstChar = firstCharMap(srcString);
        System.out.println("First char:" + firstChar);
    }

    private static String firstCharMap(String source) {
        Map<Character, Integer> mapChar = new HashMap<>();

        char tmpStr;
        for (int i = 0; i < source.length() - 1; i++) {
            tmpStr = source.charAt(i);
            if (mapChar.containsKey(tmpStr)) {
                int count = mapChar.get(tmpStr);
                //count++;
                mapChar.put(tmpStr, ++count);
            } else {
                mapChar.put(tmpStr, 1);
            }
        }

        for (int i = 0; i < source.length() - 1; i++) {
            tmpStr = source.charAt(i);

            if (mapChar.get(tmpStr) == 1) {
                return String.valueOf(tmpStr);
            }

        }
        return "";
    }
    private static void firstCharArray(String srcString) {

        char[] srcChar = srcString.toCharArray();
        String  result = "";

        char tmp;
        for (int i=0;i<=srcChar.length-1;i++) {
            tmp = srcChar[i];
            boolean duplicate = false;
            for (int j =0; j< srcChar.length - 1;j++) {
                char otherChar = srcChar[j];
                if (tmp == otherChar
                    && (i !=j)) {
                     duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = String.valueOf(tmp);
                break;
            }
        }

        System.out.println("First non repeating letter is :" + result);
    }
}
