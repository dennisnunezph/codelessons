package lessons.statements;

/**
 * Created by dennis on 7/7/16.
 */
public class SwitchDemo {

    public static void main(String args[]) {
        int i = 4;
        switch(i) {
            case 3:
                System.out.println("3");
                break;
            case 3+1:
                System.out.println("4");
                break;
            default:
                System.out.println("Default");
        }


    }
}
