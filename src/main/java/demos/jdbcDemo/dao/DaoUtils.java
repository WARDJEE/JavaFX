package demos.jdbcDemo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtils {
    public static void loadDriver() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            throw new CustomerDaoException("Fatal error: cannot load database driver", e);
        }
    }

    public static Connection createConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:db/myDatabase","sa", "");
            return connection;
        } catch (SQLException e){
            throw new CustomerDaoException("Cannot create connection with database", e);
        }
    }

    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                Statement statement = createStatement(connection);
                statement.execute("SHUTDOWN");
                closeStatement(statement);
                connection.commit();
                connection.close();
            }
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot close connection to DB", e);
        }
    }

    public static Statement createStatement(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot create statement", e);
        }
    }

    public static void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot close statement", e);
        }
    }
}
