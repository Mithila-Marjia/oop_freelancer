package com.example.freelancerproject;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;



public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        URL resource = HelloApplication.class.getResource("Admin/DashBoardFxml.fxml");
        System.out.println("FXML URL: " + resource);

        FXMLLoader fxmlLoader = new FXMLLoader(resource);
//        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CustomerSupport/DashBoardFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("CustomerSupport DashBoard");

        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}