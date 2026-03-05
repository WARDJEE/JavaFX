package ip.view.Match;

import ip.style.SahkkuButtonBlue;
import ip.style.SahkkuButtonOrange;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;


import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class MatchStats extends BorderPane {
    private VBox p1;
    private VBox p2;
    private HBox stats1;
    private HBox stats2;
    private Label name1;
    private Label name2;
    private Label steps1;
    private Label steps2;
    private Label captured1;
    private Label captured2;
    private Button pause;
    private Button undo;
    private HBox menu;


    public MatchStats() {
        initialNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialNodes() {
        name1 = new Label();
        captured1 = new Label();
        steps1 = new Label();
        stats1 = new HBox(captured1, steps1);
        p1 = new VBox(name1, stats1);

        name2 = new Label();
        captured2 = new Label();
        steps2 = new Label();
        stats2 = new HBox(captured2, steps2);
        p2 = new VBox(name2, stats2);

        pause = new SahkkuButtonOrange("||");
        undo = new SahkkuButtonBlue("<<");
        menu = new HBox(pause, undo);

    }

    private void styleNodes() {
        p1.setStyle("""
                -fx-background-color: #db604c;
                -fx-background-radius: 8;
                -fx-border-color: black;
                -fx-border-style: solid;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                """);

        p2.setStyle("""
                -fx-background-color: #50b4c3;
                -fx-background-radius: 8;
                -fx-border-color: black;
                -fx-border-style: solid;
                -fx-border-width: 2;
                -fx-border-radius: 8;
                """);

        p1.setMaxSize(USE_PREF_SIZE, USE_PREF_SIZE);
        p2.setMaxSize(USE_PREF_SIZE, USE_PREF_SIZE);

        captured1.setPadding(new Insets(5));
        captured2.setPadding(new Insets(5));

        steps1.setPadding(new Insets(5));
        steps2.setPadding(new Insets(5));

        name1.setPadding(new Insets(5));
        name2.setPadding(new Insets(5));

    }

    private void layoutNodes() {
        setBottom(p1);
        setRight(p2);
        setTop(menu);

    }

    public Label getName1() {
        return name1;
    }

    public Label getName2() {
        return name2;
    }

    public Label getCapturedPawns1() {
        return captured1;
    }

    public Label getCapturedPawns2() {
        return captured2;
    }

    public Label getSteps1() {
        return steps1;
    }

    public Label getSteps2() {
        return steps2;
    }
}

