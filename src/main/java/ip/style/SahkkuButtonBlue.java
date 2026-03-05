package ip.style;

import javafx.scene.control.Button;

public class SahkkuButtonBlue extends Button {
    public SahkkuButtonBlue(String text) {
        super(text);
        styleButton();
    }

    private void styleButton() {
        this.setMaxWidth(Double.MAX_VALUE);

        this.setStyle("""
                -fx-background-color: #317c87;
                -fx-text-fill: #E0F7FA;
                -fx-border-color: #1a1016;
                -fx-background-insets: 1;
                -fx-border-radius: 8;
            -fx-background-radius: 7;
            """);

        // Hover effect
        this.setOnMouseEntered(e -> this.setStyle(this.getStyle() + "-fx-background-color: #271854;"));
        this.setOnMouseExited(e -> this.setStyle(this.getStyle() + "-fx-background-color:  #317c87;"));

    }
}
