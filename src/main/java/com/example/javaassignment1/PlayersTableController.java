package com.example.javaassignment1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class PlayersTableController {

    @FXML
    private TableColumn<Player, Integer> ballsfaced;

    @FXML
    private TableColumn<Player, String> country;

    @FXML
    private TableColumn<Player, Integer> matches;

    @FXML
    private TableColumn<Player, Integer> playerid;

    @FXML
    private TableColumn<Player, String> playername;

    @FXML
    private TableColumn<Player, Double> strikerate;

    @FXML
    private TableView<Player> table;

    @FXML
    private TableColumn<Player, Integer> totalruns;

    @FXML
    void backtohome(ActionEvent event) {
        try {
            SceneChanger.changeScene(event, "intro-view.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    void countrycharts(ActionEvent event) {
        try {
            SceneChanger.changeScene(event, "country-charts-view.fxml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private ArrayList<Player> players;

    @FXML
    void initialize() {
        players = DBUtility.readPlayersFromDB();
        playerid.setCellValueFactory(new PropertyValueFactory<>("playerId"));
        playername.setCellValueFactory(new PropertyValueFactory<>("playerName"));
        country.setCellValueFactory(new PropertyValueFactory<>("countryPlayedFor"));
        matches.setCellValueFactory(new PropertyValueFactory<>("matchesPlayed"));
        totalruns.setCellValueFactory(new PropertyValueFactory<>("runsScored"));
        ballsfaced.setCellValueFactory(new PropertyValueFactory<>("ballsFaced"));
        strikerate.setCellValueFactory(new PropertyValueFactory<>("strikeRate"));
        table.getItems().setAll(players);
    }

}
