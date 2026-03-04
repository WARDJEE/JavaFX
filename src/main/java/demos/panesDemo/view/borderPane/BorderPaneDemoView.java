package demos.panesDemo.view.borderPane;

import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.CornerRadii;
import javafx.scene.paint.Color;

public class BorderPaneDemoView extends BorderPane {
    private TextArea dictee;
    private MenuItem afsluiten;
    private Label status;

    public BorderPaneDemoView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.dictee = new TextArea();
        this.afsluiten = new MenuItem("Exit");
        this.status = new Label("Waiting for text.");
        this.status.setBackground(new Background(new BackgroundFill(Color.ORANGE, null, null)));
        //this.status.setStyle("-fx-background-color: orange");
    }

    private void layoutNodes() {
        Menu bestandMenu = new Menu("Bestand", null, afsluiten);
        MenuBar menuBar = new MenuBar(bestandMenu);
        this.setCenter(dictee);
        this.setTop(menuBar);
        this.setBottom(status);
        status.setMaxWidth(Double.MAX_VALUE);
    }
}
