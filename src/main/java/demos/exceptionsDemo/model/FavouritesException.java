package demos.exceptionsDemo.model;

public class FavouritesException extends Exception {
    public FavouritesException(String s) {
        super(s);
    }

    public FavouritesException(Throwable cause) {
        super(cause);
    }
}
