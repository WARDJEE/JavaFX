package demos.jdbcDemo.jdbc;

import java.sql.*;

public class PuurJdbcDemo {
    private void loadDriver() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
        } catch (ClassNotFoundException e) {
            System.err.println("Fatal error: cannot load database driver");
            System.exit(1);
        }
    }

    private Connection createConnection() {
        try {
            Connection connection = DriverManager.getConnection("jdbc:hsqldb:file:db/myDatabase","sa", "");
            return connection;
        } catch (SQLException ex){
            System.err.println("Connection to DB failed!");
            System.err.println(ex.getMessage());
            return null;
        }
    }

    private void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                Statement statement = createStatement(connection);
                statement.execute("SHUTDOWN");
                closeStatement(statement);
                connection.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close connection to DB");
        }
    }

    private Statement createStatement(Connection connection) {
        try {
            Statement statement = connection.createStatement();
            return statement;
        } catch (SQLException e) {
            System.err.println("Cannot create statement");
            return null;
        }
    }

    private void closeStatement(Statement statement) {
        try {
            if (statement != null) {
                statement.close();
            }
        } catch (SQLException e) {
            System.err.println("Cannot close statement");
        }
    }

    private void createTable(Connection connection) {
        try {
            Statement statement = createStatement(connection);
            if (statement != null) {
                statement.execute("CREATE TABLE Customer (" +
                        " id int IDENTITY," +
                        " name varchar(255)" +
                        ")");
            }
            closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            System.out.println("Cannot create table in database (maybe it already existed)");
        }
    }

    private void insertData(Connection connection) {
        try {
            Statement statement = createStatement(connection);
            statement.executeUpdate("INSERT INTO Customer (id, name) VALUES (1, 'Kris')");
            statement.executeUpdate("INSERT INTO Customer (id, name) VALUES (2, 'Carmen')");
            statement.executeUpdate("INSERT INTO Customer (id, name) VALUES (3, 'Sarah')");
            statement.executeUpdate("INSERT INTO Customer (id, name) VALUES (4, 'Noam')");
            closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            System.out.println("Cannot create data in table (maybe it was already there)");
        }
    }

    private void showData(Connection connection) {
        try {
            Statement statement = createStatement(connection);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Customer");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.printf("Klant '%s' met nummer %d%n", name, id);
            }
            closeStatement(statement);
        } catch (SQLException e) {
            System.err.println("Cannot retrieve data from DB");
            System.err.println(e.getMessage());
        }
    }

    public void start() {
        try {
            loadDriver();
            Connection connection = createConnection();
            createTable(connection);
            insertData(connection);
            showData(connection);
            connection.commit();
            closeConnection(connection);
        } catch (SQLException e) {
            System.err.println("cannot commit transaction");
        }
    }
}
