package week01.Reverse;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;

public class ReversView extends GridPane {
    private TextArea area;
    private Button button;

    public ReversView() {
        initialiseNodes();
        layoutNodes();
    }

    TextArea getArea() {
        return area;
    }

    Button getButton() {
        return button;
    }

    public void initialiseNodes(){
        this.area = new TextArea();
        this.button = new Button("Reverse");
    }

    public void layoutNodes(){
        this.add(area, 0, 0);
        this.add(button, 0, 1);
        this.setVgap(10);
        this.setHgap(10);
        this.setPadding(new Insets(10));

    }
}
