package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import java.io.IOException;

public class AgreementController {

    @FXML
    void finalizeOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/FinalizeAgreement.fxml", event);
    }

    @FXML
    void logoutOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/login.fxml", event);
    }

    @FXML
    void negotiateOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/NegotiateAgreement.fxml", event);
    }

    @FXML
    void notifyOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/NotifyClient.fxml", event);
    }

    @FXML
    void scheduleOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ScheduleMeeting.fxml", event);
    }

    @FXML
    void viewAgreementsOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ViewAgreements.fxml", event);
    }

    @FXML
    void viewClientsOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ViewClients.fxml", event);
    }

    @FXML
    void viewFreelancersOnAction(ActionEvent event) throws IOException {
        SceneSwitcher.switchTo("/com/example/oopf/ViewFreelancers.fxml", event);
    }
}
