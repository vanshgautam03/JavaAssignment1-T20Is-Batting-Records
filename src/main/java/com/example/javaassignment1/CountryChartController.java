package com.example.javaassignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountryChartController {

    @FXML
    private BarChart<String, Integer> barchart;
    @FXML
    void backtohome(ActionEvent event) {
        try {
            SceneChanger.changeScene(event, "intro-view.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @FXML
    void playerstable(ActionEvent event) {
        try {
            SceneChanger.changeScene(event, "players-table-view.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void initialize() {
        // Create a HashMap to store the total runs by country
        HashMap<String, Integer> countryRuns = new HashMap<>();

        // Get the players from the database
        ArrayList<Player> players = DBUtility.readPlayersFromDB();

        // Iterate over the players
        for (Player player : players) {
            // Get the country and total runs of the player
            String country = player.getCountryPlayedFor();
            int runs = Player.getRunsScored();

            // If the country is already in the map, add the runs to the existing total
            if (countryRuns.containsKey(country)) {
                countryRuns.put(country, countryRuns.get(country) + runs);
            } else {
                // If the country is not in the map, add it with the current player's runs
                countryRuns.put(country, runs);
            }
        }

        // Iterate over the entries in the map
        for (Map.Entry<String, Integer> entry : countryRuns.entrySet()) {
            // Create a bar for each country
            XYChart.Series<String, Integer> series = new XYChart.Series<>();
            series.getData().add(new XYChart.Data<>(entry.getKey(), entry.getValue()));
            // Add the bar to the chart
            barchart.getData().add(series);
            series.setName(entry.getKey());
        }
    }

}
