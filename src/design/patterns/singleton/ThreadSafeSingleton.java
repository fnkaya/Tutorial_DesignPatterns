package design.patterns.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null)
                    instance = new ThreadSafeSingleton();
            }
        }

        return instance;
    }

    public void doSomething() {
        System.out.println(instance.getClass().getSimpleName() + " is doing something");
    }
}
