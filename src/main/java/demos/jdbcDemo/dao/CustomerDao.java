package demos.jdbcDemo.dao;

import java.sql.*;
import java.util.HashSet;
import java.util.Set;

public class CustomerDao {
    private Connection connection;

    public CustomerDao() {
        DaoUtils.loadDriver();
        this.connection = DaoUtils.createConnection();
        createTable();
    }

    private void createTable() {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            statement.execute("CREATE TABLE Customer (" +
                    " id int IDENTITY," +
                    " name varchar(255)" +
                    ")");
            DaoUtils.closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            // probably no error since table already exists
        }
    }

    public void create(Customer customer) {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            String query = String.format("INSERT INTO Customer VALUES (NULL, '%s')", customer.getName());
            statement.executeUpdate(query);
            ResultSet resultSet = statement.executeQuery("CALL IDENTITY()");
            resultSet.next();
            int id = resultSet.getInt(1);
            customer.setId(id);
            DaoUtils.closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot create new customer", e);
        }
    }

    public void delete(Customer customer) {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            statement.executeUpdate("DELETE FROM Customer WHERE id='" + customer.getId() + "'");
            DaoUtils.closeStatement(statement);
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot delete customer " + customer, e);
        }
    }

    public Set<Customer> retrieveAll() {
        try {
            Set<Customer> result = new HashSet<>();
            Statement statement = DaoUtils.createStatement(connection);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Customer");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                Customer customer = new Customer(name);
                customer.setId(id);
                result.add(customer);
            }
            DaoUtils.closeStatement(statement);
            return result;
        } catch (SQLException e) {
            throw new CustomerDaoException("Cannot retrieve data from database", e);
        }
    }

    public void close() {
        DaoUtils.closeConnection(connection);
    }
}
