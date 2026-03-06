package sahkku.model;

import javafx.scene.paint.Color;

public class Pawn extends Piece{
    private boolean isActivated;
    //private Direction direction;

    public Pawn(){
        isActivated = false;
        setHeight(15);
        setWidth(30);
        setStroke(Color.WHITE);
        setStrokeWidth(2);

    }

    public boolean isActivated() {
        return isActivated;
    }
}
