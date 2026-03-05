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
                -fx-background-color: rgba(20, 30, 40, 0.6);
                -fx-text-fill: #E0F7FA;
                -fx-border-color: rgba(0, 255, 255, 0.3);
                -fx-background-insets: 1;
                -fx-border-radius: 8;
            -fx-background-radius: 8;
            """);

        // Hover effect
        this.setOnMouseEntered(e -> this.setStyle(this.getStyle() + "-fx-background-color: rgba(20, 30, 40);"));
        this.setOnMouseExited(e -> this.setStyle(this.getStyle() + "-fx-background-color:  rgba(20, 30, 40, 0.6);"));

    }
}
