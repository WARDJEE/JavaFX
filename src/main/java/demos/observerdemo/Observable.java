package demos.observerdemo;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(Object arg) {
        for(Observer observer : observers) {
            observer.update(arg);
        }
    }
}
