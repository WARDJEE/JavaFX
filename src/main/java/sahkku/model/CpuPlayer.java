package sahkku.model;

import sahkku.model.enums.Difficulty;
import sahkku.model.enums.Gender;

public class CpuPlayer extends Player {
    private Difficulty difficulty;

    public CpuPlayer(Gender team, int steps, int captured, Difficulty difficulty) {
        super(team, steps, captured);
        this.difficulty = difficulty;
    }


    //GETTERS
    public Difficulty getDifficulty() {
        return difficulty;
    }
}
