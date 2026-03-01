package week03.model;

import java.util.ArrayList;
import java.util.List;

public class Observable {
    private List<TrafficLightObserver> observers;

    public Observable() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(TrafficLightObserver observer) {
        this.observers.add(observer);
    }

    public void notifyObservers(Object arg) {
        for(TrafficLightObserver observer : observers) {
            observer.update(arg);
        }
    }
}
