package ip.model;

public class MatchModel {
    private String player1 = "Player 1";
    private String player2 = "Player 2";
    private int capturedPawns1 = 5;
    private int capturedPawns2 = 6;
    private int steps1 = 68;
    private int steps2 = 73;

    public MatchModel(){}

    public String getPlayer1() {
        return player1;
    }

    public String getPlayer2() {
        return player2;
    }

    public int getCapturedPawns1() {
        return capturedPawns1;
    }

    public int getCapturedPawns2() {
        return capturedPawns2;
    }

    public int getSteps1() {
        return steps1;
    }

    public int getSteps2() {
        return steps2;
    }
}

