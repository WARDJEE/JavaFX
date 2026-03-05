package ip.view.Match;

import ip.model.Piece;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

public class Square extends VBox {
    private ArrayList<Rectangle> pieces;
    public Square(){
        pieces = new ArrayList<>();
    }

    public void addPawn(Rectangle pawn, boolean isActivated){
        getChildren().add(pawn);
        setAlignment(Pos.TOP_CENTER);
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
