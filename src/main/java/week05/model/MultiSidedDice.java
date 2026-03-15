package week05.model;

import java.util.Random;

public class MultiSidedDice {
    public static final int MAX_VALUE = 99;
    public static final int MIN_VALUE = 0;
    private int currentValue = MIN_VALUE;
    private int min = MIN_VALUE;
    private int max = MAX_VALUE;

    private Random random = new Random();

    public MultiSidedDice() {
        this(1,6);
    }

    public MultiSidedDice(int minimum, int maximum) {
        setMinAndMax(minimum, maximum);
        throwDice();
    }
    public void throwDice(){
        currentValue = random.nextInt(this.max + 1 - this.min) + this.min;
    }
    public int getCurrentDiceValue() {
        return currentValue;
    }
    public int getNewDiceValue() {
        throwDice();
        return currentValue;
    }
    public int getDiceMinimum () { return this.min;}

    public int getDiceMaximum() {
        return max;
    }

    public int getNumberOfSides () { return this.max - this.min + 1;}

    public void setMinAndMax(int min, int max) throws IllegalArgumentException{
        if (min < MIN_VALUE || min > MAX_VALUE) {
            this.min = 1;
            this.max = 100;
            throw new IllegalArgumentException("Min must be between " + MIN_VALUE + " and " + MAX_VALUE);
        }

        if (max < MIN_VALUE || max > MAX_VALUE) {
            this.min = 1;
            this.max = 100;
            throw new IllegalArgumentException("Max must be between " + MIN_VALUE + " and " + MAX_VALUE);
        }

        if (min >= max) {
            this.min = max-1;
            throw new IllegalArgumentException("The min-value must be lower than max.");
        }
        this.min = min;
        this.max = max;
    }
}
