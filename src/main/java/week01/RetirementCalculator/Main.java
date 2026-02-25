package week01.RetirementCalculator;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        RetirementView view = new RetirementView();
        Retirement model = new Retirement();
        stage.setTitle("Retirement calculator");
        stage.setWidth(400);

        new RetirementPresenter(model, view);
        stage.setScene(new Scene(view));

        stage.show();
    }
}
