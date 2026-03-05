package ip.view.Match;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Square extends VBox {
    private int row;
    private int column;
    private ArrayList<Rectangle> pieces;

    public Square(int row, int column){
        this.row = row;
        this.column = column;
        pieces = new ArrayList<>();
    }

    public void addPawn(Rectangle pawn, boolean isActivated){
        getChildren().add(pawn);

        setAlignment((row == 0) ? Pos.TOP_CENTER : Pos.BOTTOM_CENTER);

        setPadding(new Insets(10));
        setMargin(pawn, new Insets(-5));

        if (!isActivated){
            setMargin(pawn, new Insets(-20));
        }

        if (isActivated){
            pieces.add(pawn);
        }

    }
}
