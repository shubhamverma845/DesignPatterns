package singleton;

public class SingletonSynchronized {
    private volatile static SingletonSynchronized uniqueInstance;

    private SingletonSynchronized() {

    }

    public static SingletonSynchronized getInstance() {

        if (uniqueInstance == null) {
            synchronized (SingletonSynchronized.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new SingletonSynchronized();
                }
            }
        }

        return uniqueInstance;
    }
}
