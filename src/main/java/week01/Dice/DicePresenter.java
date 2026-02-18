package week01.Dice;

import javafx.scene.image.Image;

import java.util.Objects;

public class DicePresenter {
    private DiceView view;
    private Dice model;

    public DicePresenter(Dice model, DiceView view){
        this.view = view;
        this.model = model;
        addEventHandlers();
        updateView();
    }

    public void addEventHandlers(){
        view.getButton().setOnAction(e -> {model.toss();updateView();});

    }

    public void updateView(){
        view.getImageView1().setImage(new Image("/die" + model.getNumberOfPips1() + ".png"));
       view.getImageView2().setImage(new Image("/die" + model.getNumberOfPips2() + ".png"));

    }
}
