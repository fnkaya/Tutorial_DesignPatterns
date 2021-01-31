package design.patterns.factory.products;

public class Hp implements Computer {

    @Override
    public void getBrand() {
        System.out.println("Marka HP");
    }
}
