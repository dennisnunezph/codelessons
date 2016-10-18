package apractice;

/**
 * Created by dennis on 10/17/16.
 */
public class Palindrome {

    public static void main(String[] args) {

        String data = "madam";
        StringBuilder sb = new StringBuilder();
        int len = data.length() - 1;
        for(int i = 0; i <= len; i++) {
            sb.append(data.charAt(len -i));
        }
        System.out.println(data + " and " + sb.toString() + " is a Palindrome" + data.equalsIgnoreCase(sb.toString()));


    }
}
