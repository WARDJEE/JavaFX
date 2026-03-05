package week02.calculator;

import week02.calculator.model.Calculator;
import week02.calculator.view.CalculatorPane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import week02.calculator.view.Presenter;

public class Main extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Calculator model = new Calculator();
        CalculatorPane view = new CalculatorPane();



        primaryStage.setTitle("Calculator");
        primaryStage.setScene(new Scene(view));
        // TODO: Uncomment the following line as soon as you've implemented the constructor.
        new Presenter(model, view);
        primaryStage.show();
    }
}
