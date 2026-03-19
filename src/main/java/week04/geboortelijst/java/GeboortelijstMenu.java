package week04.geboortelijst.java;

import java.util.Scanner;

public class GeboortelijstMenu {
    private Geboortelijst geboortelijst;

    public GeboortelijstMenu(Geboortelijst geboortelijst) {
        this.geboortelijst = geboortelijst;
    }

    public void toon() {
        System.out.println("Geboortelijstapplicatie...");
        geboortelijst.toon();
        String antwoord = null;
        do {
            System.out.print("Welk geschenk wil je kopen? ");
            Scanner scanner = new Scanner(System.in);
            String geschenknaam = scanner.nextLine();
            System.out.print("Wat is je naam? ");
            String koper = scanner.nextLine();
            try {
                geboortelijst.koop(geschenknaam, koper);
                geboortelijst.toon();
            } catch (GeboortelijstException e) {
                System.out.println("Fout: " + e.getMessage());
            }
            System.out.print("Nog geschenken kopen? ");
            antwoord = scanner.nextLine();
        } while (antwoord.equalsIgnoreCase("ja"));
    }
}
