package sahkku.view.match;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import sahkku.style.SahkkuButtonBlue;
import sahkku.style.SahkkuButtonOrange;

public class TimerAndDice extends BorderPane {
    private Button pause;
    private Button undo;
    private HBox menu;
    private Label timerLabel;

    public TimerAndDice() {
        initialeseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialeseNodes(){
        pause = new SahkkuButtonOrange("| |");
        undo = new SahkkuButtonBlue("<<");
        timerLabel = new Label("00:00");
        menu = new HBox(pause, timerLabel, undo);
    }

    private void styleNodes(){
        timerLabel.setStyle("""
                -fx-border-color: black;
                -fx-border-style: solid;
                -fx-border-width: 1;
                -fx-border-radius: 8;
                """);
        menu.setPrefSize(200, 50);
        pause.setPrefSize(50, 50);
        undo.setPrefSize(50, 50);
        timerLabel.setPrefSize(100, 50);
    }

    private void layoutNodes(){
        timerLabel.setPadding(new Insets(5));
        timerLabel.setAlignment(Pos.CENTER);
        menu.setAlignment(Pos.CENTER);
        menu.setSpacing(10);
        setTop(menu);
    }

    public Label getTimerLabel() {
        return timerLabel;
    }

    public Button getPauseButton() {
        return pause;
    }

    public Button getUndo() {
        return undo;
    }
}
