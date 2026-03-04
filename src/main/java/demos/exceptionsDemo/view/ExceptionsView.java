package demos.exceptionsDemo.view;

import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.control.*;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

public class ExceptionsView extends BorderPane {
    private TextField tfName;
    private TextField tfFavourite;
    private ListView<String> lvFavourites;
    private MenuItem menuAddName;
    private MenuItem menuAddFavorite;
    private MenuItem menuFindFavorites;

    public ExceptionsView() {
        this.initialiseNodes();
        this.layoutNodes();
    }

    private void initialiseNodes() {
        this.tfName = new TextField();
        this.tfFavourite = new TextField();
        this.lvFavourites = new ListView<>();
        this.menuAddName = new MenuItem("Add name");
        this.menuAddFavorite = new MenuItem("Add favourite");
        this.menuFindFavorites = new MenuItem("Search favourites");
    }

    private void layoutNodes() {
        final Menu actiesMenu = new Menu("Actions", null, this.menuAddName, this.menuAddFavorite, this.menuFindFavorites);
        final MenuBar menuBar = new MenuBar(actiesMenu);
        this.setTop(menuBar);
        this.setCenter(lvFavourites);
        HBox hBox = new HBox();
        Label lblNaam = new Label("Name: ");
        Label lblFavoriet = new Label("Favourite: ");
        hBox.getChildren().addAll(lblNaam, tfName, lblFavoriet, tfFavourite);
        HBox.setHgrow(tfName, Priority.ALWAYS);
        HBox.setHgrow(tfFavourite, Priority.ALWAYS);
        hBox.setPadding(new Insets(10));
        this.setBottom(hBox);
    }

    TextField getTfName() {
        return tfName;
    }

    TextField getTfFavourite() {
        return tfFavourite;
    }

    ListView getLvFavourites() {
        return lvFavourites;
    }

    MenuItem getMenuAddName() {
        return menuAddName;
    }

    MenuItem getMenuAddFavorite() {
        return menuAddFavorite;
    }

    MenuItem getMenuFindFavorites() {
        return menuFindFavorites;
    }

    void setListData(ObservableList observableList) {
        this.lvFavourites.setItems(observableList);
    }
}
