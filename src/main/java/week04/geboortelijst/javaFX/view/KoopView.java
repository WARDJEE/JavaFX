package week04.geboortelijst.javaFX.view;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

public class KoopView extends GridPane {
    private TextField naam;
    private TextField geschenk;
    private Button bevestig;

    public KoopView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        naam = new TextField();
        geschenk = new TextField();
        bevestig = new Button("Koop!");
    }


    private void layoutNodes() {
        this.setPadding(new Insets(10));
        this.setHgap(10);
        this.setVgap(10);
        this.add(new Label("Naam:"), 0, 0);
        this.add(naam, 1, 0);
        this.add(new Label("Geschenk:"), 0, 1);
        this.add(geschenk, 1, 1);
        this.add(bevestig, 1, 2);
    }

    public String getKoper() { return naam.getText(); }
    public String getGeschenkNaam() { return geschenk.getText(); }
    public Button getBtnBevestig() { return bevestig; }

    public Button getButton(){
        return bevestig;
    }
}