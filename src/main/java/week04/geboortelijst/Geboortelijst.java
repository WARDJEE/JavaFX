package week04.geboortelijst;

import java.util.ArrayList;
import java.util.List;

public class Geboortelijst {
    private String naam;
    private List<Geschenk> geschenken;

    public Geboortelijst(String naam) {
        this.naam = naam;
        this.geschenken = new ArrayList<>();
    }

    public void voegGeschenkToe(Geschenk geschenk){
        geschenken.add(geschenk);
    }

    public void koop(String geschenknaam, String koper) throws GeboortelijstException{
        //zoek het geschenk op in de lijst:
        for (Geschenk geschenk: geschenken) {
            if (geschenk.getNaam().equals(geschenknaam)) {
                geschenk.setKoper(koper);
                return;
            }
        }

        throw new GeboortelijstException("\"" + geschenknaam + "\" staat niet in de lijst.");
    }

    public void toon(){
        System.out.println("Geboortelijst van " + naam);
        System.out.println("===============================");
        for (Geschenk geschenk : geschenken) {
            System.out.println(geschenk);
        }
    }
}
