package week01.Dice;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;

public class DiceView extends GridPane {
    private ImageView imageView1;
    private ImageView imageView2;
    private Button button;

    public DiceView() {
        initialNodes();
        layoutNodes();

    }

    ImageView getImageView1() {
        return imageView1;
    }

    ImageView getImageView2() {
        return imageView2;
    }

    Button getButton() {
        return button;
    }

    public void initialNodes(){
        this.imageView1 = new ImageView();
        this.imageView2 = new ImageView();
        this.button = new Button("Roll");
        button.setPrefWidth(80);
    }

    public void layoutNodes(){
        this.add(imageView1, 0, 0);
        this.add(imageView2, 1, 0);
        this.add(button, 0, 1, 2, 1);
        this.setHgap(10);
        this.setVgap(10);
        this.setPadding(new Insets(10));
        this.setAlignment(Pos.CENTER);
        GridPane.setHalignment(button, javafx.geometry.HPos.CENTER);


    }
}
