package week04.geboortelijst.javaFX.model;

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

    public void koop(String geschenknaam, String koper) throws GeboortelijstException {
        for (Geschenk geschenk: geschenken) {
            if (geschenk.getNaam().equalsIgnoreCase(geschenknaam)) {
                geschenk.setKoper(koper);
                return;
            }
        }

        throw new GeboortelijstException("\"" + geschenknaam + "\" staat niet in de lijst.");
    }

    public List<Geschenk> getGeschenken(){
        return this.geschenken;
    }
}
