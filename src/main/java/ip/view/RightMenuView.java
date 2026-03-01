package ip.view;

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
        settings = new Button("Settings");
        rules = new Button("Rules");
        leaderboard = new Button("Leaderboard");
        account = new Button("Account");
    }

    private void styleNodes(){
        this.setSpacing(15);
        this.setPadding(new Insets(15));
        this.setAlignment(Pos.TOP_RIGHT);
    }

    private void layoutNodes(){
        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        this.getChildren().addAll(settings, rules, spacer, leaderboard, account);
    }



    public Button getAccountButton() {
        return account;
    }
}
