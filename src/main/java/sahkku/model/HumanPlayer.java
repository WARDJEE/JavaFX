package sahkku.model;

import sahkku.model.enums.Gender;

public class HumanPlayer extends Player {
    private String name;

    public HumanPlayer(String name, Gender team, int steps, int captured) {
        super(team, steps, captured);
        this.name = name;
    }

    //GETTERS & SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
