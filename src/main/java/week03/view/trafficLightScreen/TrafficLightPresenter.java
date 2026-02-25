package week03.view.trafficLightScreen;

import javafx.scene.paint.Color;
import week03.view.showData.ShowDataPresenter;
import week03.view.showData.ShowDataView;
import week03.model.TrafficLightOperations;


import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class TrafficLightPresenter {
    private final TrafficLightOperations model;
    private final TrafficLightView view;

    public TrafficLightPresenter(
            TrafficLightOperations model, TrafficLightView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getStartRadioButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (!model.isTrafficLightOn()) {
                    model.switchTrafficLightOn();
                }
                updateView();
            }
        });
        view.getStopRadioButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (model.isTrafficLightOn()) {
                    model.switchTrafficLightOff();
                }
                updateView();
            }
        });
        view.getshowDataItem().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ShowDataView showdataView = new ShowDataView();
                ShowDataPresenter showdataPresenter = new ShowDataPresenter(model, showdataView);
                Stage showdataStage = new Stage();
                showdataStage.initOwner(view.getScene().getWindow());
                showdataStage.initModality(Modality.APPLICATION_MODAL);
                Scene scene = new Scene(showdataView);
                showdataStage.setScene(scene);
                showdataStage.setTitle("Duration data of Traffic Light");
                showdataStage.setX(view.getScene().getWindow().getX() + 20);
                showdataStage.setY(view.getScene().getWindow().getY() + 20);
                showdataStage.getScene().getWindow().setHeight(350);
                showdataStage.getScene().getWindow().setWidth(350);
                showdataStage.showAndWait();
            }
        });
        view.getExitItem().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                handleCloseEvent(event);
            }
        });

        view.getSwitchColorButton().setOnAction(e -> {
            model.trafficLightNextColor();
            updateView();
        });
    }

    private void updateView() {
        if (model.isTrafficLightGreen()) {
            view.getBottomCircle().setFill(Color.GREEN);
        } else view.getBottomCircle().setFill(Color.BLACK);

        if (model.isTrafficLightRed()) {
            view.getTopCircle().setFill(Color.RED);
        } else view.getTopCircle().setFill(Color.BLACK);

        if (model.isTrafficLightYellow()) {
            view.getMiddleCircle().setFill(Color.YELLOW);
        } else view.getMiddleCircle().setFill(Color.BLACK);

    }

    public void windowsHandler() {
        view.getScene().getWindow().setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                handleCloseEvent(event);
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
}



