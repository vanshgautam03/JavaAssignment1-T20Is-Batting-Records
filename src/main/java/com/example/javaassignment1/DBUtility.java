package com.example.javaassignment1;

import javafx.scene.chart.XYChart;

import java.sql.*;
import java.util.ArrayList;
import java.util.Collection;

public class DBUtility {
    private static  String userName = "Vansh200544016";
    private static  String password = "nPZgThx8lf";
    private static  String dbUrl = "jdbc:mysql://172.31.22.43:3306/Vansh200544016";
    public static ArrayList<Player> readPlayersFromDB() {
        ArrayList<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM Players ORDER BY PlayerID";
        try (
                Connection connection = DriverManager.getConnection(dbUrl, userName, password);
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);
        ) {
            while (resultSet.next()) {
                int playerId = resultSet.getInt("PlayerID");
                String playerName = resultSet.getString("PlayerName");
                String countryPlayedFor = resultSet.getString("Country");
                int matchesPlayed = resultSet.getInt("Innings");
                int runsScored = resultSet.getInt("TotalRuns");
                int ballsFaced = resultSet.getInt("BallsFaced");
                double strikeRate = resultSet.getDouble("StrikeRate");
                Player newplayer = new Player(playerId, playerName, countryPlayedFor, matchesPlayed, runsScored, ballsFaced, strikeRate);
                players.add(newplayer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return players;
    }
}
