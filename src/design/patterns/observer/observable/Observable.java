package design.patterns.observer.observable;

import design.patterns.observer.observer.Observer;

import java.io.File;

public interface Observable {

    void subscribe(String eventType, Observer listener);

    void unsubscribe(String eventType, Observer listener);

    void notify(String eventType, File file);
}
