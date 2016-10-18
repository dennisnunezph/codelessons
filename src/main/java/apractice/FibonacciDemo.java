package apractice;

/**
 * Created by dennis on 10/17/16.
 */
public class FibonacciDemo {

    public static void main(String[] args) {
        // 0 1 2 3 5
        System.out.println(fibo(6));
    }

    private static int fibo(int n) {
        if (n == 0) {
            return 0;
        } else {
            return fibo(n, 1, 0, 1);
        }

    }

    private static int fibo(int n, int m, int prev, int current) {
        if (n == m) {
            return current;
        } else {
            return fibo(n, m + 1, current, prev + current);
        }
    }
}
