package com.example.freelancerproject.Client;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientDashboardController {
    @FXML
    public void handleSwitch(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("developmentManagerDashboard.fxml"));
        Parent root = fxmlLoader.load();

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.setTitle("Development Manager Dashboard");
        stage.show();
    }
    @javafx.fxml.FXML
    private BorderPane dashboardBoarderPane;

    @javafx.fxml.FXML
    public void initialize() {
    }


    @FXML
    void assiignedFreelancerButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("assignedFreelancer.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void feedbackAndRatingsButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("feedbackAndRating.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void paymentProcessButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("paymentProcess.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void postProjectButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("postProjectView.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }
    }

    @FXML
    void reviewProjectMilestonesButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("projectMilestones.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void selectedFreelancerButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("selectFreelancer.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void viewFreelancerProfileButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewFreelancerProfiles.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

    @FXML
    void viewPostedProjectButtonOnClick(ActionEvent event) {
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("viewPostedProject.fxml"));
            dashboardBoarderPane.setCenter(fxmlLoader.load());
        }
        catch(Exception e){

        }

    }

}
