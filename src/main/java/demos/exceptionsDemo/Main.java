package demos.exceptionsDemo;

import demos.exceptionsDemo.model.FavouritesModel;
import demos.exceptionsDemo.view.ExceptionsPresenter;
import demos.exceptionsDemo.view.ExceptionsView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        FavouritesModel model = new FavouritesModel();
        ExceptionsView view = new ExceptionsView();
        ExceptionsPresenter presenter = new ExceptionsPresenter(model, view);
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("Favourites");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
