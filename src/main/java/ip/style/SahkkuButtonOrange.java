package ip.style;

import javafx.scene.control.Button;

public class SahkkuButtonOrange extends Button {
    public SahkkuButtonOrange(String text) {
        super(text);
        styleButton();
    }

    private void styleButton() {
        this.setMaxWidth(Double.MAX_VALUE);

        this.setStyle("""
                -fx-background-color: #db604c;
                -fx-text-fill: #E0F7FA;
                -fx-border-color: #5e2052;
                -fx-background-insets: 1;
                -fx-border-radius: 8;
            -fx-background-radius: 7;
            """);

        // Hover effect
        this.setOnMouseEntered(e -> this.setStyle(this.getStyle() + "-fx-background-color:#b13353;"));
        this.setOnMouseExited(e -> this.setStyle(this.getStyle() + "-fx-background-color:  #db604c;"));

    }
}
