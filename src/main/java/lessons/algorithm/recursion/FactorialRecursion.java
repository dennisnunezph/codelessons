package lessons.algorithm.recursion;

/**
 * Created by dennis on 7/14/16.
 */
public class FactorialRecursion {

    public static void main(String[] args) {
        System.out.println("Recursive Factorial :" + factorial(4));
        System.out.println("Recursive Factorial Tail :" + factorialTail(4));
    }

    public static int factorial(int N) {
        if (N == 1) {
            return 1;
        }
        System.out.format("%d ", N);
        return N * factorial(N - 1);
    }

    public static int factorialTail(int n) {
        return factTail(n, 1);
    }

    private static int factTail(int n, int acc) {
        //System.out.format("int %d ", n);
        System.out.format( "%d acc  ", acc);

        if (n == 1) {
            return acc;
        }
        //acc *= n;
        return factTail(n -1, acc * n);
    }
}
