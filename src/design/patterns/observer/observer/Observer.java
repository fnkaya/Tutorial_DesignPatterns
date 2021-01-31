package design.patterns.observer.observer;

import java.io.File;

public interface Observer {

    void update(String eventType, File file);
}
