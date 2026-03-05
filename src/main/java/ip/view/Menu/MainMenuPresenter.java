package ip.view.Menu;

import ip.model.MatchModel;
import ip.router.Router;
import ip.view.*;
import ip.view.Match.Match;
import ip.view.Match.MatchPresenter;
import javafx.stage.Stage;

public class MainMenuPresenter {
    private MainMenuView mainMenuView;
    private Router router;
    private Stage stage;

    public MainMenuPresenter(MainMenuView mainMenuView, Router router, Stage stage) {
        this.mainMenuView = mainMenuView;
        this.router = router;
        this.stage = stage;
        eventsHandler();
    }

    public void eventsHandler() {
        // Afsluiten
        mainMenuView.getLeftMenu().getExit().setOnAction(e -> stage.close());

        // Naar login gaan
        mainMenuView.getRightMenu().getAccountButton().setOnAction(e -> {
            DimView dimView = new DimView();
            AccountView accountView = new AccountView();

            // Sluiten popup
            accountView.getClose().setOnAction(ev -> router.hideOverlay(dimView, accountView));
            dimView.setOnMouseClicked(ev -> router.hideOverlay(dimView, accountView));

            // Tonen popup
            router.showOverlay(dimView);
            router.showOverlay(accountView);
        });

        // Naar game gaan
        mainMenuView.getLeftMenu().getPlay().setOnAction(e -> {
            Match matchView = new Match();
            MatchModel matchModel = new MatchModel();
            new MatchPresenter(matchModel, matchView);
            router.showOverlay(matchView);

        });
    }
}