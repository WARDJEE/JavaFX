package demos.eventsDemo.view;

import javafx.geometry.Insets;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.BorderPane;

public class ActionDemoView extends BorderPane {
    private ToggleButton toggleButton;

    public ActionDemoView() {
        this.toggleButton = new ToggleButton("On");
        this.toggleButton.setSelected(true);
        this.setCenter(toggleButton);
        BorderPane.setMargin(toggleButton, new Insets(30));

        this.toggleButton.setOnAction(event -> handleToggle());
    }

    private void handleToggle() {
        if (toggleButton.isSelected()) {
            toggleButton.setSelected(true);
            toggleButton.setText("On");
        } else {
            toggleButton.setSelected(false);
            toggleButton.setText("Off");
        }
    }
}
