package week02.calculator.view;

import week02.calculator.model.Calculator;

import static week02.calculator.model.OperandCharacter.*;
import static week02.calculator.model.Operator.*;

public class Presenter {
    private CalculatorPane view;
    private Calculator model;

    public Presenter(Calculator model, CalculatorPane view) {
        this.view = view;
        this.model = model;
        addEventHandlers();
    }

    private void addEventHandlers() {
        // Cijfers en de punt
        view.getOne().setOnAction(e -> { model.handleInput(ONE); updateView(); });
        view.getTwo().setOnAction(e -> { model.handleInput(TWO); updateView(); });
        view.getThree().setOnAction(e -> { model.handleInput(THREE); updateView(); });
        view.getFour().setOnAction(e -> { model.handleInput(FOUR); updateView(); });
        view.getFive().setOnAction(e -> { model.handleInput(FIVE); updateView(); });
        view.getSix().setOnAction(e -> { model.handleInput(SIX); updateView(); });
        view.getSeven().setOnAction(e -> { model.handleInput(SEVEN); updateView(); });
        view.getEight().setOnAction(e -> { model.handleInput(EIGHT); updateView(); });
        view.getNine().setOnAction(e -> { model.handleInput(NINE); updateView(); });
        view.getDecimalPoint().setOnAction(e -> { model.handleInput(DECIMAL_SEPARATOR); updateView(); });

        // Operatoren
        view.getPlus().setOnAction(e -> { model.handleInput(PLUS); updateView(); });
        view.getMinus().setOnAction(e -> { model.handleInput(MINUS); updateView(); });
        view.getMultiply().setOnAction(e -> { model.handleInput(MULTIPLY); updateView(); });
        view.getDivide().setOnAction(e -> { model.handleInput(DIVIDE); updateView(); });

        // Acties
        view.getEquals().setOnAction(e -> { model.calculate(); updateView(); });
        view.getClear().setOnAction(e -> { model.clear(); updateView(); });

        /*
Both the handleInput method and the calculate method can throw a CalculatorException in case the input is not supported.
Pressing any of the buttons should trigger a call to the updateView method. See next section.*/
    }

    private void updateView(){
        view.getTextField().setText(model.getDisplay());
    }
}
