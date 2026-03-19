package week02.birds;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class BirdsView extends BorderPane {
    private MenuBar menuBar;
    private Image image;
    private ImageView imageViewMenu;
    private ImageView imageViewItem;
    private ImageView imageViewBox;
    private Menu menu;
    private MenuItem item;
    private CheckBox checkBox;

    public BirdsView(Stage stage) {
        initialiseNodes();
        layoutNodes();

        stage.getIcons().add(image);
        stage.setTitle("Birds");

    }

    private void initialiseNodes(){
        menuBar = new MenuBar();
        image = new Image("/angrybird.png");

        imageViewMenu = new ImageView(image);
        imageViewItem = new ImageView(image);
        imageViewBox = new ImageView(image);

        menu = new Menu("File", imageViewMenu);
        item = new MenuItem("Bird", imageViewItem);

        checkBox = new CheckBox();

    }

    private void layoutNodes(){
        menu.getItems().add(item);
        menuBar.getMenus().add(menu);

        setTop(menuBar);

        checkBox.setGraphic(imageViewBox);
        setCenter(checkBox);
    }

    public CheckBox getCheckBox() {
        return checkBox;
    }
}
