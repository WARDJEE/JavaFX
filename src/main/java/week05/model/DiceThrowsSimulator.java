package week05.model;

import week05.database.DiceDao;

import java.sql.SQLException;

public class DiceThrowsSimulator {
    private MultiSidedDice dice;
    private ThrowsArchive throwsArchive;
    private DiceDao diceDao;

    public DiceThrowsSimulator (DiceDao diceDao) {
        this(1,6, diceDao);
    }
    public DiceThrowsSimulator (int minimum, int maximum, DiceDao diceDao) {
        dice = new MultiSidedDice(minimum,maximum);
        throwsArchive = new ThrowsArchive();
        throwsArchive.addValueToArchive (dice);
        this.diceDao = diceDao;
    }
    public int getMultiSidedDiceValue () {
        return dice.getCurrentDiceValue();
    }
    public int multiSidedDiceThrow (int minimum, int maximum) {
        dice.setMinAndMax(minimum, maximum);
        int value = dice.getNewDiceValue();
        throwsArchive.addValueToArchive (dice);

        try {
            diceDao.create(dice);
        } catch (SQLException e) {
            System.err.println("Kan niet opslaan: " + e.getMessage());
        }

        return value;
    }
    public MultiSidedDice getDice (){return dice;}
    public ThrowsArchive getThrowsArchive () {return throwsArchive;}
}
