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

public class HremployeattendanceController {

    @FXML
    private RadioButton absentradiobutton;

    @FXML
    private TableView attendancetable;

    @FXML
    private TableColumn<Hremployeattendance, String> attendancetablecolum;

    @FXML
    private DatePicker datepicker;

    @FXML
    private TableColumn<Hremployeattendance,String> datetablecolum;

    @FXML
    private TableColumn<Hremployeattendance, String> idtablecolum;

    @FXML
    private TextField idtext;

    @FXML
    private TableColumn<Hremployeattendance, String> nametablecolum;

    @FXML
    private TextField nametext;

    @FXML
    private RadioButton presentradiobutton;

    ArrayList<Hremployeattendance> dataList;





    @FXML
    void initialize(){

        dataList = new ArrayList<>();


        ToggleGroup tg = new ToggleGroup();
        presentradiobutton.setToggleGroup(tg);
        absentradiobutton.setToggleGroup(tg);

        datepicker.setValue(LocalDate.now());


        idtablecolum.setCellValueFactory(new PropertyValueFactory<Hremployeattendance,String>("id"));
        nametablecolum.setCellValueFactory(new PropertyValueFactory<Hremployeattendance,String>("name"));
        attendancetablecolum.setCellValueFactory(new PropertyValueFactory<Hremployeattendance,String>("attendance"));
        datetablecolum.setCellValueFactory(new PropertyValueFactory<Hremployeattendance,String>("date"));


    }

    @FXML
    void takeattendanceonclick(ActionEvent event) {

        boolean digitFound = false;
        for(int i=0; i<nametext.getText().length(); i++) {
            if (nametext.getText().charAt(i) >= '0' &&
                    nametext.getText().charAt(i) <= '9') {
                digitFound = true;
            }
        }

        if (digitFound || nametext.getText().isEmpty() ||
                idtext.getText().isEmpty() ||
                datepicker.getValue().isAfter(LocalDate.now()) ||
                datepicker.getValue().isBefore(LocalDate.now())) {
            idtext.setText("fill up properly");
            nametext.setText("fill up properly");

            Alert errorAlert = new Alert(Alert.AlertType.ERROR);
            errorAlert.setContentText("Not Valid.");
            errorAlert.show();
        }
        else{

            String attendance = "";
            if (presentradiobutton.isSelected()) attendance = "present";

            else if (absentradiobutton.isSelected()) attendance = "absent";


            Hremployeattendance at = new Hremployeattendance(Integer.parseInt(idtext.getText()),
                    nametext.getText(),
                    attendance,
                    datepicker.getValue());

            dataList.add(at);
            attendancetable.getItems().add(at);
            Alert successAlert = new Alert(Alert.AlertType.INFORMATION);
            successAlert.setContentText("Data Added");
            successAlert.show();

            idtext.clear();
            nametext.clear();
            presentradiobutton.setSelected(false);
            absentradiobutton.setSelected(false);
        }


    }

    public void backonclick(ActionEvent actionEvent) {

        try{

            FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("freelancerfinal/hrfirstpage.fxml"));

            Scene scene = new Scene(fxmlLoader.load());
            Stage Current = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();

            Current.setTitle("homepage");
            Current.setScene(scene);
            Current.show();
        }

        catch (IOException e) {

        }
    }
}



