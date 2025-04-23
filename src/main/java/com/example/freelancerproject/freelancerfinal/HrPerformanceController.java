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
import java.util.Arrays;
import java.util.Random;

public class HrPerformanceController {

    @FXML
    private TextField bestratingtext;

    @FXML
    private TextField errortext;

    @FXML
    private CheckBox femalecheckbox;

    @FXML
    private TableColumn<HrPerformance, String> gendertablecolum;

    @FXML
    private TableColumn<HrPerformance, String> idtablecolum;

    @FXML
    private TextField idtext;

    @FXML
    private CheckBox malecheckbox;

    @FXML
    private TableColumn<HrPerformance, String> nametablecolum;

    @FXML
    private TextField nametext;

    @FXML
    private TableView<HrPerformance> performancetable;

    @FXML
    private ComboBox<String> ratingcombobox;

    @FXML
    private TableColumn<HrPerformance, String> ratingtablecolum;

    @FXML
    private TableColumn<HrPerformance, String> salarytablecolum;

    @FXML
    private TextField salarytext;

    @FXML
    private TextField showbestsalarytext;

    ArrayList<HrPerformance> performances;


    @FXML
    void initialize() {
        performances = new ArrayList<>();
        ratingcombobox.getItems().addAll("1", "2", "3", "4", "5");


        Random r = new Random();
        String generatedId = String.format("%03d", r.nextInt(1000));
        idtext.setText(generatedId);
        idtext.setEditable(false);
        idtext.setStyle("-fx-background-color:pink;");


        nametablecolum.setCellValueFactory(new PropertyValueFactory<HrPerformance, String>("name"));
        gendertablecolum.setCellValueFactory(new PropertyValueFactory<HrPerformance, String>("gender"));
        idtablecolum.setCellValueFactory(new PropertyValueFactory<HrPerformance, String>("id"));
        ratingtablecolum.setCellValueFactory(new PropertyValueFactory<HrPerformance, String>("rating"));
        salarytablecolum.setCellValueFactory(new PropertyValueFactory<HrPerformance, String>("salary"));


    }


    @FXML
    void addonclick(ActionEvent event) {

        boolean digitFound = false;
        for (int i = 0; i < nametext.getText().length(); i++) {
            if (nametext.getText().charAt(i) >= '0' &&
                    nametext.getText().charAt(i) <= '9') {
                digitFound = true;
            }
        }

        if (digitFound || nametext.getText().isEmpty()) {
            errortext.setText("Fill up the form properly.");
            Alert validationAlert = new Alert(Alert.AlertType.ERROR);
            validationAlert.setContentText("Fill up the form properly.");
            validationAlert.show();
        } else {
            ArrayList<String> genderset = new ArrayList<String>();

            if (malecheckbox.isSelected() && femalecheckbox.isSelected()) {
                genderset.add("Trans");
            } else if (malecheckbox.isSelected()) {
                genderset.add("male");

            } else if (femalecheckbox.isSelected()) {
                genderset.add("female");

            }

            HrPerformance hp = new HrPerformance(nametext.getText(),
                    Arrays.toString(genderset.toArray()),
                    Integer.parseInt(idtext.getText()),
                    Integer.parseInt(ratingcombobox.getValue()),
                    Integer.parseInt(salarytext.getText()));

            performances.add(hp);
            performancetable.getItems().add(hp);

            Random r = new Random();
            String generatedId = String.format("%03d", r.nextInt(1000));
            idtext.setText(generatedId);
            idtext.setEditable(false);
            idtext.setStyle("-fx-background-color:gray;");


            nametext.clear();
            salarytext.clear();
            ratingcombobox.getValue();
            femalecheckbox.setSelected(false);
            malecheckbox.setSelected(false);


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
    void bestsalaryonclick(ActionEvent event) {


        ArrayList<Integer> SList = new ArrayList<>();
        for (HrPerformance x : performances) {
            SList.add(x.getSalary());
        }

        int max = SList.get(0);
        for (int i = 1; i < SList.size(); i++) {
            if (max < SList.get(i)) {
                max = SList.get(i);
            }
        }

        HrPerformance best = null;
        for (HrPerformance x : performances) {
            if (x.getSalary() == max) {
                best = x;
            }


        }

        showbestsalarytext.setText(best.toString());

    }


        @FXML
        void bestratingonclick (ActionEvent event){

            ArrayList<Integer> List = new ArrayList<>();
            for (HrPerformance x : performances) {
                List.add(x.getRating());
            }

            int maximum = List.get(0);
            for (int i = 1; i < List.size(); i++) {
                if (maximum < List.get(i)) {
                    maximum = List.get(i);
                }
            }

            HrPerformance most = null;
            for (HrPerformance x : performances) {
                if (x.getRating() == maximum) {
                    most = x;
                }
            }

            bestratingtext.setText(most.toString());

        }


    }



