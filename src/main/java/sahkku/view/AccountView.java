package sahkku.view;

import sahkku.style.SahkkuButtonBlue;
import sahkku.style.SahkkuButtonOrange;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

// We veranderen de basis van VBox naar StackPane
public class AccountView extends StackPane {
    private Button close;
    private Label title;
    private Button login;
    private Button create;
    private VBox contentBox;

    public AccountView(){
        initialiseNodes();
        styleNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        close = new Button("✕");
        title = new Label("Sáhkku");
        login = new SahkkuButtonOrange("Log in");
        create = new SahkkuButtonBlue("Create account");
        contentBox = new VBox();
    }

    private void styleNodes(){
        // Style vbox
        contentBox.setSpacing(15);
        contentBox.setAlignment(Pos.CENTER);
        contentBox.setPadding(new Insets(20));
        contentBox.setMaxSize(300, 200);
        contentBox.setStyle("""
            -fx-background-color: rgba(255, 255, 255, 0.8);
            -fx-border-color: #74c99e;
            -fx-border-radius: 8;
            -fx-background-radius: 8;
        """);

        login.setMaxWidth(120);
        create.setMaxWidth(120);

        // Style close
        close.setStyle("""
            -fx-background-color: red;
            -fx-text-fill: black;
            -fx-background-radius: 8;
            -fx-min-width: 30;
            -fx-min-height: 30;
            -fx-max-width: 30;
            -fx-max-height: 30;
            -fx-font-weight: bold;
        """);

    }

    private void layoutNodes() {
        // Place close
        StackPane.setAlignment(close, Pos.TOP_RIGHT);
        close.setTranslateX(10);
        close.setTranslateY(-10);

        this.setMaxSize(300, 200);

        contentBox.getChildren().addAll(title, login, create);

        this.getChildren().addAll(contentBox, close);
    }

    public Button getClose(){
        return close;
    }
}