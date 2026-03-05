package ip.view.Match;

import ip.model.Pawn;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Board extends GridPane {
    private final int width = 14;
    private final int height = 2;
    private Square[][] squares;

    public Board() {
        initialiseNodes();
        styleNodes();
        makeBoard();

        for (int i = 0; i < width; i++) {
            Pawn pawn = new Pawn();
            placePawn(pawn, i, 0, pawn.isActivated());
        }

    }

    private void initialiseNodes(){
        squares = new Square[height][width];
    }

    private void styleNodes(){

        this.setHgap(2);
        this.setVgap(2);

        setStyle("""
                 -fx-background-color: white;
                 padding: 1;
                 -fx-border-color: white;
                 -fx-border-width: 2;
                 """);
    }

    private void makeBoard(){
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(50, 100);
                cell.setStyle("""
                        -fx-background-color: #f6dbba;
                        """);

                Square square = new Square();
                squares[row][col] = square;

                cell.getChildren().add(square);

                add(cell, col, row);
            }
        }
    }

    public void placePawn(Pawn pawn, int x, int y, boolean isActivated){
        squares[y][x].addPawn(pawn, isActivated);
    }


}
