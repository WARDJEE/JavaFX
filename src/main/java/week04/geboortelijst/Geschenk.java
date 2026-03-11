package week04.geboortelijst;

public class Geschenk {
    private String naam;
    private double prijs;
    private String koper;

    public Geschenk(String naam, double prijs) {
        setPrijs(prijs);
        setNaam(naam);
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        if (naam == null || naam.trim().length() < 3) {
            throw new IllegalArgumentException("Naam moet minstens 3 tekens bevatten.");
        }
        this.naam = naam;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs(double prijs) {
        if (prijs < 0) {
            throw new IllegalArgumentException("Prijs mag niet negatief zijn.");
        }
       this.prijs = prijs;
    }

    public String getKoper() {
        return koper;
    }

    public void setKoper(String koper) throws  GeboortelijstException{
        if (this.koper != null){
            throw new GeboortelijstException(this.koper + " heeft " + this.naam + " al gekocht.");
        }
        this.koper = koper;
    }

    @Override
    public String toString() {
        return String.format("%s (€%.2f)", naam, prijs)
                + (koper != null ? ", gekocht door " + koper : "");
    }


}
