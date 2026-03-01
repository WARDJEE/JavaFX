package ip.style;

import javafx.scene.control.Button;

public class SahkkuButton extends Button {
    public SahkkuButton(String text) {
        super(text);
        styleButton();
    }

    private void styleButton() {
        this.setMaxWidth(Double.MAX_VALUE);
        this.setStyle("""
            -fx-background-color: #34495e;
            -fx-text-fill: white;
            -fx-font-size: 14px;
            -fx-background-radius: 5;
        """);

        // Je kunt zelfs hover-effecten toevoegen!
        this.setOnMouseEntered(e -> this.setStyle(this.getStyle() + "-fx-background-color: #2c3e50;"));
        this.setOnMouseExited(e -> this.setStyle(this.getStyle() + "-fx-background-color: #34495e;"));
    }
}
