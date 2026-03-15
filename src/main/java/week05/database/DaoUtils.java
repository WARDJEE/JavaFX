package week05.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DaoUtils {
    public static void loadDriver() throws SQLException {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            throw new SQLException("Fatal error: cannot load database driver", e);
        }
    }

    public static Connection createConnection() throws SQLException{
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:recourses/database/hundredSidedDiceDB","sa", "");
            return connection;
        } catch (SQLException e){
            throw new SQLException("Cannot create connection with database", e);
        }
    }

    public static void closeConnection(Connection connection) throws SQLException{
        try {
            if (connection != null) {
                Statement statement = createStatement(connection);
                statement.execute("SHUTDOWN");
                closeStatement(statement);
                connection.commit();
                connection.close();
            }
        } catch (SQLException e) {
            throw new SQLException("Cannot close connection to DB", e);
        }

    }

    public static Statement createStatement(Connection connection) throws SQLException{
        try {
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException e) {
            throw new SQLException("Cannot create statement", e);
        }
    }

    public static void closeStatement(Statement statement) throws SQLException{
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            throw new SQLException("Cannot close statement", e);
        }
    }
}
