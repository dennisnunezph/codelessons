package lessons.recursion;

/**
 * Created by dennis on 6/29/16.
 */
public class GCD {

    public static void main(String[] args) {

        System.out.println(gcd(80,13));

    }

    public static int gcd(int p,int q) {
        if (q == 0) {
            return p;
        }

        return gcd(q, p % q);
    }
}
