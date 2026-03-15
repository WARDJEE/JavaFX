package week05.view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class AboutScreenView extends BorderPane {
    private Image dice;
    private Button ok;
    private ImageView imageView;

    public AboutScreenView(){
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes(){
        dice = new Image("dice100.png");
        imageView = new ImageView(dice);
        ok = new Button("ok");
    }

    private void layoutNodes(){
        setTop(imageView);
        setBottom(ok);
        setAlignment(ok, Pos.BOTTOM_RIGHT);
    }

    public Button getOk() {
        return ok;
    }
}
