package week05.database;

import week05.model.MultiSidedDice;
import week05.model.ThrowsArchive;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Set;

public class DiceDao {
    private Connection connection;
    private ThrowsArchive throwsArchive;

    public DiceDao() throws SQLException {
        DaoUtils.loadDriver();
        throwsArchive = new ThrowsArchive();
        this.connection = DaoUtils.createConnection();
        createTable();
    }

    private void createTable() {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            statement.execute("CREATE TABLE IF NOT EXISTS Dices (" +
                    " numberOfSides int," +
                    " value int," +
                    " min int," +
                    " max int" +
                    ")");
            DaoUtils.closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            if (e.getSQLState().equals("42501")) {
                System.err.println("Tabel bestaat al: " + e.getMessage());
            }
            else System.err.println("Fout bij het aanmaken van de tabel: " + e.getMessage());
        }
    }

    public void create(MultiSidedDice dice) throws SQLException {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            String query = String.format("INSERT INTO Dices VALUES (%d, %d, %d, %d)", dice.getDiceMaximum()-dice.getDiceMinimum(), dice.getCurrentDiceValue(), dice.getDiceMinimum(), dice.getDiceMaximum());
            statement.executeUpdate(query);
            throwsArchive.addValueToArchive(dice);
            DaoUtils.closeStatement(statement);
            connection.commit();
        } catch (SQLException e) {
            throw new SQLException("Cannot create new dice", e);
        }
    }

    public Set<Integer> retrieveAll() throws SQLException {
        try {
            Set<Integer> result = new HashSet<>();
            Statement statement = DaoUtils.createStatement(connection);
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Dices");
            while (resultSet.next()) {
                int value = resultSet.getInt("value");
                result.add(value);
            }
            DaoUtils.closeStatement(statement);
            return result;
        } catch (SQLException e) {
            throw new SQLException("Cannot retrieve data from database", e);
        }
    }

    public void close() throws SQLException {
        DaoUtils.closeConnection(connection);
    }

}
