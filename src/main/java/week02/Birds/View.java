package week02.Birds;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;


public class View extends BorderPane {
    public View(Stage stage) {
        MenuBar menuBar = new MenuBar();

        Image image = new Image("/angrybird.png");

        ImageView imageViewMenu = new ImageView(image);
        ImageView imageViewItem = new ImageView(image);
        ImageView imageViewBox = new ImageView(image);

        stage.getIcons().add(image);
        stage.setTitle("Birds");

        Menu menu = new Menu("File", imageViewMenu);
        MenuItem item = new MenuItem("Bird", imageViewItem);

        menu.getItems().add(item);
        menuBar.getMenus().add(menu);

        this.setTop(menuBar);

        CheckBox checkBox = new CheckBox();
        checkBox.setGraphic(imageViewBox);
        this.setCenter(checkBox);

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
        checkBox.setOnMouseClicked(e ->
        {checkBox.setScaleX(10);
        checkBox.setScaleY(10);});
    }
}
