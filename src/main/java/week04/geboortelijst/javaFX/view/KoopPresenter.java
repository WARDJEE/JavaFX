package week04.geboortelijst.javaFX.view;

import week04.geboortelijst.javaFX.model.Geboortelijst;
import week04.geboortelijst.javaFX.model.GeboortelijstException;
import javafx.scene.control.Alert;

public class KoopPresenter {
    private Geboortelijst model;
    private KoopView view;

    public KoopPresenter(Geboortelijst model, KoopView view) {
        this.model = model;
        this.view = view;

        view.getBevestig().setOnAction(e -> {
            try {
                model.koop(view.getGeschenkNaam(), view.getKoper());
                view.getScene().getWindow().hide();
            } catch (GeboortelijstException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
                alert.showAndWait();
            }
        });
    }
}