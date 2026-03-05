package ip.view.Menu;

import ip.model.MatchModel;
import ip.router.Router;
import ip.view.*;
import ip.view.Match.Match;
import ip.view.Match.MatchPresenter;
import javafx.stage.Stage;

public class Presenter {
    private MainMenuView mainMenuView;
    private Router router;
    private Stage stage;

    public Presenter(MainMenuView mainMenuView, Router router, Stage stage) {
        this.mainMenuView = mainMenuView;
        this.router = router;
        this.stage = stage;
        eventsHandler();
    }

    public void eventsHandler() {
        // Exit
        mainMenuView.getLeftMenu().getExit().setOnAction(e -> stage.close());

        // Login view
        mainMenuView.getRightMenu().getAccountButton().setOnAction(e -> {
            DimView dimView = new DimView();
            AccountView accountView = new AccountView();

            // Sluiten van de popup
            accountView.getClose().setOnAction(ev -> router.hideOverlay(dimView, accountView));
            dimView.setOnMouseClicked(ev -> router.hideOverlay(dimView, accountView));

            router.showOverlay(dimView);
            router.showOverlay(accountView);
        });

        // Play
        mainMenuView.getLeftMenu().getPlay().setOnAction(e -> {
            Match match = new Match();
            MatchModel model = new MatchModel();
            new MatchPresenter(model, match);
            router.showOverlay(match);

        });
    }
}