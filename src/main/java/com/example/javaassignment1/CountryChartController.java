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
        XYChart.Series<String, Integer> series = DBUtility.getDataForCountryChart();
        barchart.getData().add(series);
    }

}
