package sahkku.controllers;

import sahkku.model.MatchStatsModel;
import sahkku.model.MatchTimerModel;

public class MatchController {
    private MatchStatsModel matchStatsModel;
    private MatchTimerModel matchTimerModel;

    public MatchController(){
        matchStatsModel = new MatchStatsModel();
        matchTimerModel = new MatchTimerModel();

    }

    // MatchStatsModel
    public String getPlayer1() {
        return matchStatsModel.getPlayer1();
    }

    public String getPlayer2() {
        return matchStatsModel.getPlayer2();
    }

    public int getCapturedPawns1() {
        return matchStatsModel.getCapturedPawns1();
    }

    public int getCapturedPawns2() {
        return matchStatsModel.getCapturedPawns2();
    }

    public int getSteps1() {
        return matchStatsModel.getSteps1();
    }

    public int getSteps2() {
        return matchStatsModel.getSteps2();
    }

    // MatchTimerModel
    public void add1(){
        matchTimerModel.add1();
    }

    public String getTime(){
        return String.format("%02d:%02d", matchTimerModel.getSeconds() / 60, matchTimerModel.getSeconds() % 60);
    }

    public void running(boolean running){
        matchTimerModel.running(running);
    }

    public boolean isRunning() {
        return matchTimerModel.isRunning();
    }
}




