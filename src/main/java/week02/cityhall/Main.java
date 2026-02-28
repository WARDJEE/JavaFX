package week02.cityhall;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week02.cityhall.view.CityHallPane;
import week02.cityhall.view.Presenter;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final CityHallPane view = new CityHallPane();
        primaryStage.setTitle("City Hall");
        primaryStage.setScene(new Scene(view));
        final Presenter presenter = new Presenter(view);
        primaryStage.show();
    }
}
