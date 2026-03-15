package week05.view;

import javafx.stage.Stage;

public class AboutScreenPresenter {
    private AboutScreenView view;

    public AboutScreenPresenter(AboutScreenView view) {
        this.view = view;
        addEventHandlers();
    }

    private void addEventHandlers() {
        view.getOk().setOnAction(event -> {
            // Sluit het venster
            Stage stage = (Stage) view.getScene().getWindow();
            stage.close();

        });
    }
}