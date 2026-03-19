package week01.retirementCalculator;


public class RetirementPresenter {
    Retirement model;
    RetirementView view;

    public RetirementPresenter(Retirement model, RetirementView view) {
        this.model = model;
        this.view = view;
        addEventHandlers();

    }

    public void addEventHandlers() {
        view.getButton().setOnAction(e -> {
            model.setBirthYear(Integer.parseInt(view.getInput().getText()));
            updateView();
        });

    }

    private void updateView() {
        view.getYear().setText(model.getRetirementYear());
    }
}
