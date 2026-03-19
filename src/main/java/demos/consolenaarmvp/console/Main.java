package demos.consolenaarmvp.console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int NUMBER_OF_TURNS = 5;
        Dice dice = new Dice();
        ScoreBoard scoreBoard = new ScoreBoard();
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welkom in dit spel!");
        System.out.println("-------------------");

        int turn = 1;
        while (turn <= NUMBER_OF_TURNS) {
            System.out.println("\nBeurt nummer " + turn);
            System.out.print("Druk een toets om te rollen");
            keyboard.nextLine();
            dice.roll();
            System.out.println("Je rolde een " + dice.getValue());
            if (dice.getValue() == 6) {
                scoreBoard.addToScore(1);
            }
            System.out.println("Je huidige score is: " + scoreBoard.getScore());
            turn++;
        }

        System.out.println("------------------");
        System.out.println("Het spel is gedaan");
        System.out.println("Je uiteindelijke score is: " + scoreBoard.getScore());

    }
}
