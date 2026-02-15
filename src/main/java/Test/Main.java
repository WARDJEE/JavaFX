package Test;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) {

        //Model model = new Model();

        StartView startView = new StartView();

        Presenter presenter = new Presenter(startView, stage);

        Scene scene = new Scene(startView, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Files");
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}

