package ip.view.Match;

import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;

public class Board extends GridPane {
    private final int width = 15;
    private final int height = 2;


    public Board() {
        this.setHgap(2);
        this.setVgap(2);

        setStyle("-fx-background-color: black; -fx-padding: 1;");

        // 3. Voeg je cellen toe (bijv. 15 rijen x 3 kolommen)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 15; col++) {
                StackPane cell = new StackPane();
                cell.setPrefSize(50, 50);
                // Geef de cel een eigen achtergrondkleur, anders zie je de grid-kleur erdoorheen
                cell.setStyle("-fx-background-color: white;");

                add(cell, col, row);
            }
        }
    }


}
