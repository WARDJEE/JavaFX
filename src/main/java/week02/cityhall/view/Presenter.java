package week02.cityhall.view;

public class Presenter {
    private final CityHallPane view;

    public Presenter(CityHallPane view) {
        this.view = view;

        this.addEventHandlers();
    }

    private void addEventHandlers() {
        // TODO: add event handlers to your controls.
        view.getNormal().setOnAction(e -> view.resetEffect());

        view.getBlackAndWhite().setOnAction(e -> view.applyBlackAndWhiteEffect());

        view.getSepia().setOnAction(e -> view.applySepiaEffect());

    }
}
