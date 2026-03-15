package week05.view;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;
import week05.database.DiceDao;
import week05.model.DiceThrowsSimulator;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.WindowEvent;

import java.sql.SQLException;
import java.util.List;

public class MainScreenPresenter {

    private DiceThrowsSimulator model;
    private MainScreenView view;
    private DiceDao diceDao;

    public MainScreenPresenter(DiceThrowsSimulator model, MainScreenView view, DiceDao diceDao) {
        this.model = model;
        this.view = view;
        this.diceDao = diceDao;
        EventHandlers();
        updateView();
    }


    private void EventHandlers() {
        view.getBtnGenerate().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int maxValue = (int) view.getSpinnerMax().getValue();
                int minValue = (int) view.getSpinnerMin().getValue();
                try {
                    model.multiSidedDiceThrow(minValue, maxValue);
                } catch (IllegalArgumentException e) {
                    showError(e);
                }
                updateView();
            }
        });
    }

    private void updateView() {
        int multiSidedDiceValue = model.getMultiSidedDiceValue();
        String nameOfFileTens = "number" + multiSidedDiceValue / 10 + ".jpg";
        String nameOfFileUnit = "number" + multiSidedDiceValue % 10 + ".jpg";

        view.getNumberTens().setImage(new Image(nameOfFileTens));
        view.getNumberUnit().setImage(new Image(nameOfFileUnit));
    }


    public void windowsHandler() {
        view.getScene().getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                handleCloseEvent(event);
            }
        });

        view.getExit().setOnAction(e -> handleCloseEvent(e));

        view.getAbout().setOnAction(e -> {
            Stage about = new Stage();
            about.setTitle("1- to 100-Sided Dice - About");

            AboutScreenView aboutScreenView = new AboutScreenView();
            new AboutScreenPresenter(aboutScreenView);

            about.setScene(new Scene(aboutScreenView));
            about.initModality(Modality.APPLICATION_MODAL);
            about.show();
        });

        view.getOverview().setOnAction(e -> {
            try {
                ResultScreenView resultScreenView = new ResultScreenView();

                List<Object[]> stats = diceDao.getStats();
                resultScreenView.createTable(stats);

                Stage stage = new Stage();
                stage.setTitle("1- to 100-Sided Dice - Overview results");
                stage.setScene(new Scene(resultScreenView, 400, 300));
                stage.show();
            } catch (SQLException ex) {
                showError(ex);
            }
        });
    }

    private void handleCloseEvent(Event event) {
        final Alert stopWindow = new Alert(Alert.AlertType.CONFIRMATION);
        stopWindow.setHeaderText("You're closing the application.");
        stopWindow.setContentText("Are you sure?");
        stopWindow.setTitle("WARNING!");
        stopWindow.getButtonTypes().clear();
        ButtonType noButton = new ButtonType("No");
        ButtonType yesButton = new ButtonType("Yes");
        stopWindow.getButtonTypes().addAll(yesButton, noButton);
        stopWindow.showAndWait();
        if (stopWindow.getResult() == null || stopWindow.getResult().equals(noButton)) {
            event.consume();
        } else {
            view.getScene().getWindow().hide();
        }
    }

    private void showError(Exception exc) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText(exc.getMessage());
        alert.showAndWait();
    }
}

