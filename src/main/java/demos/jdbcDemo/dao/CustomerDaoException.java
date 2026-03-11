package demos.jdbcDemo.dao;

public class CustomerDaoException extends RuntimeException {
    public CustomerDaoException(String message) {
        super(message);
    }

    public CustomerDaoException(String message, Exception cause) {
        super(message, cause);
    }
}
