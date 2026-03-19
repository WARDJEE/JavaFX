package demos.samenvattingDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputDemo {
    private static int readInt() {
        Scanner keyboard = new Scanner(System.in);
        boolean success = false;
        int i = 0;
        do {
            System.out.print("Geef een getal: ");
            try {
                i = keyboard.nextInt();
                if (i >= 0) {
                    success = true;
                } else {
                    throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.out.println("fout! Probeer opnieuw");
                // succes is already false
            }
        } while (!success);
        return i;
    }

    public static void main(String[] args) {
        int number1 = readInt();
        int number2 = readInt();
        System.out.println(number1/number2);
    }
}
