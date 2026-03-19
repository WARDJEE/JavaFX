package week04.numericalSystemsConverter.view;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;

public class ConverterView extends BorderPane {
    private Label label;
    private TextField decimalValue;
    private Label convertedValue;
    private ComboBox<String> numericalSystems;
    private Button convertButton;

    public ConverterView() {
        initialiseNodes();
        layoutNodes();
    }

    private void initialiseNodes() {
        label = new Label("Decimal input value:");
        decimalValue = new TextField();
        numericalSystems = new ComboBox<>();
        convertedValue = new Label("XXXXX");
        convertButton = new Button ("Convert");

        numericalSystems.getItems().addAll("binary", "octal", "hexa");
    }

    private void layoutNodes() {
        GridPane gridPane = new GridPane();

        gridPane.setHgap(20);
        gridPane.setVgap(20);

        gridPane.add(label, 0, 0);
        gridPane.add(decimalValue, 1, 0);

        gridPane.add(numericalSystems, 0, 1);
        gridPane.add(convertedValue, 1, 1);

        setCenter(gridPane);

        setBottom(convertButton);
        setAlignment(convertButton, Pos.CENTER);

        setPadding(new Insets(20));
    }

    public Button getConvertButton() {
        return convertButton;
    }

    public String getDecimalValue() {
        return decimalValue.getText();
    }

    public String getNumericalSystems() {
        return numericalSystems.getValue().toUpperCase();
    }

    public ComboBox<String> getComboBox(){
        return numericalSystems;
    }

    public Label getConvertedValue() {
        return convertedValue;
    }
}
