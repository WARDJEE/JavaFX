package week05.view;

import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import java.util.List;

public class ResultScreenView extends BorderPane {
    private GridPane grid;

    public ResultScreenView() {
        grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setHgap(15);
        grid.setVgap(10);

        this.setCenter(grid);
    }

    public void createTable(List<Object[]> stats) {

        String[] columns = {"Sides", "Throws", "Min Hits", "Max Hits"};
        for (int i = 0; i < columns.length; i++) {
            Label headerLabel = new Label(columns[i]);
            headerLabel.setStyle("-fx-font-weight: bold; -fx-border-color: black; -fx-border-width: 0 0 1 0;");
            grid.add(headerLabel, i, 0);
        }

        int row = 1;
        for (Object[] rowData : stats) {
            for (int col = 0; col < rowData.length; col++) {
                grid.add(new Label(String.valueOf(rowData[col])), col, row);
            }
            row++;
        }
    }
}