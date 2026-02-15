package Test;

import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;

public class StartView extends GridPane {
    private final MenuBar bar = new MenuBar();
    private final ToggleButton toggleButton = new ToggleButton("Light");
    private final Button play = new Button("Play");
    private final Button newGame = new Button("New game");
    private final Button credis = new Button("Credits");
    private final Button exit = new Button("Exit");





    public StartView(){
        this.setVgap(20);
        /*bar.setStyle("-fx-background-color: #ffffff;");

        Menu file = new Menu("File");
        Menu options = new Menu("Options");

        MenuItem open = new MenuItem("Open");
        MenuItem save = new MenuItem("Save");
        MenuItem exitMenu = new MenuItem("Exit");

        file.getItems().addAll(open, save, new SeparatorMenuItem() , exitMenu);

        this.bar.getMenus().addAll(file, options);

        this.add(bar, 1, 1);*/

        Text titel = new Text("Sáhkku");
        this.add(titel, 1, 1);

        this.add(play, 1, 2);
        this.add(newGame, 1, 3);
        this.add(credis, 1, 4);
        this.add(exit, 1, 5);

    Button button = new Button();
    this.add(button,1, 6);

        CheckBox checkBox = new CheckBox("Check");
        this.add(checkBox, 2, 1);

        this.add(toggleButton, 3, 1);


        checkBox.setOnMouseEntered(e ->
        {
            checkBox.setScaleX(1.2);
            checkBox.setScaleY(1.2);
        });


        checkBox.setOnMouseExited(e ->
        {
            checkBox.setScaleX(1);
            checkBox.setScaleY(1);
        });


    }

    public Button getExit(){
        return this.exit;
    }

    public ToggleButton getToggleButton(){
        return this.toggleButton;
    }

    public MenuBar getBar(){
        return this.bar;
    }

    public Button[] getButtons(){
        return new Button[]{play, newGame, credis, exit};
    }
}
