package Test;

import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Presenter {
    private StartView startView;
    private Stage stage;

    public Presenter(StartView startView, Stage stage){
        this.startView = startView;
        this.stage = stage;

        events();
    }

    private void events(){
        startView.getExit().setOnAction(e -> stage.close());

        startView.getToggleButton().setOnAction(event -> {
            if (startView.getToggleButton().isSelected()) {
                {
                    startView.getToggleButton().setText("Dark");
                    startView.setStyle("-fx-background-color: #000000;");
                    startView.getBar().setStyle("-fx-background-color: #000000;");
                }
            } else {
                {
                    startView.getToggleButton().setText("Light");
                    startView.setStyle("-fx-background-color: #ffffff;");
                    startView.getBar().setStyle("-fx-background-color: #ffffff;");

                }
            }
        });

        for (Button button : startView.getButtons()) {
            button.setOnMouseEntered(e ->
            {
                button.setScaleX(1.2);
                button.setScaleY(1.2);
            });

            button.setOnMouseExited(e ->
            {
                button.setScaleX(1);
                button.setScaleY(1);
            });
        }

    }
}
