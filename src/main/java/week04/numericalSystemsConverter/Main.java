package week04.numericalSystemsConverter;

import week04.numericalSystemsConverter.model.ModelConverter;
import week04.numericalSystemsConverter.view.ConverterPresenter;
import week04.numericalSystemsConverter.view.ConverterView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args){launch(args);}

    @Override
    public void start(Stage primaryStage) {
        ModelConverter model = new ModelConverter();
        ConverterView view = new ConverterView();
        primaryStage.setScene(new Scene(view));
        new ConverterPresenter(model, view);
        primaryStage.show();
    }
}
