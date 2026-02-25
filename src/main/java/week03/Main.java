package week03;

import week03.model.TrafficLightOperations;
import week03.view.trafficLightScreen.TrafficLightPresenter;
import week03.view.trafficLightScreen.TrafficLightView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) {
        TrafficLightOperations model = new TrafficLightOperations();
        TrafficLightView view = new TrafficLightView();

        primaryStage.setScene(new Scene(view));

        new TrafficLightPresenter(model, view);

        primaryStage.show();
    }


    public static void main(String[] args){
        Application.launch(args);}
}

