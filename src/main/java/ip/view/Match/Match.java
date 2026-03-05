package ip.view.Match;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class Match extends StackPane {
    private Board board;
    private MatchStats matchStats;

    public Match() {
        initialNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialNodes() {
        board = new Board();
        matchStats = new MatchStats();
    }

    private void styleNodes(){
        setStyle("""
                -fx-background-color: #aa8e5f;
                """);

    }

    private void layoutNodes() {

        board.setMaxSize(700,200);
        getChildren().addAll(board, matchStats);

    }


}
