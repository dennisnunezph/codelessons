package lessons.algorithm;

/**
 * Created by dennis on 7/13/16.
 */
public class FactorialDemo {

    public static void main(String[] args) {

        factorialLoop(4);
    }

    private static void factorialLoop(int n) {

        int result = 1;
        for (int i = n; i > 1; i--) {
            result *= i;
        }

        System.out.println("Result:" + result);
    }


    private static int fact(int i, int acc) {
        if (i == 0) {
            return i;
        }

        return 0;
    }
}
