package week02.birds;

import javafx.scene.control.CheckBox;

public class BirdsPresenter {
    private BirdsView birdsView;

    public BirdsPresenter(BirdsView birdsView){
        this.birdsView = birdsView;
        addEventHandlers();
    }

    private void addEventHandlers(){
        CheckBox checkBox = birdsView.getCheckBox();
        checkBox.setOnMouseEntered(e ->
        {
            checkBox.setScaleX(1.2);
            checkBox.setScaleY(1.2);
        });


        checkBox.setOnMouseExited(e ->
        {
            checkBox.setScaleX(1);
            checkBox.setScaleY(1);
        });
        checkBox.setOnMouseClicked(e ->
        {checkBox.setScaleX(10);
            checkBox.setScaleY(10);});
    }
}
