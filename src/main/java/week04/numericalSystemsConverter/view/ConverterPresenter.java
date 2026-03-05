package week04.numericalSystemsConverter.view;

import javafx.scene.control.Alert;
import week04.numericalSystemsConverter.model.ModelConverter;

public class ConverterPresenter {
    private final ModelConverter model;
    private final ConverterView view;
    private String convertedValue;

    public ConverterPresenter(ModelConverter model, ConverterView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {

        view.getConvertButton().setOnAction(e -> {
                    try {
                        ModelConverter.NumericalSystems stelsel = ModelConverter.NumericalSystems.valueOf(view.getNumericalSystems());
                        convertedValue = model.convertToNumericalSystem(view.getDecimalValue(), stelsel);
                        updateView();
                    } catch (IllegalArgumentException ex) {
                        showError(ex);
                    }
                }

        );

        view.getComboBox().setOnAction(e -> view.getConvertedValue().setText("XXXXX"));


    }

    private void updateView() {/* fills view*/
        view.getConvertedValue().setText(convertedValue);
    }

    private void showError(Exception exc) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error!");
        alert.setContentText(exc.getMessage());
        alert.showAndWait();
    }
}