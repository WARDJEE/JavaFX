package Testje;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class LeftMenuView extends VBox {
    Button exit;
       public LeftMenuView(){
           this.setSpacing(15);
           this.setPadding(new Insets(15));
           this.setAlignment(Pos.TOP_LEFT);

           Label title = new Label("Sáhkku");

           Button play = new Button("Play");
           Button credits = new Button("Credits");
           this.exit = new Button("Exit");


           this.getChildren().addAll(title, play, credits, exit);
       }

    public Button getExit(){
        return this.exit;
    }

}
