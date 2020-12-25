package design.patterns.singleton;

public class Test {

    public static void main(String[] args) {

        EagerSingleton.getInstance().doSomething();
        StaticBlockSingleton.getInstance().doSomething();
        LazySingleton.getInstance().doSomething();
        ThreadSafeSingleton.getInstance().doSomething();
        BillPughSingleton.getInstance().doSomething();
        SerializationSingleton.getInstance().doSomething();
        EnumSingleton.doSomething();
    }
}
