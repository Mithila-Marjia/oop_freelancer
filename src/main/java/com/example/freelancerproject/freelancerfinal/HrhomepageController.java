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
import java.time.LocalDate;
import java.util.ArrayList;

public class HrhomepageController {

    @FXML
    private TableView<Hrhomepage> datatable;

    @FXML
    private DatePicker datepicker;

    @FXML
    private ComboBox<String> degreecombobox;

    @FXML
    private TableColumn<Hrhomepage, String> degreetablecolum;

    @FXML
    private TextField errorshowtext;

    @FXML
    private RadioButton fulltimeradio;

    @FXML
    private TableColumn<Hrhomepage, String> joindatetablecolum;

    @FXML
    private TableColumn<Hrhomepage, String> nametablecolum;

    @FXML
    private TextField nametext;

    @FXML
    private RadioButton pertimeradio;

    @FXML
    private ComboBox<String> positioncombobox;

    @FXML
    private TableColumn<Hrhomepage, String> positiontablecolum;

    @FXML
    private TableColumn<Hrhomepage, String> salarytablecolum;

    @FXML
    private TextField salarytext;

    @FXML
    private TableColumn<Hrhomepage, String> typetablecolum;


    ArrayList<Hrhomepage> tableList;




    @FXML
    void initialize(){

        tableList = new ArrayList<Hrhomepage>();
        ToggleGroup tm = new ToggleGroup();


        pertimeradio.setToggleGroup(tm);
        fulltimeradio.setToggleGroup(tm);
        positioncombobox.getItems().addAll("CEO","BRANCH MANAGER","EMPLOYE","DATA ENTRY");
        degreecombobox.getItems().addAll("ssc","hsc","hons");

        datepicker.setValue(LocalDate.parse("2001-01-07"));




        nametablecolum.setCellValueFactory(new PropertyValueFactory<>("name"));
        typetablecolum.setCellValueFactory(new PropertyValueFactory<>("type"));
        positiontablecolum.setCellValueFactory(new PropertyValueFactory<>("position"));
        degreetablecolum.setCellValueFactory(new PropertyValueFactory<>("degree"));
        salarytablecolum.setCellValueFactory(new PropertyValueFactory<>("salary"));
        joindatetablecolum.setCellValueFactory(new PropertyValueFactory<>("date"));








    }




    @FXML
    void addonclick(ActionEvent event) {
        boolean digitFound = false;
        for(int i=0; i<nametext.getText().length();i++) {
            if (nametext.getText().charAt(i) >= '0' &&
                    nametext.getText().charAt(i) <= '9') {
                digitFound = true;
            }
        }

        if (digitFound || nametext.getText().isEmpty() ||
                salarytext.getText().isEmpty() ||
                datepicker.getValue().isAfter(LocalDate.now()) ||
                positioncombobox.getValue().isEmpty() ||
                degreecombobox.getValue().isEmpty()){

            errorshowtext.setText("fill up properly");
            Alert validationAlert = new Alert(Alert.AlertType.ERROR);
            validationAlert.setContentText("Fill up the form properly.");
            validationAlert.show();}

        else {
            String type ="";
            if (pertimeradio.isSelected()) type ="per time";
            else if (fulltimeradio.isSelected()) type ="full time";



            Hrhomepage st = new Hrhomepage(nametext.getText(),
                    type,
                    (String)positioncombobox.getValue(),
                    (String)degreecombobox.getValue(),
                    Integer.parseInt(salarytext.getText()),
                    datepicker.getValue());

            tableList.add(st);
            datatable.getItems().add(st);

            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("Data Added");
            successAlert.show();



        }

    }

    @FXML
    void onclicknext(ActionEvent event) {

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

}
