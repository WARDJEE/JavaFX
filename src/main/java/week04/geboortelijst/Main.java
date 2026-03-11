package week04.geboortelijst;

public class Main {
    public static void main(String[] args) {
        try {
            Geboortelijst geboortelijst = new Geboortelijst("Josefien");
            geboortelijst.voegGeschenkToe(new Geschenk("buggy", 120));
            geboortelijst.voegGeschenkToe(new Geschenk("maxicosi", 100));
            geboortelijst.voegGeschenkToe(new Geschenk("teddybeer", 20));
            geboortelijst.voegGeschenkToe(new Geschenk("pampers", 10));

            GeboortelijstMenu menu = new GeboortelijstMenu(geboortelijst);
            menu.toon();

        } catch (IllegalArgumentException e) {
            System.out.println("Fout: " + e.getMessage());
        }
    }
}
