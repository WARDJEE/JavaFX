package Testje;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class RightMenuView extends VBox{
    StackPane root;
    public RightMenuView(StackPane root){
        this.root = root;
        this.setSpacing(15);
        this.setPadding(new Insets(15));
        this.setAlignment(Pos.TOP_RIGHT);

        Button settings = new Button("Settings");
        Button rules = new Button("Rules");
        Button stats = new Button("Stats");
        Button account = new Button("Account");

        account.setOnAction(e -> showLoginOverlay());


        this.getChildren().addAll(settings, rules, stats, account);
    }

    private void showLoginOverlay() {

        // Dim achtergrond
        DimView dimView = new DimView();

        // Popup
        AccountView accountView = new AccountView();

        accountView.getClose().setOnAction(e -> root.getChildren().removeAll(dimView, accountView));
        dimView.setOnMouseClicked(e -> root.getChildren().removeAll(dimView, accountView));

        root.getChildren().addAll(dimView, accountView);
    }
}
