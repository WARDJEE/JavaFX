package demos.panesDemo.view.gridPane;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.RowConstraints;

public class GridPaneDemoView extends GridPane {
    private Label label;
    private Button button;
    private ImageView imageView;

    public GridPaneDemoView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.label = new Label("One");
        this.button = new Button("Klik");
        this.imageView = new ImageView("/angry.png");
    }

    private void layoutNodes() {
        // versie 1
//        this.add(label, 0, 0);
//        this.add(imageView, 1, 0);
//        this.add(button, 0, 1);
//        this.setGridLinesVisible(true);

        // versie 2
//        this.label.setPadding(new Insets(10));
//        this.button.setPrefSize(80, 20);
//        this.add(label,     0, 0);
//        this.add(imageView, 1, 0);
//        this.add(button,    0, 1, 2, 1);
//        this.setAlignment(Pos.CENTER);
//        this.setHgap(10);
//        this.setVgap(10);
//        GridPane.setHalignment(button, HPos.CENTER);
//        this.setGridLinesVisible(true);

        // versie 3
//        this.label.setPadding(new Insets(10));
//        this.button.setPrefSize(120, 20);
//        this.add(label,     0, 0);
//        this.add(imageView, 1, 0);
//        this.add(button,    0, 1, 2, 1);
//        ColumnConstraints column1 = new ColumnConstraints(100);
//        ColumnConstraints column2 = new ColumnConstraints(200);
//        this.getColumnConstraints().addAll(column1, column2);
//        RowConstraints rowConstraints = new RowConstraints(100);
//        this.getRowConstraints().addAll(rowConstraints);
//        this.setGridLinesVisible(true);

        // versie 4
//        this.label.setPadding(new Insets(10));
//        this.button.setPrefSize(120, 20);
//        this.add(label,     0, 0);
//        this.add(imageView, 1, 0);
//        this.add(button,    0, 1, 2, 1);
//        ColumnConstraints column1 = new ColumnConstraints();
//        column1.setPercentWidth(33.0);
//        ColumnConstraints column2 = new ColumnConstraints();
//        column2.setPercentWidth(67.0);
//        this.getColumnConstraints().addAll(column1, column2);
//        RowConstraints row1 = new RowConstraints();
//        row1.setVgrow(Priority.ALWAYS);
//        RowConstraints row2 = new RowConstraints(20.0);
//        this.getRowConstraints().addAll(row1, row2);
//        setGridLinesVisible(true);

        // versie 5
//        this.label.setPadding(new Insets(10));
//        this.button.setPrefSize(120, 20);
//        this.add(label,     0, 0);
//        this.add(imageView, 1, 0);
//        this.add(button,    0, 1);
//        GridPane.setConstraints(label,     0, 0, 1, 1,
//                HPos.LEFT,       VPos.CENTER,
//                Priority.ALWAYS, Priority.ALWAYS);
//        GridPane.setConstraints(imageView, 1, 0, 1, 1,
//                HPos.RIGHT,       VPos.CENTER,
//                Priority.ALWAYS, Priority.ALWAYS);
//        GridPane.setConstraints(button,    0, 1, 2, 1,
//                HPos.CENTER,       VPos.CENTER,
//                Priority.ALWAYS, Priority.NEVER);
//        setGridLinesVisible(true);
    }
}
