package week02.calculator.view;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class CalculatorPaneWithConstraints extends GridPane {
    private TextField textField;
    private Button zero, one, two, three, four, five, six, seven, eight, nine, plus, minus, multiply, divide, equals, clear, decimalPoint;

    public CalculatorPaneWithConstraints() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
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

    private void layoutNodes() {
        setHgap(5);
        setVgap(3);
        setPadding(new Insets(5));

        // setConstraints(node, col, row, colSpan, rowSpan, hAlign, vAlign, hGrow, vGrow)

        // Rij 0
        setConstraints(textField, 0, 0, 5, 1, null, null, Priority.ALWAYS, Priority.NEVER);

        // Rij 1
        setConstraints(seven, 0, 1, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(eight, 1, 1, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(nine, 2, 1, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(divide, 3, 1, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(clear, 4, 1, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);

        // Rij 2 (Equals span 3 rijen hoog)
        setConstraints(four, 0, 2, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(five, 1, 2, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(six, 2, 2, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(multiply, 3, 2, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(equals, 4, 2, 1, 3, null, null, Priority.ALWAYS, Priority.ALWAYS);

        // Rij 3
        setConstraints(one, 0, 3, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(two, 1, 3, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(three, 2, 3, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(minus, 3, 3, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);

        // Rij 4 (Komma span 2 kolommen breed)
        setConstraints(zero, 0, 4, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(decimalPoint, 1, 4, 2, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);
        setConstraints(plus, 3, 4, 1, 1, null, null, Priority.ALWAYS, Priority.ALWAYS);

        // Alles toevoegen
        getChildren().addAll(textField, seven, eight, nine, divide, clear,
                four, five, six, multiply, equals,
                one, two, three, minus, zero, decimalPoint, plus);

        // Zorgen dat de knoppen ook echt visueel meeschalen
        Button[] buttons = {zero, one, two, three, four, five, six, seven, eight, nine,
                plus, minus, multiply, divide, decimalPoint, equals, clear};
        for (Button b : buttons) {
            b.setMaxSize(Double.MAX_VALUE, Double.MAX_VALUE);
        }
    }
}