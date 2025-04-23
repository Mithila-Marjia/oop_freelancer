package com.example.freelancerproject.freelancerfinal;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HRFirstpageController {

    @FXML
    void attendanceonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hremployeattendance.fxml"));

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

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/Hrhomepage.fxml"));
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
    void learningonclick(ActionEvent event) {


        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrlearningDevelopment.fxml"));

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
    void performanceonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrperformance.fxml"));
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
    void projectonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrnewproject.fxml"));

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
    void signoutonclick(ActionEvent event) {

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
    void stakehoulderonclick(ActionEvent event) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrStakeholderManagement.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage Current = (Stage)((Node)event.getSource()).getScene().getWindow();

            Current.setTitle("homepage");
            Current.setScene(scene);
            Current.show();
        }

        catch (IOException e) {

        }

    }

}
