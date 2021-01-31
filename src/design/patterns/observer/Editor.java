package design.patterns.observer;

import design.patterns.observer.observable.EventManager;

import java.io.File;
import java.io.FileNotFoundException;

public class Editor {

    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws FileNotFoundException {
        if (this.file != null)
            events.notify("save", file);
        else
            throw new FileNotFoundException("Please open a file first");
    }
}
