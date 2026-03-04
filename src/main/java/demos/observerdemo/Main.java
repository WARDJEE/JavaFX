package demos.observerdemo;

public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        ConsoleDisplay consoleDisplay = new ConsoleDisplay();
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay();
        Thermostat thermostat = new Thermostat();

        weatherStation.addObserver(consoleDisplay);
        weatherStation.addObserver(statisticsDisplay);
        //weatherStation.addObserver(thermostat);

        weatherStation.setTemperature(10);
        weatherStation.setTemperature(21);
        weatherStation.setTemperature(13);
    }
}
