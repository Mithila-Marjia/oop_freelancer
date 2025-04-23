package com.example.freelancerproject.freelancerfinal;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class M_advertisementController {

    @FXML
    private Button backonclick;

    @FXML
    private TextField errortext;

    @FXML
    private TableView<M_advertisement> eventtable;

    @FXML
    private TableColumn<M_advertisement,String> eventtablecolum;

    @FXML
    private ComboBox<String> filerbypublishedoncombobox;

    @FXML
    private RadioButton offlineradiobutton;

    @FXML
    private RadioButton onlineradiobutton;

    @FXML
    private ComboBox<String> publishedoncombobox;

    @FXML
    private TableColumn<M_advertisement,String> publishedontablecolum;

    @FXML
    private TableColumn<M_advertisement,String> watchedbytablecolum;

    @FXML
    private TextField watchedbytext;



    ArrayList<M_advertisement>advertisements;


    @FXML
    void initialize(){
        ToggleGroup to =new ToggleGroup();
        onlineradiobutton.setToggleGroup(to);
        offlineradiobutton.setToggleGroup(to);

        publishedoncombobox.getItems().addAll("youtube","facebook","paper","physical");
        filerbypublishedoncombobox.getItems().addAll("youtube","facebook","paper","physical");



        watchedbytablecolum.setCellValueFactory(new PropertyValueFactory<>("watched"));
        eventtablecolum.setCellValueFactory(new PropertyValueFactory<>("event"));
        publishedontablecolum.setCellValueFactory(new PropertyValueFactory<>("publish"));


    }




    @FXML
    void addonclick(ActionEvent event) {

        String nevent = "";

        if (watchedbytext.getText().isEmpty() || publishedoncombobox.getValue() == null) {
            errortext.setText("Fill up properly");
        } else {

            if (onlineradiobutton.isSelected()) nevent = "online";
            else if (offlineradiobutton.isSelected()) nevent = "offline";  // fixed typo

            M_advertisement st = new M_advertisement(
                    watchedbytext.getText(),
                    nevent,
                    publishedoncombobox.getValue()
            );

            advertisements.add(st);
            eventtable.getItems().add(st);

            errortext.setText("Added Successfully");
        }
    }





    @FXML
    void filteronclick(ActionEvent event) {

    }


    @FXML
    void backonclick(ActionEvent event) {


        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/M_firstpage.fxml"));

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
