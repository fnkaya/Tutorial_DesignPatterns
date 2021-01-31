package design.patterns.abstractfactory;

import design.patterns.abstractfactory.button.Button;
import design.patterns.abstractfactory.checkbox.Checkbox;
import design.patterns.abstractfactory.factory.GUIFactory;

public class Application {

    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        button = guiFactory.createButton();
        checkbox = guiFactory.createCheckbox();
    }

    public void render() {
        button.render();
        checkbox.render();
    }
}
