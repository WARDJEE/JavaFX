package week02.birds;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        stage.setHeight(500);
        stage.setWidth(500);
        Scene scene = new Scene(new View(stage));
        stage.setScene(scene);
        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }


}
