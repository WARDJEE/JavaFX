package demos.consolenaarmvp.mvp;

import demos.consolenaarmvp.mvp.model.Game;
import demos.consolenaarmvp.mvp.view.Presenter;
import demos.consolenaarmvp.mvp.view.View;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public void start(Stage primaryStage) {
        Game model = new Game();
        View view = new View();
        Presenter presenter = new Presenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Demo");
        presenter.addWindowEventHandlers();
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
