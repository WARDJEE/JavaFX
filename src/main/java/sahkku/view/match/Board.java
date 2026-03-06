package sahkku.view.match;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Board extends GridPane { // Consists of Squares
    private final int columns = 15;
    private final int rows = 2;
    private Square[][] squares;

    public Board() {
        initialiseNodes();
        styleNodes();
        makeBoard();
    }

    private void initialiseNodes(){
        squares = new Square[rows][columns];

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
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(100, 200);


                cell.setStyle("""
                        -fx-background-color: #f6dbba;
                        """);

                Square square = new Square(row, col);
                squares[row][col] = square;

                cell.getChildren().add(square);

                add(cell, col, row);
            }
        }
    }

    public int getColumns() {
        return columns;
    }

    public int getRows() {
        return rows;
    }

    public Square[][] getSquares() {
        return squares;
    }



}
