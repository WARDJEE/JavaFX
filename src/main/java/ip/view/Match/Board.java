package ip.view.Match;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Board extends GridPane {
    private final int width = 15;
    private final int height = 2;


    public Board() {
        styleNodes();
        makeBoard();

    }


    private void styleNodes(){
        this.setHgap(2);
        this.setVgap(2);

        setStyle("""
                 -fx-background-color: black;
                 padding: 1;
                 """);
    }

    private void makeBoard(){
        // Bord maken
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(50, 100);
                // Kleur vakje
                cell.setStyle("-fx-background-color: white;");

                add(cell, col, row);
            }
        }
    }


}
