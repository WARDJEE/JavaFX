package ip.view.Menu;

import javafx.scene.image.Image;
import javafx.scene.layout.*;

public class MainMenuView extends BorderPane {
    private LeftMenuView left;
    private RightMenuView right;

    public MainMenuView() {
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        left = new LeftMenuView();
        right = new RightMenuView();


    }

    private void styleNodes() {
        // De kortste manier: CSS
        /*this.setStyle("-fx-background-image: url('/deer.jpg'); " +
                "-fx-background-size: cover; " +
                "-fx-background-position: center;");*/


        // Langer manier
        /*Image image = new Image("deer.jpg");

        BackgroundImage backgroundImage = new BackgroundImage(
                image,
                BackgroundRepeat.NO_REPEAT,
                BackgroundRepeat.NO_REPEAT,
                BackgroundPosition.DEFAULT,
                new BackgroundSize(1.0, 1.0, true, true, false, false)
        );

        setBackground(new Background(backgroundImage));*/
        setStyle("-fx-background-color: #f6dbba");
    }

    private void layoutNodes() {
        setLeft(left);
        setRight(right);
    }

    public LeftMenuView getLeftMenu() {
        return left;
    }

    public RightMenuView getRightMenu() {
        return right;
    }
}
