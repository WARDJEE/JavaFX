package week05;

import week05.database.DiceDao;
import week05.model.DiceThrowsSimulator;
import week05.view.MainScreenPresenter;
import week05.view.MainScreenView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;

public class HundredSidedMain extends Application {
    private DiceDao diceDao;

    @Override
    public void start(Stage primaryStage) {
        try {
            diceDao = new DiceDao();
            DiceThrowsSimulator model = new DiceThrowsSimulator(diceDao);
            MainScreenView view = new MainScreenView();
            MainScreenPresenter presenter = new MainScreenPresenter(model, view, diceDao);
            Scene scene = new Scene(view);

            primaryStage.setScene(scene);
            primaryStage.setHeight(600);
            primaryStage.setWidth(600);
            primaryStage.setTitle("1- to 100-Sided Dice");


            presenter.windowsHandler();
            primaryStage.show();
        }catch (SQLException e){
            System.err.println("Fout: "+ e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void stop() throws Exception {
        if (diceDao != null) {
            diceDao.close();
            System.out.println("Database is veilig afgesloten.");
        }
    }
}
