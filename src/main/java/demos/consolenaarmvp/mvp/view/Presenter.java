package demos.consolenaarmvp.mvp.view;

import demos.consolenaarmvp.mvp.model.Game;
import javafx.scene.control.Alert;

public class Presenter {
    private Game model;
    private View view;

    public Presenter(Game model, View view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getRollButton().setOnAction(event -> roll());
    }

    private void roll() {
        boolean done = model.roll();
        updateView();
        if (done) {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Het spel is gedaan!\nJe score is: " + model.getScore());
            alert.setTitle("End Game");
            alert.showAndWait();
        }
    }

    private void updateView() {
        view.getDiceLabel().setText(""+model.getDiceValue());
        view.getScoreLabel().setText(""+model.getScore());
    }

    public void addWindowEventHandlers() {

    }
}
