package week01.Reverse;

public class Reverse {
    private String text;

    public Reverse(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void reverse(){
        this.text = new StringBuilder(this.text).reverse().toString();

    }
}
