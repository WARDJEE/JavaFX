package Testje;

import javafx.stage.Stage;

public class Presenter {
    LeftMenuView leftMenuView;
    Stage stage;
    public Presenter(LeftMenuView leftMenuView, Stage stage){
        this.leftMenuView = leftMenuView;
        this.stage = stage;
        events();
    }



    public void events(){
        leftMenuView.getExit().setOnAction(e -> stage.close());
    }
}
