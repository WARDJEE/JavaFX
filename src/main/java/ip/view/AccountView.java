package ip.view;

import ip.style.SahkkuButton;
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
        login = new SahkkuButton("Log in");
        create = new SahkkuButton("Create account");
    }

    private void styleNodes(){
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setMaxSize(300, 200);

        this.setStyle("""
            -fx-background-color: rgba(20, 30, 40, 0.8);
        -fx-border-color: #00FFFF;
        -fx-border-radius: 10;
            -fx-background-radius: 10;
        """);

        login.setMaxWidth(100);
        create.setMaxWidth(100);


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
