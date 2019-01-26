package com.novak.converter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class ConverterApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("mainAppView.fxml"));
        System.out.println(getClass().getResource("mainAppView.fxml"));
        Parent root = loader.load();
        primaryStage.setTitle("Almost Google-like measures converter");
        primaryStage.setScene(new Scene(root, 300, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}