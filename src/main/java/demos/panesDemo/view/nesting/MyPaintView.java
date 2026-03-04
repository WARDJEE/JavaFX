package demos.panesDemo.view.nesting;

import javafx.geometry.Insets;
import javafx.scene.canvas.Canvas;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;

public class MyPaintView extends BorderPane {
    private Canvas canvas;
    private Button undoButton;
    private Button clearButton;
    private MenuItem undoMenuItem;
    private MenuItem clearMenuItem;
    private MenuItem saveMenuItem;
    private MenuItem loadMenuItem;
    private MenuItem quitMenuItem;
    private Slider penSizeSlider;
    private ColorPicker colorPicker;
    private Label statusLabel;

    public MyPaintView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        canvas = new Canvas(320, 240);
        undoButton = new Button("Undo");
        clearButton = new Button("Clear");
        penSizeSlider = new Slider(5, 25, 5);
        penSizeSlider.setSnapToTicks(true);
        penSizeSlider.setMinorTickCount(0);
        penSizeSlider.setMajorTickUnit(5);
        penSizeSlider.setShowTickLabels(true);
        colorPicker = new ColorPicker(Color.BLACK);
        undoMenuItem = new MenuItem("Undo");
        clearMenuItem = new MenuItem("Clear");
        saveMenuItem = new MenuItem("Save...");
        loadMenuItem = new MenuItem("Load...");
        quitMenuItem = new MenuItem("Quit");
        statusLabel = new Label("X:000, Y:000");
    }

    private void layoutNodes() {
        Menu fileMenu = new Menu("File", null, clearMenuItem, loadMenuItem, saveMenuItem, quitMenuItem);
        Menu editMenu = new Menu("Edit", null, undoMenuItem);
        MenuBar menuBar = new MenuBar(fileMenu, editMenu);
        this.setTop(menuBar);

        GridPane gridPane = new GridPane();
        gridPane.add(canvas, 0, 0);
        GridPane.setHgrow(canvas, Priority.ALWAYS);
        GridPane.setVgrow(canvas, Priority.ALWAYS);
        gridPane.setGridLinesVisible(true);
        this.setCenter(gridPane);

        HBox pensizeBox = new HBox();
        pensizeBox.getChildren().addAll(new Label("pen size:"), penSizeSlider);

        HBox colorBox = new HBox();
        colorBox.getChildren().addAll(new Label("color:"), colorPicker);

        VBox toolBox = new VBox();
        toolBox.getChildren().addAll(undoButton, clearButton, pensizeBox, colorBox);
        this.setLeft(toolBox);

        this.setBottom(statusLabel);

        BorderPane.setMargin(canvas, new Insets(10));
        VBox.setMargin(undoButton, new Insets(10));
        VBox.setMargin(clearButton, new Insets(10));
        VBox.setMargin(pensizeBox, new Insets(10));
        VBox.setMargin(colorBox, new Insets(10));
        BorderPane.setMargin(gridPane, new Insets(10));
    }
}
