package ip.view.Match;

import javafx.scene.layout.BorderPane;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class MatchStats extends BorderPane {
    private VBox p1;
    private VBox p2;
    private HBox stats1;
    private HBox stats2;
    private Label name1;
    private Label name2;
    private Label stepped1;
    private Label stepped2;
    private int capturedPawns1 = 5;
    private int capturedPawns2 = 6;
    private int steps1 = 68;
    private int steps2 = 73;
    private Label captured1;
    private Label captured2;


    public MatchStats() {
        initialNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialNodes() {
        name1 = new Label("Player 1");
        captured1 = new Label("Captured: " + capturedPawns1);
        stepped1 = new Label("Steps: " + steps1);
        stats1 = new HBox(captured1, stepped1);
        p1 = new VBox(name1, stats1);

        name2 = new Label("Player 2");
        captured2 = new Label("Captured: " + capturedPawns2);
        stepped2 = new Label("Steps: " + steps2);
        stats2 = new HBox(captured2, stepped2);
        p2 = new VBox(name2, stats2);

    }

    private void styleNodes() {
        p1.setStyle("""
                -fx-border-color: black;
                -fx-border-style: solid;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                """);

        p2.setStyle("""
                -fx-border-color: black;
                -fx-border-style: solid;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                """);

        p1.setMaxSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);
        p2.setMaxSize(VBox.USE_PREF_SIZE, VBox.USE_PREF_SIZE);

        captured1.setPadding(new Insets(5));
        captured2.setPadding(new Insets(5));

        stepped1.setPadding(new Insets(5));
        stepped2.setPadding(new Insets(5));

        name1.setPadding(new Insets(5));
        name2.setPadding(new Insets(5));

    }

    private void layoutNodes() {
        setBottom(p1);
        setRight(p2);

    }


}

