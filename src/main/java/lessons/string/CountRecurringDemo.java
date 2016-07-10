package lessons.string;

/**
 * Created by dennis on 7/4/16.
 */
public class CountRecurringDemo {

    public static void main(String[] args) {

        String srcString = "stress";
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
