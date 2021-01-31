package design.patterns.abstractfactory.factory;

import design.patterns.abstractfactory.button.Button;
import design.patterns.abstractfactory.checkbox.Checkbox;

public interface GUIFactory {

    Button createButton();

    Checkbox createCheckbox();
}
