package demos.eventsDemo.view;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

public class MouseDemo extends BorderPane {
    private Label label;

    public MouseDemo() {
        this.label = new Label();
        setBottom(label);
        this.setOnMouseMoved(event -> handleMouse(event));
    }

    private void handleMouse(MouseEvent event) {
        String text = String.format("X: %3.0f,Y: %3.0f%n", event.getX(), event.getY());
        label.setText(text);
    }
}
