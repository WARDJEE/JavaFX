package demos.observerdemo;

class ConsoleDisplay implements Observer {
    public void update(Object arg) {
        double temp = (Double)arg;
        System.out.println("Current temperature: " + temp);
    }
}
