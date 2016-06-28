package lessons.singleton;

/**
 * Created by dennis on 6/24/16.
 */
public class DoubleLockingVolatile {
    private volatile static InventoryService _instance;

    private DoubleLockingVolatile() {

    }

    /* * 3rd version : An implementation of double checked locking of Singleton. * Intention is to minimize cost of synchronization and improve performance,
    * * by only locking critical section of code, the code which creates instance of Singleton class.
    * * By the way this is still broken, if we don't make _instance volatile, as another thread can
    * * see a half initialized instance of Singleton. */
    public static InventoryService getInstanceDC() {
        if (_instance == null) {
            synchronized (DoubleLockingVolatile.class) {
                if (_instance == null) {
                    _instance = new InventoryService();
                }
            }
        }
        return _instance;
    }


}
