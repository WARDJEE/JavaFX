package week04.geboortelijst.javaFX.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import week04.geboortelijst.javaFX.model.Geschenk;

public class GeboortelijstView extends BorderPane {
    private ListView<Geschenk> geschenken;
    private Button koop;

    public GeboortelijstView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        geschenken = new ListView<>();
        koop = new Button("Koop");
    }

    private void layoutNodes() {
        Label titel = new Label("Geboortelijst van: Josefien");

        VBox midden = new VBox(titel, geschenken);
        midden.setAlignment(Pos.CENTER);
        titel.setStyle("-fx-font-size: 20");

        this.setCenter(midden);
        this.setBottom(koop);
        setAlignment(koop, Pos.BOTTOM_RIGHT);
        setPadding(new Insets(10));

    }

    public ListView<Geschenk> getGeschenken() { return geschenken; }
    public Button getKoop() { return koop; }

}