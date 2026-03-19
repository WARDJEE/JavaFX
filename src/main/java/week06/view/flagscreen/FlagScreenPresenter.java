package week06.view.flagscreen;

import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import week06.model.FlagType;
import week06.model.ModelWorldOfColors;
import week06.view.randomcolorsscreen.RandomColorsScreenPresenter;
import week06.view.randomcolorsscreen.RandomColorsScreenView;

public class FlagScreenPresenter {
    private final ModelWorldOfColors model;
    private final FlagScreenView view;

    public FlagScreenPresenter(
            ModelWorldOfColors model, FlagScreenView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getGenerateButton().setOnAction(e -> {
            if (view.getVertical().isSelected()) {
                model.setFlagType(FlagType.VERTICAL);
            } else {
                model.setFlagType(FlagType.HORIZONTAL);
            }

            RandomColorsScreenView view = new RandomColorsScreenView();
            new RandomColorsScreenPresenter(model, view);

            Stage stage = new Stage();
            stage.setScene(new Scene(view));
            stage.show();

            Stage current = (Stage) this.view.getScene().getWindow();
            this.view.getScene().getWindow().hide();


            stage.setOnCloseRequest(ev -> {
                        view.getScene().getWindow().hide();
                    }
            );

            stage.setOnHidden(ev -> current.show());


        });

        view.getEndButton().setOnAction(e -> handleCloseEvent());
    }

    private void handleCloseEvent() {
        final Alert stopWindow = new Alert(Alert.AlertType.INFORMATION);
        stopWindow.setHeaderText("The flag you made has following characteristics:");
        stopWindow.setContentText(model.toString());
        stopWindow.setTitle("Message");
        stopWindow.getButtonTypes().clear();
        ButtonType ok = new ButtonType("ok");
        stopWindow.getButtonTypes().add(ok);
        stopWindow.showAndWait();
        if (stopWindow.getResult().equals(ok)) {
            view.getScene().getWindow().hide();
        }
    }

}

