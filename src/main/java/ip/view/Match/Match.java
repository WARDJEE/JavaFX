package ip.view.Match;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Match extends StackPane {
    private Board board;
    private VBox p1;
    private VBox p2;
    private HBox stats1;
    private HBox stats2;

    public Match() {
        initialNodes();
        layoutNodes();
    }

    private void initialNodes() {
        setStyle("""
                -fx-background-color: #aa8e5f;
                """);
        board = new Board();

        Label name1 = new Label("iets");
        Label captured1 = new Label("iets");
        stats1 = new HBox();
        p1 = new VBox(name1, stats1);


        Label name2 = new Label("ietsss");
        stats2 = new HBox();
        p2 = new VBox(name2, stats2);

    }

    private void layoutNodes() {
        getChildren().addAll(board);

        board.setMaxSize(700,200);
        setAlignment(board, Pos.CENTER);

        setAlignment(p1, Pos.BOTTOM_LEFT);
        getChildren().add(p1);

        StackPane.setAlignment(p2, Pos.TOP_RIGHT);
        getChildren().add(p2);

    }


}
