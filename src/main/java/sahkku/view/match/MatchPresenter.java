package sahkku.view.match;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.paint.Color;
import javafx.util.Duration;
import sahkku.controllers.MatchController;
import sahkku.model.Pawn;

public class MatchPresenter {
    private MatchController matchController;
    private MatchView matchView;
    private TimerAndDice timerAndDice;
    private Timeline time;

    public MatchPresenter(MatchController matchController, MatchView matchView){
        this.matchController = matchController;
        this.matchView = matchView;
        timerAndDice = new TimerAndDice();
        initialisePawns();
        initialiseTimer();
        updateMatchStats();
        addEventHandlers();
    }

    private void initialiseTimer() {
        time = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            matchController.add1();
            matchView.getTimer().getTimerLabel().setText(matchController.getTime());
        }));
        time.setCycleCount(Animation.INDEFINITE);
        time.play();
        matchController.running(true);
    }

    private void initialisePawns() {
        for (int row = 0; row < matchView.getBoard().getRows(); row++) {
            for (int col = 0; col < matchView.getBoard().getColumns(); col++) {
                Pawn pawn = new Pawn();
                if (row == 0) {
                    pawn.setFill(Color.web("#50b4c3"));
                } else {
                    pawn.setFill(Color.web("#db604c"));
                }
                matchView.getBoard().getSquares()[row][col].addPawn(pawn, pawn.isActivated());
            }
        }
    }

    public void placePawn(Pawn pawn, int x, int y, boolean isActivated){
        matchView.getBoard().getSquares()[y][x].addPawn(pawn, isActivated);
    }

    private void updateMatchStats(){
        matchView.getName1().setText(matchController.getPlayer1());
        matchView.getName2().setText(matchController.getPlayer2());
        matchView.getCapturedPawns1().setText("Captured: " + matchController.getCapturedPawns1());
        matchView.getCapturedPawns2().setText("Captured: " + matchController.getCapturedPawns2());
        matchView.getSteps1().setText("Steps: " + matchController.getSteps1());
        matchView.getSteps2().setText("Steps: " + matchController.getSteps2());

    }

    private void addEventHandlers(){
        matchView.getTimer().getPauseButton().setOnAction(e -> {
            if (matchController.isRunning()){
                time.pause();
                matchController.running(false);}
            else{
                time.play();
                matchController.running(true);
            }
        });

        matchView.getTimer().getUndo().setOnAction(e -> System.out.println("Undo"));
    }

}
