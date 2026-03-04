package demos.panesDemo;

import demos.panesDemo.view.borderPane.BorderPaneDemoView;
import demos.panesDemo.view.gridPane.GridPaneDemoView;
import demos.panesDemo.view.hBox.HBoxDemoView;
import demos.panesDemo.view.nesting.MyPaintView;
import demos.panesDemo.view.vBox.VBoxDemoView;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        BorderPaneDemoView view = new BorderPaneDemoView();
        //VBoxDemoView view = new VBoxDemoView();
        //HBoxDemoView view = new HBoxDemoView();
        //GridPaneDemoView view = new GridPaneDemoView();
        //MyPaintView view = new MyPaintView();
        primaryStage.setScene(new Scene(view));
        primaryStage.setTitle("JavaFX panes demo");
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
