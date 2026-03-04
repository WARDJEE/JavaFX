package week04.numericalSystemsConverter.view;

import week04.numericalSystemsConverter.model.ModelConverter;

public class ConverterPresenter {
    private final ModelConverter model;
    private final ConverterView view;

    public ConverterPresenter(ModelConverter model, ConverterView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();
        updateView();
    }

    private void addEventHandlers() {
        view.getConvertButton().setOnAction(e ->
            model.convertToNumericalSystem(String.valueOf(view.getDecimalValue()), ModelConverter.NumericalSystems.valueOf(view.getNumericalSystems()))
        );

    }
    private void updateView() {/* fills view*/}
}