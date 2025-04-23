package com.example.freelancerproject.freelancerfinal;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class HrNewprojectController {

    @FXML
    private ComboBox<String> levelcombobox;

    @FXML
    private TextField projectidtext;

    @FXML
    private TextField projecttitletext;

    @FXML
    private ComboBox<String> typecombobox;


    ArrayList<Project>projects;



    @FXML
    void initialize(){

        projects = new ArrayList<Project>();
        typecombobox.getItems().addAll("a","d","c","b");
        levelcombobox.getItems().addAll("hard","easy","extra hard");

    }

    @FXML
    void accumulateonclick(ActionEvent event) {

        try{

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrloadproject.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage next = new Stage();

            next.setTitle("Hello!");
            next.setScene(scene);
            next.show();
        }

        catch (IOException e) {

        }




    }
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
    void savetoonclick(ActionEvent event) {


        Project hp = new Project(projectidtext.getText(),
                projecttitletext.getText(),
                levelcombobox.getValue(),
                typecombobox.getValue());
        projects.add(hp);






    }

}
