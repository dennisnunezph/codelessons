package lessons.exam;

/**
 * Created by dennis on 7/7/16.
 */
public class ReplaceCharString {

    public static void main(String[] args) {

        String msg = "Hello World";
        System.out.println("old Message:" +  msg);
        char[] msgArr = msg.toCharArray();
        char target = 'o';
        char newChar = 'z';
        for (int i =0;i <= msgArr.length -1; i++) {

            if (target == msgArr[i]){
                msgArr[i] = newChar;
            }
        }

        System.out.println("New Message:" +  String.valueOf( msgArr));
    }
}
