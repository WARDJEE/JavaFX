package demos.consolenaarmvp.mvp.view;

import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;

public class View extends GridPane {
    private Label diceLabel;
    private Label scoreLabel;
    private Button rollButton;

    public View() {
        initialiseNodes();
        layoutNodes();
    }

    public Label getDiceLabel() {
        return diceLabel;
    }

    public Label getScoreLabel() {
        return scoreLabel;
    }

    public Button getRollButton() {
        return rollButton;
    }

    private void initialiseNodes() {
        this.diceLabel = new Label("-");
        this.diceLabel.setFont(new Font(60));
        this.diceLabel.setAlignment(Pos.CENTER);
        this.diceLabel.setBorder(
                new Border(
                        new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, new BorderWidths(3))));
        this.scoreLabel = new Label("-");
        this.scoreLabel.setFont(new Font(60));
        this.scoreLabel.setAlignment(Pos.CENTER);
        this.scoreLabel.setBorder(new Border(new BorderStroke(Color.BLACK,
                BorderStrokeStyle.SOLID,
                CornerRadii.EMPTY, new BorderWidths(3))));
        this.rollButton = new Button("Rol");
    }

    private void layoutNodes() {
        this.add(new Label("Dobbelsteen"), 0, 0);
        this.add(diceLabel, 0, 1);
        this.add(new Label("Score"), 1, 0);
        this.add(scoreLabel, 1, 1);
        this.add(rollButton, 0, 2, 2, 1);
        this.setHgap(10);
        this.setVgap(10);
        GridPane.setHalignment(diceLabel, HPos.CENTER);
        GridPane.setHalignment(scoreLabel, HPos.CENTER);
        GridPane.setHalignment(rollButton, HPos.CENTER);
        GridPane.setHgrow(diceLabel, Priority.ALWAYS);
        GridPane.setHgrow(scoreLabel, Priority.ALWAYS);
        diceLabel.setMaxWidth(1000);
        scoreLabel.setMaxWidth(1000);
        ColumnConstraints column1 = new ColumnConstraints(100);
        ColumnConstraints column2 = new ColumnConstraints(100);
        this.getColumnConstraints().addAll(column1, column2);
    }
}
