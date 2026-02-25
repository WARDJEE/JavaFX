package week01.RetirementCalculator;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class RetirementView extends GridPane {
    private TextField input;
    private Label year;
    private Button button;
    private Label textfield;
    private Label label;

    public RetirementView() {
        initialNodes();
        layoutNodes();
    }

    private void initialNodes() {
        input = new TextField("yyyy");
        input.setPrefColumnCount(4);

        button = new Button("BirthYear > RetirementYear");

        year = new Label();

        textfield = new Label("Put birthyear in");

        label = new Label("Year of retirement:");
    }

    private void layoutNodes() {
        add(textfield, 0, 0);
        add(label, 2, 0);
        add(input, 0, 1);
        setMargin(input, new Insets(10));
        add(button, 1, 1);
        setMargin(button, new Insets(10));
        add(year, 2, 1);
        setMargin(year, new Insets(10));
        setPadding(new Insets(10));

    }

    TextField getInput() {
        return input;
    }

    Label getYear() {
        return year;
    }

    Button getButton() {
        return button;
    }
}
