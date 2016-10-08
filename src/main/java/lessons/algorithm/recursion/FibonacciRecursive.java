package lessons.algorithm.recursion;

/**
 * Created by dennis on 7/14/16.
 *
 * n = 3   0 1 2 3 5 8
 * 3
 *
 */
public class FibonacciRecursive {

    public static void main(String[] args) {

        System.out.println("Fib :" + fibonacci(5));
        System.out.println("Fib Loop :" + fibonacciLoop(5));
        System.out.println("Fib Tail :" + fibonacciTail(4));

    }

    private static int fibonacciTail(int n) {

        return fibTail(n, 1);
    }

    private static int fibTail(int n, int acc) {
        if (n == 0) {
            return acc;
        }
        return fibTail(n -1, n * acc);
    }

    private static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return fibonacci(n -1) + fibonacci(n - 2);
    }

    // Java program for Fibonacci number using Loop.
    public static int fibonacciLoop(int number){
        if(number == 1 || number == 2){
            return 1;
        }
        int fibo1=1, fibo2=1, fibonacci=1;
        for(int i= number; i<= number; i++){
            fibonacci = fibo1 + fibo2; //Fibonacci number is sum of previous two Fibonacci number
            fibo1 = fibo2;
            fibo2 = fibonacci;

        }
        return fibonacci; //Fibonacci number
    }
}
