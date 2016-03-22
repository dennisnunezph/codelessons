package lessons.string;

/**
 * Created by dennis on 3/17/16.
 */
public class PasswordDemo {

    public static void main(String[] args) {
        String strPassword="Unknown";
        char[] charPassword= new char[]{'U','n','k','w','o','n'};
        System.out.println("String password: " + strPassword);
        System.out.println("Character password: " + charPassword);
        System.out.println("To Char: " + strPassword.toCharArray());
    }
}
