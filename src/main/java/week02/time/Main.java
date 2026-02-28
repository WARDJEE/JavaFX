package week02.time;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        final TimeModel model = new TimeModel();
        final TimeView view =  new TimeView();
        primaryStage.setTitle("Time");
        primaryStage.setScene(new Scene(view));
        new Presenter(model, view);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
