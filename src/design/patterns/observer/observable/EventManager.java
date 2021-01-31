package design.patterns.observer.observable;

import design.patterns.observer.observer.Observer;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager implements Observable {

    Map<String, List<Observer>> listeners;

    public EventManager(String... operations) {
        this.listeners = new HashMap<>();
        for (String operation : operations)
            this.listeners.put(operation, new ArrayList<>());
    }

    @Override
    public void subscribe(String eventType, Observer listener) {
        List<Observer> observers = listeners.get(eventType);
        observers.add(listener);
    }

    @Override
    public void unsubscribe(String eventType, Observer listener) {
        List<Observer> observers = listeners.get(eventType);
        observers.remove(listener);
    }

    @Override
    public void notify(String eventType, File file) {
        List<Observer> observers = listeners.get(eventType);
        observers.forEach(listener -> listener.update(eventType, file));
    }
}
