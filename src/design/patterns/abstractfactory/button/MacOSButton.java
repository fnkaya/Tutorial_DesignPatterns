package design.patterns.abstractfactory.button;

public class MacOSButton implements Button {

    @Override
    public void render() {
        System.out.println("You have created a MacOSButton.");
    }
}
