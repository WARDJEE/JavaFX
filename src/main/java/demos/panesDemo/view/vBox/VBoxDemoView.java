package demos.panesDemo.view.vBox;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

public class VBoxDemoView extends VBox {
    private Label label;
    private Button button;
    private ImageView imageView;

    public VBoxDemoView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.label = new Label("One");
        this.button = new Button("Klik");
        this.imageView = new ImageView("/angry.png");
    }

    private void layoutNodes() {
        //this.button.setMaxWidth(Double.MAX_VALUE);
        //this.button.setMaxHeight(100);
        //VBox.setVgrow(button, Priority.ALWAYS);
        this.setSpacing(20);
        this.setPadding(new Insets(20));
        this.getChildren().addAll(label, button, imageView);
        this.setAlignment(Pos.CENTER);
    }
}
