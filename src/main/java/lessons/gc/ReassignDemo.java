package lessons.gc;

/**
 * Created by dennis on 3/28/16.
 */
public class ReassignDemo {

    public static void main(String[] args) {
        Echo e1 = new Echo("echo 1");
        Echo e2 = new Echo("echo 2");
        //e2 = e1;

        int x=0;
        while( x < 4 ){
            e1.hello();
            e1.count = e1.count + 1;
            if(x==3){
                e2.count = e2.count + 1;
            }
            if(x>0){
                e2.count = e2.count + e1.count;
            }
            x = x + 1;
        }
        System.out.println("E1 Count" +e1.count);
        System.out.println("E2 Count" +e2.count);
    }
}

class Echo {
    int  count = 0;
    String name = "";

    public Echo(String name) {
        this.name = name;
    }

    void hello(){
        System.out.println("Hellooooo...." + name);
    }

}
