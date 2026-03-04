package demos.observerdemo;

class StatisticsDisplay implements Observer {
    private static final int MAX_TEMPS = 5;
    private final double[] lastTemperatures;

    public StatisticsDisplay() {
        this.lastTemperatures = new double[MAX_TEMPS];
    }

    public void update(Object arg) {
        double temp = (Double)arg;
        double sum = 0.0;
        for(int i=0; i<(MAX_TEMPS-1); i++) {
            lastTemperatures[i] = lastTemperatures[i+1];
            sum += lastTemperatures[i];
        }
        lastTemperatures[MAX_TEMPS-1] = temp;
        sum += temp;
        System.out.println("Average updated with: " + sum/MAX_TEMPS);
    }
}
