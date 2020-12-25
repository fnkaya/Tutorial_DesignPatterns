package design.patterns.decorator;

public abstract class PhoneDecorator implements Phone{

    protected Phone basicPhone;

    public PhoneDecorator(AndroidPhone basicPhone) {
        this.basicPhone = basicPhone;
    }

    @Override
    public String getName() {
        return basicPhone.getName();
    }

    @Override
    public int getCameraCount() {
        return basicPhone.getCameraCount();
    }

    @Override
    public double getPrice() {
        return basicPhone.getPrice();
    }
}
