package com.example.freelancerproject.freelancerfinal;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class HrLearningDevelopmentController {

    @FXML
    private TextArea learningtext;

    @FXML
    void backonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrfirstpage.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage Current = (Stage)((Node)event.getSource()).getScene().getWindow();

            Current.setTitle("homepage");
            Current.setScene(scene);
            Current.show();
        }

        catch (IOException e) {

        }

    }

    @FXML
    void homepageonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrfirstpage.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage Current = (Stage)((Node)event.getSource()).getScene().getWindow();

            Current.setTitle("homepage");
            Current.setScene(scene);
            Current.show();
        }

        catch (IOException e) {

        }

    }

    @FXML
    void htmlonclick(ActionEvent event) {
        learningtext.setText("html Basics:\n1. Variables\n2. Loops\n3. Functions");

        Alert validationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        validationAlert.setContentText("ARE YOU SURE");
        validationAlert.show();

    }

    @FXML
    void phponclick(ActionEvent event) {
        learningtext.setText("Php Basics:\n1. Variables\n2. Loops\n3. Functions");

        Alert validationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        validationAlert.setContentText("ARE YOU SURE");
        validationAlert.show();

    }

    @FXML
    void pythononclick(ActionEvent event) {

        learningtext.setText("Python Basics:\n1. Variables\n2. Loops\n3. Functions");

        Alert validationAlert = new Alert(Alert.AlertType.CONFIRMATION);
        validationAlert.setContentText("ARE YOU SURE");
        validationAlert.show();

    }

}
