package design.patterns.decorator;

public class Meizu16 extends PhoneDecorator {

    public Meizu16(AndroidPhone basicPhone){
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName() + "Meizu16";
    }

    @Override
    public int getCameraCount() {
        return super.getCameraCount() + 1;
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 100;
    }

    public String getColor() {
        return "Blue";
    }
}
