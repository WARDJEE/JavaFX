package week01.Background;

public class BackgroundPresenter {
    private Background model;
    private BackgroundView view;
    public BackgroundPresenter(Background model, BackgroundView view){
        this.model = model;
        this.view = view;

        addEventHandlers();
    }

    public void addEventHandlers(){
        view.getButton().setOnAction(e -> {model.setRandomColor();
        updateView();});
    }

    public void updateView(){
        view.setStyle(String.format("-fx-background-color: %s", model.getBackgroundColor() ));
    }
}
