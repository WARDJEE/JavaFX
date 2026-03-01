package ip.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AccountView extends VBox {
    private Button close;
    private Label title;
    private Button login;
    private Button create;

    public AccountView(){
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        close = new Button("✕");
        title = new Label("Sáhkku");
        login = new Button("Log in");
        create = new Button("Create account");
    }

    private void styleNodes(){
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setMaxSize(300, 200);

        this.setStyle("""
            -fx-background-color: white;
            -fx-background-radius: 10;
        """);

        close.setStyle("""
            -fx-background-color: red;
            -fx-background-radius: 10;
        """);

    }

    private void layoutNodes() {
        this.getChildren().addAll(title, login, create, close);
    }

    public Button getClose(){
        return close;
    }
}
