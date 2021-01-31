package design.patterns.observer;

import design.patterns.observer.observer.EmailNotificationListener;
import design.patterns.observer.observer.LogOpenListener;

import java.io.FileNotFoundException;

public class Test {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("fnkaya@gmail.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
