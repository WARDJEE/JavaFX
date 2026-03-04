package demos.observerdemo;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation extends Observable {
    private double temperature;

    public WeatherStation() {
        this.temperature = 0.0;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        super.notifyObservers(temperature);
    }
}
