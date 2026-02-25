package week01.OnStage;

import javafx.application.Application;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setWidth(500);
        stage.setHeight(600);


        //stage.setResizable(false);
        stage.setTitle("stage");
        stage.setMaxWidth(700);

        Stage stage2 = new Stage();
        stage2.setTitle("stage 2");
        Scene scene = new Scene(new Group(), 500, 600);
        scene.setCursor(Cursor.CROSSHAIR);

        scene.setFill(Color.YELLOW);

        stage2.setScene(scene);

        stage.show();
        stage2.show();

    }
}
