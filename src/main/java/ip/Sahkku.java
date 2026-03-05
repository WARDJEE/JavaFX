package ip;

import ip.router.Router;
import ip.view.Menu.MainMenuView;
import ip.view.Menu.Presenter;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Sahkku extends Application {

    public void start(Stage stage) {
        StackPane root = new StackPane();
        Router router = new Router(root);
        // Main menu
        MainMenuView mainMenuView = new MainMenuView();

        // Presenter
        new Presenter(mainMenuView, router, stage);

        root.getChildren().add(mainMenuView);

        Scene scene = new Scene(root, 800, 500);
        stage.setScene(scene);
        stage.setTitle("Sáhkku");
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}