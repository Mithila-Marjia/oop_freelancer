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

public class HrStakeholderManagementController {

    @FXML
    private TableColumn<HrStakeholderManagement,String> amounttablecolum;

    @FXML
    private TextField amounttext;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TableColumn<HrStakeholderManagement,String> datetablecolum;

    @FXML
    private TextField errortext;

    @FXML
    private TableColumn<HrStakeholderManagement,String> idtablecolum;

    @FXML
    private TextField idtext;

    @FXML
    private TableColumn<HrStakeholderManagement,String> nametablecolum;

    @FXML
    private TextField nametext;

    @FXML
    private TextField showavaragetext;

    @FXML
    private TableView<HrStakeholderManagement> tableview;



    ArrayList<HrStakeholderManagement>stakehoulder;



    @FXML
    void initialize(){

        stakehoulder = new ArrayList<>();

        datepicker.setValue(LocalDate.now());

        nametablecolum.setCellValueFactory(new PropertyValueFactory<HrStakeholderManagement, String>("name"));
        idtablecolum.setCellValueFactory(new PropertyValueFactory<HrStakeholderManagement, String>("id"));
        amounttablecolum.setCellValueFactory(new PropertyValueFactory<HrStakeholderManagement, String>("amount"));
        datetablecolum.setCellValueFactory(new PropertyValueFactory<HrStakeholderManagement, String>("date"));




    }

    @FXML
    void addonclick(ActionEvent event) {


        boolean digitFound = false;
        for(int i=0; i<nametext.getText().length();i++){
            if(nametext.getText().charAt(i)>='0' &&
                    nametext.getText().charAt(i)<='9'){
                digitFound = true;
            }
        }

        if(digitFound||nametext.getText().isEmpty() ||
                idtext.getText().isEmpty()||
                amounttext.getText().isEmpty()) {
            errortext.setText("Fill up the form properly");
            nametext.setText("please");
            idtext.setText("please");
            Alert validationAlert = new Alert(Alert.AlertType.ERROR);
            validationAlert.setContentText("Fill up the form properly.");
            validationAlert.show();
        }


        else{
            boolean sameIdFound = false;
            for(HrStakeholderManagement x : stakehoulder){
                if(x.getId()==Integer.parseInt(idtext.getText())){
                    sameIdFound = true;
                }
            }

            if(sameIdFound){
                errortext.setText("Same ID Found. Invalid.");
                Alert sameIDAlert = new Alert(Alert.AlertType.ERROR);
                sameIDAlert.setContentText("Same ID Found. Invalid.");
                sameIDAlert.show();
            }
            else {

                HrStakeholderManagement st = new HrStakeholderManagement(nametext.getText(),
                        Integer.parseInt(idtext.getText()),
                        Integer.parseInt(amounttext.getText()),
                        datepicker.getValue());

                stakehoulder.add(st);
                tableview.getItems().add(st);
                errortext.setText("Student Added Successfully.");
                Alert AddAlert = new Alert(Alert.AlertType.INFORMATION);
                AddAlert.setContentText(" Added Successfully.");
                AddAlert.show();


                idtext.clear();
                nametext.clear();
                amounttext.clear();



            }


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
    void totalinvestmentonclick(ActionEvent event) {

        int Sum = 0;
        for(HrStakeholderManagement x : stakehoulder){
            Sum = Sum + x.getSalary();
        }

        showavaragetext.setText(String.valueOf(Sum));




    }

}
