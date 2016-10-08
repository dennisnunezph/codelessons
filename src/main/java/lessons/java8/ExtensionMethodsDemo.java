package lessons.java8;

/**
 * Created by dennis on 10/6/16.
 */
public class ExtensionMethodsDemo {

    public static void main(String[] args) {
        Formula formula = new Formula() {
            @Override
            public double calculate(int a) {
                return a * 100;
            }
        };



       System.out.println(formula.calculate(10));

    }
}

interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}