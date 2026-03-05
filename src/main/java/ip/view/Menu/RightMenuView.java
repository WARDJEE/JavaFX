package ip.view.Menu;

import ip.style.SahkkuButtonBlue;
import ip.style.SahkkuButtonOrange;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class RightMenuView extends VBox{
    private Button settings;
    private Button rules;
    private Button leaderboard;
    private Button account;

    public RightMenuView() {
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes(){
        settings = new SahkkuButtonBlue("Settings");
        rules = new SahkkuButtonBlue("Rules");
        leaderboard = new SahkkuButtonBlue("Leaderboard");
        account = new SahkkuButtonBlue("Account");
    }

    private void styleNodes(){
        setSpacing(15);
        setPadding(new Insets(15));
        setAlignment(Pos.TOP_RIGHT);


    }

    private void layoutNodes(){
        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        getChildren().addAll(settings, rules, spacer, leaderboard, account);
    }



    public Button getAccountButton() {
        return account;
    }
}
