package ip.view.Match;

import javafx.scene.layout.StackPane;

public class Match extends StackPane {
    private Board board;

    public Match(){
        initialNodes();
        layoutNodes();
    }

    private void initialNodes(){
        board = new Board();
    }

    private void layoutNodes(){
            getChildren().add(board);
    }
}
