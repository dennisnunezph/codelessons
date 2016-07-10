package lessons.algorithm.recursion;

/**
 * Created by dennis on 4/1/16.
 */
public class RecursionDemo {

    public static void main(String[] args) {

        System.out.println("Factorial is :" + factorial(2));


    }

    public static int factorial(int N) {
        if (N == 1) {
            return 1;
        }
        System.out.format("%d ", N);
        return N * factorial(N - 1);
    }
}
