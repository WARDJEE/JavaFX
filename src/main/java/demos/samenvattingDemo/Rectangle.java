package demos.samenvattingDemo;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.setWidth(width);
        this.setLength(length);
    }

    public int getLength() {
        return length;
    }

    public final void setLength(int length) {
        if (length < 0) {
            throw new IllegalArgumentException("Length must be positive");
        }
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    private void checkPositiveValues(int length, int width) {
        if (length < 0 || width < 0) {
            throw new IllegalArgumentException("length and width should be positive");
        }
    }

    public final void setWidth(int width) {
        if (width < 0) {
            throw new IllegalArgumentException("Width must be positive");
        }
        this.width = width;
    }
}
