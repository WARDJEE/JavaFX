package demos.exceptionsDemo.view;

import demos.exceptionsDemo.model.FavouritesModel;
import demos.exceptionsDemo.model.FavouritesException;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;

import java.util.Set;

public class ExceptionsPresenter {
    private FavouritesModel model;
    private ExceptionsView view;

    public ExceptionsPresenter(FavouritesModel model, ExceptionsView view) {
        this.model = model;
        this.view = view;
        this.addEventHandlers();
    }

    private void addEventHandlers() {
        view.getMenuAddName().setOnAction(actionEvent -> {
            try {
                String name = view.getTfName().getText();
                model.addUser(name);
                showMessage(name + " created");
            } catch (FavouritesException e) {
                showError(e);
            }
        });
        view.getMenuAddFavorite().setOnAction(actionEvent -> {
            try {
                String name = view.getTfName().getText();
                String favourite = view.getTfFavourite().getText();
                model.addFavorite(name, favourite);
                updateView();
                showMessage("favourite \"" + favourite + "\" added for \"" + name + "\"");
            } catch (FavouritesException e) {
                showError(e);
            }
        });
        view.getMenuFindFavorites().setOnAction(actionEvent -> updateView());
    }

    private void showMessage(String melding) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Action performed");
        alert.setContentText(melding);
        alert.showAndWait();
    }

    private void showError(FavouritesException e) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText(e.getMessage());
        alert.showAndWait();
    }

    private void updateView() {
        try {
            String name = view.getTfName().getText();
            Set<String> favourites = model.findFavourites(name);
            ObservableList<String> observableList = FXCollections.observableArrayList(favourites);
            view.setListData(observableList);
        } catch (FavouritesException e) {
            showError(e);
        }
    }
}
