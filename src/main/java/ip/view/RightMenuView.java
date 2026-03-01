package ip.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.*;

public class RightMenuView extends VBox{
    private Button settings = new Button("Settings");
    private Button rules = new Button("Rules");
    private Button leaderboard = new Button("Leaderboard");
    private Button account = new Button("Account");

    public RightMenuView() {
        this.setSpacing(15);
        this.setPadding(new Insets(15));
        this.setAlignment(Pos.TOP_RIGHT);

        Region spacer = new Region();
        VBox.setVgrow(spacer, Priority.ALWAYS);

        this.getChildren().addAll(settings, rules, spacer, leaderboard, account);
    }

    public Button getAccountButton() {
        return account;
    }
}
