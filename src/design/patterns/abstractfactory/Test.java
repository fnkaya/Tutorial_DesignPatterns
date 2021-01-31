package design.patterns.abstractfactory;

import design.patterns.abstractfactory.factory.MacOSFactory;
import design.patterns.abstractfactory.factory.WindowsFactory;

public class Test {

    public static void main(String[] args) {

        Application app = configureApplication("windows");
        app.render();
    }

    private static Application configureApplication(String osName) {
        osName = osName.toLowerCase();

        if (osName.contains("mac"))
            return new Application(new MacOSFactory());
        else if (osName.contains("windows"))
            return new Application(new WindowsFactory());
        else
            throw new IllegalArgumentException();
    }
}
