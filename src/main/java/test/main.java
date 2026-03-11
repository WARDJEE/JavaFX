package test;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class main extends Application {

    // Velden declareren zodat ze overal in de klasse bereikbaar zijn
    private Polygon boven;
    private Rectangle midden;
    private Polygon onder;
    private Label label;
    private VBox vormContainer;
    private StackPane root;

    // Constanten voor instellingen
    private final double WIDTH = 60;
    private final double HOOGTE_RECHTHOEK = 100;
    private final double DRIEHOEK_HOOGTE = 20.0;
    private final double LIJN_DIKTE = 2.0;
    private final Color VUL_KLEUR = Color.web("#654321");
    private final Color LIJN_KLEUR = Color.BLACK;

    @Override
    public void start(Stage primaryStage) {
        initialiseNodes();
        styleNodes();
        layoutNodes();

        Scene scene = new Scene(root, 200, 300);
        primaryStage.setTitle("Verticale Dobbelsteen");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void initialiseNodes() {
        // 1. Top triangle
        boven = new Polygon();
        boven.getPoints().addAll(new Double[]{
                0.0, DRIEHOEK_HOOGTE,
                (WIDTH - 2) / 2, 0.0,
                WIDTH - 2, DRIEHOEK_HOOGTE
        });

        // 2. Rectangle
        midden = new Rectangle(WIDTH, HOOGTE_RECHTHOEK);

        // 3. Bottom triangle
        onder = new Polygon();
        onder.getPoints().addAll(new Double[]{
                0.0, 0.0,
                WIDTH / 2, DRIEHOEK_HOOGTE,
                WIDTH, 0.0
        });

        // 4. Label
        label = new Label("X");
    }

    private void styleNodes() {
        // Styling toepassen op de vormen via een hulpmethode
        applyShapeStyle(boven);
        applyShapeStyle(midden);
        applyShapeStyle(onder);

        // Styling voor het label
        label.setFont(new Font("Arial", 30));
    }

    private void layoutNodes() {
        // Groeperen van de vormen
        vormContainer = new VBox(boven, midden, onder);
        vormContainer.setAlignment(Pos.CENTER);
        vormContainer.setSpacing(-LIJN_DIKTE);

        // Alles in de root container plaatsen
        root = new StackPane(vormContainer, label);
    }

    // Hulpmethode om herhaling in styleNodes te voorkomen
    private void applyShapeStyle(Shape vorm) {
        vorm.setFill(VUL_KLEUR);
        vorm.setStroke(LIJN_KLEUR);
        vorm.setStrokeWidth(LIJN_DIKTE);
    }

    public static void main(String[] args) {
        launch(args);
    }
}