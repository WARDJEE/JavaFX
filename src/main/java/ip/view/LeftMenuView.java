package ip.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

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
        play = new Button("Play");
        credits = new Button("Credits");
        exit = new Button("Exit");
    }

    private void styleNodes(){
        this.setSpacing(15);
        this.setPadding(new Insets(15));
    }

    private void layoutNodes() {
        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        this.getChildren().addAll(title, play, credits, spacer, exit);
    }

    public Button getExit() {
        return this.exit;
    }
}
