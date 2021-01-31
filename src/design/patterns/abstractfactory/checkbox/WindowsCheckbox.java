package design.patterns.abstractfactory.checkbox;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void render() {
        System.out.println("You have created a WindowsCheckbox.");
    }
}
