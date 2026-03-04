package ip.view.Menu;

import ip.style.SahkkuButton;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class LeftMenuView extends VBox {
    private Label title;
    private Button play;
    private Button credits;
    private Button exit;

    public LeftMenuView() {
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        title = new Label("Sáhkku");
        play = new SahkkuButton("Play");
        credits = new SahkkuButton("Credits");
        exit = new SahkkuButton("Exit");
    }

    private void styleNodes(){
        this.setSpacing(15);
        this.setPadding(new Insets(15));

        title.setFont(new Font("Arial", 30));

    }

    private void layoutNodes() {
        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        this.getChildren().addAll(title, play, credits, spacer, exit);
    }

    public Button getExit() {
        return this.exit;
    }

    public Button getPlay() {
        return play;
    }
}
