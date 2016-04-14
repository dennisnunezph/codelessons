package lessons.singleton;

/**
 * Created by dennis on 4/14/16.
 */
public class SingletonDemo {

    public static void main(String args[]) {
        InventoryService service = EnumSingleTon.INSTANCE.getInstance();
        service.add("Nice car");
    }
}
