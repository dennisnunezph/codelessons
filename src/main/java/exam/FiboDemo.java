package exam;

/**
 * Created by dennis on 9/28/16.
 */
public class FiboDemo {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            //System.out.println(i + " is " + fib(i));
            System.out.println(i + " is " + fibonacci(i));
        }
    }

    public static long fibonacci(int n) {
        if (n == 0)
            return 0;
        else
            return fibonacciTail(n, 1, 0, 1);
    }

    public static int fibonacciTail(int current, int prev, int fibPrev, int fibCurrent) {
        if (current == prev) {
            return fibCurrent;
        }

        return fibonacciTail(current, prev + 1, fibCurrent, fibCurrent + fibPrev );
    }
}
