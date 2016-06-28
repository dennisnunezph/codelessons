package lessons.singleton;

/**
 * Created by dennis on 6/24/16.
 */
public class SingleLocking {

    private static InventoryService _instance;

    public static InventoryService getInstance() {
        if (_instance == null) {
            _instance = new InventoryService();
        }

        return _instance;
    }
}
