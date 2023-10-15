package com.example.javaassignment1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("intro-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(),800, 800);
        stage.setTitle("T20I Cricket Batsmen Stats!");
        stage.getIcons().add(new Image(Main.class.getResourceAsStream("images/logo.png")));
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}