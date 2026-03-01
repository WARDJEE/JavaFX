package ip.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;

public class LeftMenuView extends VBox {
    Button exit;
       public LeftMenuView(){
           this.setSpacing(15);
           this.setPadding(new Insets(15));

           Label title = new Label("Sáhkku");

           Button play = new Button("Play");
           Button credits = new Button("Credits");
           this.exit = new Button("Exit");

           Region spacer = new Region();
           VBox.setVgrow(spacer, Priority.ALWAYS);

           this.getChildren().addAll(title, play, credits, spacer,exit);
       }

    public Button getExit(){
        return this.exit;
    }

}
