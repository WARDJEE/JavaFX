package sahkku.model;

import sahkku.model.enums.Gender;

public abstract class Player {
    private Gender team;
    private int steps;
    private int captured;

    public Player(Gender team, int steps, int captured) {
        this.team = team;
        this.steps = steps;
        this.captured = captured;
    }

    // To keep count of how many pieces have been captured
    public void addCapturedPieces(int captured) {
        this.captured += captured;
    }

    //GETTERS
    public Gender getTeam() {
        return this.team;
    }
    public int getSteps() {
        return this.steps;
    }
    public int getCaptured() {
        return this.captured;
    }



}
