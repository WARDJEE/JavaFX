package sahkku.view.menu;

import sahkku.controllers.MatchController;
import sahkku.router.Router;
import sahkku.view.*;
import sahkku.view.match.MatchView;
import sahkku.view.match.MatchPresenter;
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
            MatchView matchView = new MatchView();
            MatchController matchController = new MatchController();
            new MatchPresenter(matchController, matchView);
            router.showOverlay(matchView);

        });
    }
}