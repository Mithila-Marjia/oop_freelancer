package com.example.freelancerproject.freelancerfinal;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class M_MarketdemandController {

    @FXML
    private TextField MostDemandingtext;

    @FXML
    private TableView<M_Marketdemand> datatable;

    @FXML
    private TextField demandlaveltext;

    @FXML
    private TextField errortext;

    @FXML
    private ComboBox<String> languagecombobox;

    @FXML
    private TableColumn<M_Marketdemand, String> languagetablecolum;

    @FXML
    private TableColumn<M_Marketdemand, String> leveltablecolum;

    @FXML
    private TableColumn<M_Marketdemand, String> platformtablecolum;

    @FXML
    private TextField platformtext;


    ArrayList<M_Marketdemand> newList;


    @FXML
    void initialize() {

        newList = new ArrayList<>();
        languagecombobox.getItems().addAll("python", "java", "c");


        languagetablecolum.setCellValueFactory(new PropertyValueFactory<M_Marketdemand, String>("language"));
        platformtablecolum.setCellValueFactory(new PropertyValueFactory<M_Marketdemand, String>("platform"));
        leveltablecolum.setCellValueFactory(new PropertyValueFactory<M_Marketdemand, String>("demand"));

    }

    @FXML
    void MostDemandingonclick(ActionEvent event) {


        ArrayList<Integer> SList = new ArrayList<>();
        for (M_Marketdemand x : newList) {
            SList.add(x.getDemand());
        }

        int max = SList.get(0);
        for (int i = 1; i < SList.size(); i++) {
            if (max < SList.get(i)) {
                max = SList.get(i);
            }
        }

        M_Marketdemand best = null;
        for (M_Marketdemand x : newList) {
            if (x.getDemand() == max) {
                best = x;
            }

        }
            MostDemandingtext.setText(best.toString());


        }

        @FXML

        void addonclick (ActionEvent event){

            M_Marketdemand md = new M_Marketdemand((String) languagecombobox.getValue(),
                    platformtext.getText(),
                    Integer.parseInt(demandlaveltext.getText())

            );

            newList.add(md);
            datatable.getItems().add(md);

        }

        @FXML
        void backonclick (ActionEvent event){


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
