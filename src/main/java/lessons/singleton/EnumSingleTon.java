package lessons.singleton;

/**
 * Created by dennis on 4/14/16.
 */
public enum  EnumSingleTon {
    INSTANCE;

    public InventoryService getInstance() {
        final InventoryService service = new InventoryService();
        return service;
    }
}
