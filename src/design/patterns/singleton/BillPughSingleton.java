package design.patterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {}

    private static class SingletonHelper{

        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.instance;
    }

    public void doSomething() {
        System.out.println(SingletonHelper.instance.getClass().getSimpleName() + " is doing something");
    }
}
