package Testje;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class AccountView extends VBox {
    Button close = new Button("✕");
    public AccountView(){
        this.setSpacing(15);
        this.setAlignment(Pos.CENTER);
        this.setPadding(new Insets(20));
        this.setMaxSize(300, 200);
        this.setStyle("""
            -fx-background-color: white;
            -fx-background-radius: 10;
        """);

        Label title = new Label("Sáhkku");
        Button login = new Button("Log in");
        Button create = new Button("Create account");
        close.setStyle("""
            -fx-background-color: red;
            -fx-background-radius: 10;
        """);

        this.getChildren().addAll(title, login, create, close);

    }

    public Button getClose(){
        return close;
    }
}
