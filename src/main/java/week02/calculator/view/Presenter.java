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
    }

    private void addEventHandlers() {
       view.getOne().setOnAction(e -> model.handleInput(ONE));
        view.getTwo().setOnAction(e -> model.handleInput(TWO));
        view.getThree().setOnAction(e -> model.handleInput(THREE));
        view.getFour().setOnAction(e -> model.handleInput(FOUR));
        view.getFive().setOnAction(e -> model.handleInput(FIVE));
        view.getSix().setOnAction(e -> model.handleInput(SIX));
        view.getSeven().setOnAction(e -> model.handleInput(SEVEN));
        view.getEight().setOnAction(e -> model.handleInput(EIGHT));
        view.getNine().setOnAction(e -> model.handleInput(NINE));
        view.getDecimalPoint().setOnAction(e -> model.handleInput(DECIMAL_SEPARATOR));

        view.getPlus().setOnAction(e -> model.handleInput(PLUS));
        view.getMinus().setOnAction(e -> model.handleInput(MINUS));
        view.getMultiply().setOnAction(e -> model.handleInput(MULTIPLY));
        view.getDivide().setOnAction(e -> model.handleInput(DIVIDE));

        view.getEquals().setOnAction(e -> model.calculate());
        view.getClear().setOnAction(e -> model.clear());
        /*


Both the handleInput method and the calculate method can throw a CalculatorException in case the input is not supported.
Pressing any of the buttons should trigger a call to the updateView method. See next section.*/
    }
}
