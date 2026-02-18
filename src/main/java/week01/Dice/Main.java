package week01.Dice;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("dice");
        DiceView view = new DiceView();
        Dice model = new Dice();
        DicePresenter presenter = new DicePresenter(model, view);

        stage.setScene(new Scene(view));
        stage.show();

    }
}
