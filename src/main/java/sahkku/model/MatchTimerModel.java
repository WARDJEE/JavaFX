package sahkku.model;

public class MatchTimerModel {
    private int seconds;
    private boolean running;

    public void add1(){
        seconds++;
    }

    public String getTime(){
        return String.format("%02d:%02d", seconds / 60, seconds % 60);
    }

    public void running(boolean running){
        this.running = running;
    }

    public boolean isRunning() {
        return running;
    }

    public int getSeconds() {
        return seconds;
    }
}
