package week01.Background;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class BackgroundView extends BorderPane {
    private Button button;

    public BackgroundView(){
        initialiseNodes();
        layoutNodes();
    }

    public void initialiseNodes(){
        this.button = new Button("Repaint");
    }

    public void layoutNodes(){
        this.setBottom(button);
        BorderPane.setAlignment(button, Pos.BOTTOM_RIGHT);

        this.setPadding(new Insets(10));

        BorderPane.setMargin(button, new Insets(10));
    }

    Button getButton() {
        return button;
    }
}
