package week01.Background;

import java.util.Random;

public class Background {
    private String backgroundColor;
    private final int MAX_COLOR = 256;

    public Background(){
        this.backgroundColor = "cornsilk";
    }

    public String getBackgroundColor() {
        return backgroundColor;
    }

    public void setRandomColor() {
        Random random = new Random();

        int r = random.nextInt(this.MAX_COLOR);
        int g = random.nextInt(this.MAX_COLOR);
        int b = random.nextInt(this.MAX_COLOR);

        this.backgroundColor = String.format("rgb(%d,%d,%d)", r, g, b);
    }
}
