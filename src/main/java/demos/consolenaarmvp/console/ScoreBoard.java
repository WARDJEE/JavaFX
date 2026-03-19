package demos.consolenaarmvp.console;

public class ScoreBoard {
    private int score;

    public ScoreBoard() {
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public void addToScore(int i) {
        this.score += i;
    }
}
