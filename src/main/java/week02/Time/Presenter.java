package week02.Time;

import java.time.LocalTime;

public class Presenter {
    TimeModel model;
    TimeView view;

    public Presenter(TimeModel model, TimeView view) {
        this.model = model;
        this.view = view;

        addEventHandlers();
        updateView();

    }

    public void addEventHandlers() {
        view.getSlider().setOnMouseDragged(e -> {
            double value = view.getSlider().getValue();

            int hours = (int) value;
            int minutes = (int) Math.round((value - hours) * 60);

            model.setCurrentTime(LocalTime.of(hours, minutes));
            updateView();
        });

        view.getSlider().setOnMouseClicked(e -> {
            double value = view.getSlider().getValue();

            int hours = (int) value;
            int minutes = (int) Math.round((value - hours) * 60);

            model.setCurrentTime(LocalTime.of(hours, minutes));
            updateView();
        });

    }

    public void updateView() {
        view.applyDaylightSun(model.getDaylightPercentage(), model.getSunHeight(), model.getSunPositionX());

        LocalTime time = model.getCurrentTime();
        double value = time.getHour() + (time.getMinute() / 60.0);
        view.getSlider().setValue(value);

    }
}
