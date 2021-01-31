package design.patterns.factory.products;

public class Mac implements Computer {

    @Override
    public void getBrand() {
        System.out.println("Marka Mac");
    }
}
