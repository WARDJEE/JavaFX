package week06;

import week06.model.ModelWorldOfColors;
import week06.view.flagscreen.FlagScreenPresenter;
import week06.view.flagscreen.FlagScreenView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainWorldOfColors extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ModelWorldOfColors model = new ModelWorldOfColors();
        FlagScreenView flagScreenView = new FlagScreenView();

        primaryStage.setScene(new Scene(flagScreenView));
        new FlagScreenPresenter(model, flagScreenView);
        primaryStage.show();
    }
}

