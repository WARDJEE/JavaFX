package week04.geboortelijst.javaFX.view;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Modality;
import javafx.stage.Stage;
import week04.geboortelijst.javaFX.model.Geboortelijst;
import week04.geboortelijst.javaFX.model.GeboortelijstException;
import week04.geboortelijst.javaFX.model.Geschenk;

import java.util.List;

public class GeboortelijstPresenter {
    private Geboortelijst model;
    private GeboortelijstView view;

    public GeboortelijstPresenter(Geboortelijst model, GeboortelijstView view) {
        this.model = model;
        this.view = view;
        updateView();
        addEventHandlers();
    }

    private void updateView() {
        List<Geschenk> lijst = model.getGeschenken();

        view.getGeschenken().getItems().clear();
        if (lijst != null) {
            view.getGeschenken().getItems().addAll(lijst);
        }
    }

    private void addEventHandlers() {
        view.getKoop().setOnAction(e -> openKoopWindow());
    }

    private void openKoopWindow() {
        KoopView koopView = new KoopView();
        Stage popup = new Stage();
        popup.initModality(Modality.APPLICATION_MODAL);

        koopView.getBtnBevestig().setOnAction(e -> {
            try {
                model.koop(koopView.getGeschenkNaam(), koopView.getKoper());
                updateView();
                popup.close();
            } catch (GeboortelijstException ex) {
                Alert alert = new Alert(Alert.AlertType.ERROR, ex.getMessage());
                alert.showAndWait();
            }
        });

        popup.setScene(new Scene(koopView));
        popup.setTitle("Koop een geschenk");
        popup.show();
    }
}