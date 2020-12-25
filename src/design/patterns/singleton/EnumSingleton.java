package design.patterns.singleton;

public enum EnumSingleton {

    INSTANCE;

    public static void doSomething(){
        System.out.println(INSTANCE.getClass().getSimpleName() + " is doing something");
    }
}
