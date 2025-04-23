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

public class M_salaryController {

    @FXML
    private TextField companynametext;

    @FXML
    private TableColumn<M_salary, String> companytablecolum;

    @FXML
    private RadioButton newradiobutton;

    @FXML
    private TableColumn<M_salary, String> oldnewtablecolum;

    @FXML
    private RadioButton oldradiobutton;

    @FXML
    private ComboBox<String> positioncombobox;

    @FXML
    private TableColumn<M_salary, String> positiontablecolum;

    @FXML
    private TableView<M_salary> salarytable;

    @FXML
    private TableColumn<M_salary, String> salarytablecolum;

    @FXML
    private TextField salarytext;

    @FXML
    private TextField showavarageonclick;

    @FXML
    private TextField showminimumtext;




    ArrayList<M_salary>salaries;


    @FXML
    void initialize(){

        salaries = new ArrayList<>();

        ToggleGroup tg = new ToggleGroup();
        oldradiobutton.setToggleGroup(tg);
        newradiobutton.setToggleGroup(tg);


        positioncombobox.getItems().addAll("manager","emplyee","ceo");


        companytablecolum.setCellValueFactory(new PropertyValueFactory<M_salary,String>("name"));
        positiontablecolum.setCellValueFactory(new PropertyValueFactory<M_salary,String>("position"));
        oldnewtablecolum.setCellValueFactory(new PropertyValueFactory<M_salary,String>("oldnew"));
        salarytablecolum.setCellValueFactory(new PropertyValueFactory<M_salary,String>("salary"));





    }

    @FXML
    void addonclick(ActionEvent event) {

        M_salary ms = new M_salary(companynametext.getText(),
                (String)positioncombobox.getValue(),
                salarytext.getText());


        salaries.add(ms);
        salarytable.getItems().add(ms);

    }

    @FXML
    void avarageonclick(ActionEvent event) {

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
