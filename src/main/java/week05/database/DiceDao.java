package week05.database;

import week05.model.MultiSidedDice;
import week05.model.ThrowsArchive;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

    private void createTable() throws SQLException{
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
            throw new SQLException("Fout bij het aanmaken van de database: " + e.getMessage());
        }
    }

    public void create(MultiSidedDice dice) throws SQLException {
        try {
            Statement statement = DaoUtils.createStatement(connection);
            String query = String.format("INSERT INTO Dices VALUES (%d, %d, %d, %d)", dice.getNumberOfSides(), dice.getCurrentDiceValue(), dice.getDiceMinimum(), dice.getDiceMaximum());
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

    public List<Object[]> getStats() throws SQLException {
        List<Object[]> stats = new ArrayList<>();
        String query = "SELECT numberOfSides, COUNT(*) as total, " +
                "SUM(CASE WHEN value = min THEN 1 ELSE 0 END) as hitMin, " +
                "SUM(CASE WHEN value = max THEN 1 ELSE 0 END) as hitMax " +
                "FROM Dices GROUP BY numberOfSides";

        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(query)) {
            while (resultSet.next()) {
                stats.add(new Object[]{
                        resultSet.getInt("numberOfSides"),
                        resultSet.getInt("total"),
                        resultSet.getInt("hitMin"),
                        resultSet.getInt("hitMax")
                });
            }
        }
        return stats;
    }

}
