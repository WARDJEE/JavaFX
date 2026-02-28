package week02.cityhall.view;

import javafx.geometry.Insets;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

public class CityHallPane extends VBox {
    private static final Image IMAGE = new Image("/cityhall.jpg");

    private ImageView imageView;
    private RadioButton normal;
    private RadioButton blackAndWhite;
    private RadioButton sepia;

    public CityHallPane(){
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes(){

        imageView = new ImageView(IMAGE);
        normal = new RadioButton("Normal");
        blackAndWhite = new RadioButton("Black & White");
        sepia = new RadioButton("Sepia");
        ToggleGroup toggleGroup = new ToggleGroup();
        normal.setToggleGroup(toggleGroup);
        blackAndWhite.setToggleGroup(toggleGroup);
        sepia.setToggleGroup(toggleGroup);
        normal.setSelected(true);
        //toggleGroup.selectToggle(normal); Slechte optie


        setSpacing(15);

    }

    private void layoutNodes(){
        getChildren().setAll(imageView, normal, blackAndWhite, sepia);
    }

    void resetEffect() {
        this.imageView.setEffect(null);
    }

    void applyBlackAndWhiteEffect() {
        ColorAdjust blackAndWhite = new ColorAdjust();
        blackAndWhite.setSaturation(-1.0);
        this.imageView.setEffect(blackAndWhite);
    }

    void applySepiaEffect() {
        SepiaTone sepiaTone = new SepiaTone();
        sepiaTone.setLevel(0.8);
        this.imageView.setEffect(sepiaTone);
    }

    public RadioButton getNormal() {
        return normal;
    }

    public RadioButton getBlackAndWhite() {
        return blackAndWhite;
    }

    public RadioButton getSepia() {
        return sepia;
    }
}
