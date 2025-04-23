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
import java.util.Arrays;

public class M_campaignController {

    @FXML
    private DatePicker campaigndatepicker;

    @FXML
    private TextField campaignnametext;

    @FXML
    private TableView<M_campaign> campaigntable;

    @FXML
    private TableColumn<M_campaign, String> campaigntablecolum;

    @FXML
    private TableColumn<M_campaign, String> datetablecolum;

    @FXML
    private CheckBox daycheckbox;

    @FXML
    private TextField errortext;

    @FXML
    private ComboBox<String> locationcombobox;

    @FXML
    private TableColumn<M_campaign, String> locationtablecolum;

    @FXML
    private CheckBox nightcheckbox;

    @FXML
    private TableColumn<M_campaign, String> shifttablecolum;

    ArrayList<M_campaign> newlist;

    @FXML
    void initialize() {


        newlist = new ArrayList<>();
        locationcombobox.getItems().addAll("narsingdi", "dhaka", "narayangonj", "hasnabad");
        campaigndatepicker.setValue(LocalDate.now());

        campaigntablecolum.setCellValueFactory(new PropertyValueFactory<M_campaign, String>("name"));
        shifttablecolum.setCellValueFactory(new PropertyValueFactory<M_campaign, String>("shift"));
        locationtablecolum.setCellValueFactory(new PropertyValueFactory<M_campaign, String>("location"));
        datetablecolum.setCellValueFactory(new PropertyValueFactory<M_campaign, String>("date"));


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

    @FXML
    void createcampaignonclick(ActionEvent event) {

        ArrayList<String> Set = new ArrayList<String>();
        if (daycheckbox.isSelected() && nightcheckbox.isSelected()) {
            Set.add("day");
            Set.add("night");
        } else if (daycheckbox.isSelected()) {
            Set.add("day");
        } else if (nightcheckbox.isSelected()) {
            Set.add("night");
        }

        M_campaign mc = new M_campaign(campaignnametext.getText(),
                Arrays.toString(Set.toArray()),
                (String)locationcombobox.getValue(),
                campaigndatepicker.getValue()
                );

        newlist.add(mc);
        campaigntable.getItems().add(mc);




    }
}
