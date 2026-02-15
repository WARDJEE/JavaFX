package Testje;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Sahkku extends Application {

    private StackPane root;
    Stage stage;

    @Override
    public void start(Stage stage) {
        root = new StackPane();

        this.stage = stage;

        Pane mainView = createMainView();
        root.getChildren().add(mainView);

        Scene scene = new Scene(root, 800, 500);
        stage.setScene(scene);
        stage.setTitle("Sáhkku");
        stage.show();
    }

    public StackPane getRoot(){
        return this.root;
    }

    private Pane createMainView() {
        BorderPane borderPane = new BorderPane();

        LeftMenuView leftMenuView = new LeftMenuView();
        RightMenuView rightMenuView = new RightMenuView(root);

        Presenter presenter = new Presenter(leftMenuView, this.stage);

        borderPane.setLeft(leftMenuView);
        borderPane.setRight(rightMenuView);
        return borderPane;
    }

    /*private void showLoginOverlay() {

        // Dim achtergrond
        DimView dimView = new DimView();

        // Popup
        AccountView accountView = new AccountView();/*
                accountView.setAlignment(Pos.CENTER);
        accountView.setPadding(new Insets(20));
        accountView.setMaxSize(300, 200);
        accountView.setStyle("""
            -fx-background-color: white;
            -fx-background-radius: 10;
        """);

        Label title = new Label("Sáhkku");
        Button login = new Button("Log in");
        Button create = new Button("Create account");
        Button close = new Button("✕");
        close.setStyle("""
            -fx-background-color: red;
            -fx-background-radius: 10;
        """);

        accountView.getClose().setOnAction(e -> root.getChildren().removeAll(dimView, accountView));
        dimView.setOnMouseClicked(e -> root.getChildren().removeAll(dimView, accountView));


        root.getChildren().addAll(dimView, accountView);
    }*/

    public static void main(String[] args) {
        launch(args);
    }
}
