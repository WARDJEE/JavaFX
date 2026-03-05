package ip.view.Match;

import ip.model.MatchModel;

public class MatchPresenter {
    private MatchModel model;
    private Match view;

    public MatchPresenter(MatchModel model, Match view){
        this.model = model;
        this.view = view;
        updateView();
    }

    private void updateView(){
        view.getName1().setText(model.getPlayer1());
        view.getName2().setText(model.getPlayer2());
        view.getCapturedPawns1().setText("Captured: " + model.getCapturedPawns1());
        view.getCapturedPawns2().setText("Captured: " + model.getCapturedPawns2());
        view.getSteps1().setText("Steps: " + model.getSteps1());
        view.getSteps2().setText("Steps: " + model.getSteps2());

    }
}
