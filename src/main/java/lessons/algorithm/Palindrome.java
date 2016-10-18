package lessons.algorithm;

/**
 * Created by dennis on 10/1/16.
 */
public class Palindrome {

    public static void main(String[] args) {
        String original = "reverse";
        String reverse = reverse(original);
        System.out.println(reverse + " is reverse of : " + original + " and is palindrome :" + original.equalsIgnoreCase(reverse));
    }

    private static String reverse(String original) {
        char[] reverse = new char[original.length()];
        int len = original.length() - 1;
        for (int i = 0; i <= len; i++) {
            reverse[i] = original.charAt(len - i);
        }

        return String.valueOf(reverse);
    }
}
