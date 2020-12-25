package design.patterns.factory;

class Hp implements Computer{

    @Override
    public void getBrand() {
        System.out.println("Marka HP");
    }
}
