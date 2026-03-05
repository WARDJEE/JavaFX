package ip.view.Match;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;

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
                -fx-background-color: #74c99e;
                """);

    }

    private void layoutNodes() {

        board.setMaxSize(1000,400);
        getChildren().addAll(board, matchStats);
        setPadding(new Insets(10));


    }

    public Label getName1() {
        return matchStats.getName1();
    }

    public Label getName2() {
        return matchStats.getName2();
    }

    public Label getCapturedPawns1() {
        return matchStats.getCapturedPawns1();
    }

    public Label getCapturedPawns2() {
        return matchStats.getCapturedPawns2();
    }

    public Label getSteps1() {
        return matchStats.getSteps1();
    }

    public Label getSteps2() {
        return matchStats.getSteps2();
    }

    public Board getBoard() {
        return board;
    }
}
