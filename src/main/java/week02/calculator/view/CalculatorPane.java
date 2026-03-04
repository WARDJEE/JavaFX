package week02.calculator.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class CalculatorPane extends GridPane {
    private TextField textField;
    private Button zero;
    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;

    private Button plus;
    private Button minus;
    private Button multiply;
    private Button divide;

    private Button equals;
    private Button clear;
    private Button decimalPoint;

    public CalculatorPane(){
        initialiseNodes();
        layoutNodes();

    }

    private void initialiseNodes(){
        textField = new TextField();
        textField.setEditable(false);

        zero = new Button("0");
        one = new Button("1");
        two = new Button("2");
        three = new Button("3");
        four = new Button("4");
        five = new Button("5");
        six = new Button("6");
        seven = new Button("7");
        eight = new Button("8");
        nine = new Button("9");

        plus = new Button("+");
        minus = new Button("-");
        multiply = new Button("x");
        divide = new Button("÷");
        decimalPoint = new Button(",");
        equals = new Button("=");
        clear = new Button("C");

    }

    private void layoutNodes(){
        add(textField, 0, 0, 5, 1);
        setColumnSpan(textField, 5);

        add(seven, 0, 1);
        add(eight, 1, 1);
        add(nine, 2, 1);
        add(divide, 3, 1);
        add(clear, 4, 1);

        add(four, 0, 2);
        add(five, 1, 2);
        add(six, 2, 2);
        add(multiply, 3, 2);
        add(equals, 4, 2);
        setRowSpan(equals, 3);


        add(one, 0, 3);
        add(two, 1, 3);
        add(three, 2, 3);
        add(minus, 3, 3);

        add(zero, 0, 4);
        add(decimalPoint, 1, 4);
        setColumnSpan(decimalPoint, 2);
        add(plus, 3, 4);

        setHgap(5);
        setVgap(3);
        setPadding(new Insets(5));


        Button[] buttons = {zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, divide, decimalPoint, equals, clear};
        for (Button button : buttons) {
            button.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
            setHgrow(button, Priority.ALWAYS);           // Laat de kolom groeien
            setVgrow(button, Priority.ALWAYS);           // Laat de rij groeien

        }
    }

    public TextField getTextField() {
        return textField;
    }

    public Button getZero() {
        return zero;
    }

    public Button getOne() {
        return one;
    }

    public Button getTwo() {
        return two;
    }

    public Button getThree() {
        return three;
    }

    public Button getFour() {
        return four;
    }

    public Button getFive() {
        return five;
    }

    public Button getSix() {
        return six;
    }

    public Button getSeven() {
        return seven;
    }

    public Button getEight() {
        return eight;
    }

    public Button getNine() {
        return nine;
    }

    public Button getPlus() {
        return plus;
    }

    public Button getMinus() {
        return minus;
    }

    public Button getMultiply() {
        return multiply;
    }

    public Button getDivide() {
        return divide;
    }

    public Button getEquals() {
        return equals;
    }

    public Button getClear() {
        return clear;
    }

    public Button getDecimalPoint() {
        return decimalPoint;
    }
}
