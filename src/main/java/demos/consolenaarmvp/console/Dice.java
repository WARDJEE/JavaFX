package demos.consolenaarmvp.console;

public class Dice {
    private int value;

    public Dice() {
        roll();
    }

    public int getValue() {
        return value;
    }

    public final void roll() {
        this.value = (int)(Math.random()*6)+1;
    }
}
