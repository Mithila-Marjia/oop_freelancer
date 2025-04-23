package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class FreelancerDashboardController {

    @FXML
    void CFOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ClientFeedback.fxml", actionEvent);
    }

    @FXML
    void CMOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/CreateMilestone.fxml", actionEvent);
    }

    @FXML
    void GHOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/GetHired.fxml", actionEvent);
    }

    @FXML
    void GPOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/Payment.fxml", actionEvent);
    }

    @FXML
    void RAQOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ReviewsAndQuestions.fxml", actionEvent);
    }

    @FXML
    void SPOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/SendProposals.fxml", actionEvent);
    }

    @FXML
    void logoutOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/login.fxml", actionEvent);
    }

    @FXML
    void regOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/registration.fxml", actionEvent);
    }

    @FXML
    void searchOnAction(ActionEvent actionEvent) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/SearchJobs.fxml", actionEvent);
    }
}
