package week04.numericalSystemsConverter.view;

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
                    convertedValue = model.convertToNumericalSystem(view.getDecimalValue(), ModelConverter.NumericalSystems.valueOf(view.getNumericalSystems()));
                    updateView();
                }
        );

        view.getComboBox().setOnAction(e -> view.getConvertedValue().setText("XXXXX"));


    }

    private void updateView() {/* fills view*/
        view.getConvertedValue().setText(convertedValue);
    }
}