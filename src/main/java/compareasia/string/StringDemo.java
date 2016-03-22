package compareasia.string;

/**
 * Created by dennis on 2/4/16.
 */
public class StringDemo {

    public static void main(String[] args) {

        String message = "the quick brown fox";
        int mlen = message.length();
        String result = "";

        for(int i = 0;i < mlen; i++) {
            result  += message.substring((mlen -i) -1, mlen -i);
        }
        System.out.println(result);
    }
}
