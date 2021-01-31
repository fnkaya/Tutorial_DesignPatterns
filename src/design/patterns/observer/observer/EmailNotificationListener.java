package design.patterns.observer.observer;

import java.io.File;

public class EmailNotificationListener implements Observer {

    private final String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + this.email + ": Someone has performed " + eventType + " operations with the following file: " + file.getName());
    }
}
