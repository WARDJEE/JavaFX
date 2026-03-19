package week01.background;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {

        Background model = new Background();
        BackgroundView view = new BackgroundView();
        new BackgroundPresenter(model, view);
        stage.setTitle("Background");
        stage.setWidth(400);
        stage.setHeight(250);

        Scene scene = new Scene(view);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
