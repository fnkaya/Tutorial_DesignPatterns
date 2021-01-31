package design.patterns.abstractfactory.button;

import design.patterns.abstractfactory.button.Button;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("You have created a WindowsButton.");
    }
}
