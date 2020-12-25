package design.patterns.singleton;

public class SerializationSingleton {

    private static final long serialVersionUID = -7604766932017737115L;

    private SerializationSingleton() {};

    private static class SingletonHelper {

        private static final SerializationSingleton instance = new SerializationSingleton();
    }

    public static SerializationSingleton getInstance(){
        return SingletonHelper.instance;
    }

    public void doSomething(){
        System.out.println(SingletonHelper.instance.getClass().getSimpleName() + " is doing something");
    }
}
