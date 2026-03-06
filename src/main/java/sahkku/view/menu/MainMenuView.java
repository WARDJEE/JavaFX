package sahkku.view.menu;

import javafx.scene.layout.*;

public class MainMenuView extends BorderPane { // Consists of LeftMenu and RightMenu
    private LeftMenu left;
    private RightMenu right;

    public MainMenuView() {
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        left = new LeftMenu();
        right = new RightMenu();

    }

    private void styleNodes() {
        setStyle("-fx-background-color: #f6dbba");
    }

    private void layoutNodes() {
        setLeft(left);
        setRight(right);
    }

    public LeftMenu getLeftMenu() {
        return left;
    }

    public RightMenu getRightMenu() {
        return right;
    }
}
