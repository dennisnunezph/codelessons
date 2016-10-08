package exam;

/**
 * Created by dennis on 9/27/16.
 */
public class FibonacciDemo {

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

    public static long fibonacciTail(int n, int m, long fibPrev, long fibCurrent) {
        if (n == m)
            return fibCurrent;
        else
            return fibonacciTail(n, m + 1, fibCurrent, fibPrev + fibCurrent);
    }

    public static long fib(long number) {
        if (number == 0
                || number == 1)  {
            return number;
        }

        return fib(number - 1) + fib(number -2);
    }

    public static long fibTail(long number, long acc) {
        if (number == 0
                || number == 1)  {
            return acc;
        }
        acc = (number + 1) + (number + 2);
        return fibTail(number - 1, acc);
        //return fib(number - 1) + fib(number -2);
    }
}
