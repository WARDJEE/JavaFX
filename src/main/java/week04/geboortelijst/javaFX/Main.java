package week04.geboortelijst.javaFX;

import week04.geboortelijst.javaFX.model.*;
import week04.geboortelijst.javaFX.view.*;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        Geboortelijst model = new Geboortelijst("Josefien");
        try {
            model.voegGeschenkToe(new Geschenk("buggy", 120));
            model.voegGeschenkToe(new Geschenk("maxicosi", 100));
            model.voegGeschenkToe(new Geschenk("teddybeer", 20));
            model.voegGeschenkToe(new Geschenk("pampers", 10));
        } catch (IllegalArgumentException e) {
            System.err.println("Fout bij aanmaken model: " + e.getMessage());
        }

        GeboortelijstView view = new GeboortelijstView();
        new GeboortelijstPresenter(model, view);

        primaryStage.setScene(new Scene(view, 400, 400));
        primaryStage.setTitle("Geboortelijst");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
