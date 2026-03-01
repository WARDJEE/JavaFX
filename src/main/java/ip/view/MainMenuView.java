package ip.view;

import javafx.scene.layout.BorderPane;

public class MainMenuView extends BorderPane {
    private LeftMenuView left;
    private RightMenuView right;

    public MainMenuView(){
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes(){
        left = new LeftMenuView();
        right = new RightMenuView();
    }

    private  void layoutNodes(){
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
