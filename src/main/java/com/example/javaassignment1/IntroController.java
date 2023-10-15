package com.example.javaassignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import java.io.IOException;

public class IntroController {

    @FXML
    void countrycharts(ActionEvent event) throws IOException {
        try {
            SceneChanger.changeScene(event, "country-charts-view.fxml");
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

}
