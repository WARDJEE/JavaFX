package week01.Reverse;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class ReversePresenter {
    private Reverse model;
    private ReversView view;

    public ReversePresenter(Reverse model, ReversView view){
        this.model = model;
        this.view = view;

        addEventHandlers();
        updateView();


    }

    public void addEventHandlers(){
        view.getButton().setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                String text = view.getArea().getText();
                model.setText(text);
                model.reverse();
                updateView();
            }
        });

    }

    public void updateView(){
        view.getArea().getText();
        view.getArea().setText(model.getText());
    }
}
