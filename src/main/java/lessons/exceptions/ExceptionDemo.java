package lessons.exceptions;

/**
 * Created by dennis on 3/28/16.
 */
public class ExceptionDemo {

    public static void main(String[] args) {
         ExceptionDemo ed = new ExceptionDemo();
         ed.divide(1,2);
        Boolean flag = true;
    }

    public void divide(int a, int b) {
        try {
            int c = a / b;
        } catch (Exception ex) {
            System.out.println("Exception");
        } finally {
            System.out.println("Finally ");
        }
    }
}
