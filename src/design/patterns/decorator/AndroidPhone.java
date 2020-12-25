package design.patterns.decorator;

public class AndroidPhone implements Phone{

    @Override
    public String getName() {
        return "Android ";
    }

    @Override
    public int getCameraCount() {
        return 2;
    }

    @Override
    public double getPrice() {
        return 1000;
    }
}
