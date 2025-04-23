package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class SalesManagerDashboardController {

    @FXML
    void AgreOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/Agreement.fxml", actionEvent);
    }

    @FXML
    void CFOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/SalesReport.fxml", actionEvent);
    }

    @FXML
    void EngOnAction(ActionEvent actionEvent) throws IOException {
        // Ensure you specify the correct path to the FXML file for this action
        SceneSwitcher.switchTo("/com/example/oopf/SalesEngagement.fxml", actionEvent); // Replace with the correct FXML path
    }

    @FXML
    void LTColabOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/LongTermCollaboration.fxml", actionEvent);
    }

    @FXML
    void ProjectMOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ProjectMonitoring.fxml", actionEvent);
    }

    @FXML
    void PushOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/PushOffersAndRelationships.fxml", actionEvent);
    }

    @FXML
    void TrackOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/SalesData.fxml", actionEvent);
    }

    @FXML
    void logoutOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/login.fxml", actionEvent);
    }

    @FXML
    void regOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/registration.fxml", actionEvent);
    }
}
