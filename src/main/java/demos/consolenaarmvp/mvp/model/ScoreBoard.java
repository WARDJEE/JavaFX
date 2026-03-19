package demos.consolenaarmvp.mvp.model;

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
