package demos.eventsDemo;

import demos.eventsDemo.view.ActionDemoView;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

import java.util.Optional;

public class Main extends Application {
    @Override
    public void start(Stage stage) {
        ActionDemoView view = new ActionDemoView();
//        KeyTypedDemo view = new KeyTypedDemo();
//        MouseDemo view = new MouseDemo();

//        stage.setOnCloseRequest(event -> handleClose(event));

        stage.setScene(new Scene(view));
        stage.setTitle("JavaFX panes demo");
        stage.setWidth(100);
        stage.setHeight(100);
        stage.show();
    }

//    private static void handleClose(WindowEvent event) {
//        final Alert benJeZeker = new Alert(Alert.AlertType.CONFIRMATION);
//        benJeZeker.setHeaderText("Je bent toch zeker?");
//        benJeZeker.setContentText("Ben je zeker dat je wil afsluiten?");
//        Optional<ButtonType> keuze = benJeZeker.showAndWait();
//        if (keuze.get().getText().equalsIgnoreCase("CANCEL")) {
//            event.consume();
//        }
//    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
