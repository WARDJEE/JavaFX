package ip.view.Match;

import ip.model.Pawn;
import javafx.scene.paint.Color;

public class BoardPresenter {
    private Board view;

    public BoardPresenter(Board view){
        this.view = view;

        initialiseBoard();

    }

    private void initialiseBoard() {
        // De buitenste lus loopt door de rijen (y = 0 en y = 1)
        for (int row = 0; row < view.getRows(); row++) {
            // De binnenste lus loopt door alle 14 kolommen
            for (int col = 0; col < view.getColumns(); col++) {
                Pawn pawn = new Pawn();
                if ((row == 0)) {
                    pawn.setFill(Color.web("#50b4c3"));
                } else {
                    pawn.setFill(Color.web("#db604c"));
                }

                placePawn(pawn, col, row, pawn.isActivated());

            }
        }
    }


    public void placePawn(Pawn pawn, int x, int y, boolean isActivated){
        view.getSquares()[y][x].addPawn(pawn, isActivated);
    }

}
