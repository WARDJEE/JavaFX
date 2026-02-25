package week03.model;

public class TrafficLight {
    private TrafficLightStatus trafficLightStatus;
    private TrafficLightColor trafficLightColor;
    private boolean trafficLightFlashing ;

    public TrafficLight() {
        this(false);
    }

    public TrafficLight(boolean status) {
        setTrafficLightStatus(status);
        trafficLightFlashing = false;
    }

    public void setTrafficLightStatus(boolean status) {
        if (status) {
            this.trafficLightStatus = TrafficLightStatus.LIGHT_ON;
            this.trafficLightColor = TrafficLightColor.TL_RED;
        } else this.trafficLightStatus = TrafficLightStatus.LIGHT_OFF;
    }

    public TrafficLightStatus getTrafficLightStatus() {
        return trafficLightStatus;
    }

    public TrafficLightColor getTrafficLightColor() {
        return trafficLightColor;
    }

    public boolean getTrafficLightFlashing() {
        return trafficLightFlashing;
    }

    public void setTrafficLightFlashing(boolean trafficLightFlashing) {
        this.trafficLightFlashing = trafficLightFlashing;
    }

    public void nextColor() {
        if (trafficLightStatus == TrafficLightStatus.LIGHT_ON) {
            switch (trafficLightColor) {
                case TL_GREEN:
                    trafficLightColor = TrafficLightColor.TL_YELLOW;
                    break;
                case TL_YELLOW:
                    trafficLightColor = TrafficLightColor.TL_RED;
                    break;
                case TL_RED:
                    trafficLightColor = TrafficLightColor.TL_GREEN;
                    break;
            }
        }
    }
}

