package exam;

/**
 * Created by dennis on 10/1/16.
 */
public class FactorialDemo {

public static void main(String[] args) {
    // 4 = 0 1 2 3 4 = 24
     int factorial = factorial(4);
    System.out.println(factorial + " is : " + (factorial(4) == 24));
}

    private static int factorial(int n) {
        if (n == 0) {
            return 0;
        }

        return factorial(n, 1);
    }

    private static int factorial(int n, int acc) {
        if (n == 1) {
            return acc;
        }

        return factorial(n -1, n * acc);

    }

}
