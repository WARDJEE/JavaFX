package demos.observerdemo;

public class Thermostat implements Observer {
    private double desiredTemp;

    public Thermostat() {
        this.desiredTemp = 20.0;
    }

    public void update(Object arg) {
        double temp = (Double)arg;
        if (temp < desiredTemp) {
            System.out.println("Turn on heating");
        } else {
            System.out.println("Turn off heating");
        }
    }
}
