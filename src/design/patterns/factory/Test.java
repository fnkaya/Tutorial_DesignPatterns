package design.patterns.factory;

public class Test {

    public static void main(String[] args) {

        try {
            Hp hp = (Hp) ComputerFactory.getInstance(Hp.class);
            hp.getBrand();

            Mac mac = (Mac) ComputerFactory.getInstance(Mac.class);
            mac.getBrand();

        } catch (IllegalAccessException | InstantiationException e) {
            e.printStackTrace();
        }

        Hp hp2 = (Hp) ComputerFactory.getInstance(ComputerBrand.HP);
        hp2.getBrand();

        Mac mac2 = (Mac) ComputerFactory.getInstance(ComputerBrand.MAC);
        mac2.getBrand();
    }
}
