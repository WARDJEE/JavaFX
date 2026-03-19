package demos.consolenaarmvp.mvp.model;

public class Game {
    static private final int NUMBER_OF_TURNS = 5;

    private Dice dice;
    private ScoreBoard scoreBoard;
    private int turn;

    public Game() {
        this.dice = new Dice();
        this.scoreBoard = new ScoreBoard();
        this.turn = 0;
    }

    /**
     * rolls the dice and updates the score
     *
     * @return true if the game ended
     */
    public boolean roll() {
        if (turn >= NUMBER_OF_TURNS) return true;
        dice.roll();
        updateScore();
        turn++;
        return false;
    }

    private void updateScore() {
        if (dice.getValue()==6) {
            scoreBoard.addToScore(1);
        }
    }

    public int getScore() {
        return scoreBoard.getScore();
    }

    public int getDiceValue() {
        return dice.getValue();
    }
}
