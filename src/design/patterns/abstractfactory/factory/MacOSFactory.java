package design.patterns.abstractfactory.factory;

import design.patterns.abstractfactory.button.Button;
import design.patterns.abstractfactory.button.MacOSButton;
import design.patterns.abstractfactory.checkbox.Checkbox;
import design.patterns.abstractfactory.checkbox.MacOSCheckbox;

public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
