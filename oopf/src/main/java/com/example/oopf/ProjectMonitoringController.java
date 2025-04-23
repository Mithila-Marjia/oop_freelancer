package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class ProjectMonitoringController {

    @FXML
    public void viewProjectsOnAction(ActionEvent actionEvent) {
        // Logic for viewing ongoing projects
        System.out.println("View Ongoing Projects Clicked");
    }

    @FXML
    public void trackProgressOnAction(ActionEvent actionEvent) {
        // Logic for tracking project progress
        System.out.println("Track Progress Clicked");
    }

    @FXML
    public void assignTasksOnAction(ActionEvent actionEvent) {
        // Logic for assigning tasks
        System.out.println("Assign Tasks Clicked");
    }

    @FXML
    public void reviewDeadlinesOnAction(ActionEvent actionEvent) {
        // Logic for reviewing deadlines
        System.out.println("Review Deadlines Clicked");
    }

    @FXML
    public void updateStatusOnAction(ActionEvent actionEvent) {
        // Logic for updating project status
        System.out.println("Update Project Status Clicked");
    }

    @FXML
    public void viewReportsOnAction(ActionEvent actionEvent) {
        // Logic for viewing project reports
        System.out.println("View Reports Clicked");
    }

    @FXML
    public void sendRemindersOnAction(ActionEvent actionEvent) {
        // Logic for sending reminders
        System.out.println("Send Reminders Clicked");
    }

    @FXML
    public void logoutOnAction(ActionEvent actionEvent) throws IOException {
        // Logic for logout (go to login screen or exit)
        System.out.println("Logout Clicked");
        switchToScene("/com/example/oopf/login.fxml", actionEvent);
    }

    // Method to switch scenes
    private void switchToScene(String fxmlFile, ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
}
