package demos.eventsDemo.view;

import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;

public class KeyTypedDemo extends BorderPane {
    private TextField textField;

    public KeyTypedDemo() {
        textField = new TextField();
        this.setBottom(textField);
        BorderPane.setMargin(textField, new Insets(30));
        textField.setOnKeyTyped(event -> handleKeyTyped(event));
    }

    private void handleKeyTyped(KeyEvent event) {
        if ("aeiouy".contains(event.getCharacter())) {
            String content = textField.getText();
            textField.setText(content.substring(0, content.length()-1));
            textField.positionCaret(content.length()-1);
        }
    }
}
