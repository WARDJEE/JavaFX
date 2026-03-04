package week02.calculator.view;

import week02.calculator.model.Calculator;

public class Presenter {
    private CalculatorPane view;
    private Calculator model;

    public Presenter(Calculator model, CalculatorPane view) {
        this.view = view;
        this.model = model;
    }

    private void addEventHandlers(){

    }
}
