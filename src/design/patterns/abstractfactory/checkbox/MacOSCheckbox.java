package design.patterns.abstractfactory.checkbox;

import design.patterns.abstractfactory.checkbox.Checkbox;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("You have created a MacOSCheckbox.");
    }
}
