package design.patterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {}

    public static EagerSingleton getInstance(){
        return instance;
    }

    public void doSomething(){
        System.out.println(instance.getClass().getSimpleName() + " is doing something");
    }
}
