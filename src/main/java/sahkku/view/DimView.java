package sahkku.view;

import javafx.scene.layout.Pane;

public class DimView extends Pane {
    public DimView(){
       styleNodes();
    }

    private void styleNodes(){
        this.setStyle("-fx-background-color: rgba(0,0,0,0.5);");
        this.setPrefSize(Double.MAX_VALUE, Double.MAX_VALUE);
    }
}
