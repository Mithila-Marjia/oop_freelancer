package com.example.freelancerproject.freelancerfinal;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.ArrayList;

public class HrLoadprojectController {

    @FXML
    private TableColumn<Project, String> projectidtablecolum;

    @FXML
    private TableColumn<Project, String> projectlaveltablecolum;

    @FXML
    private TableView<Project> projecttable;

    @FXML
    private TableColumn<Project,String> projecttitletablecolum;

    @FXML
    private TableColumn<Project,String> projecttypetablecolum;


    ArrayList<Project> projects;




    @FXML
    void initialize(){

        projectidtablecolum.setCellValueFactory(new PropertyValueFactory<Project,String>("id"));
        projecttitletablecolum.setCellValueFactory(new PropertyValueFactory<Project,String>("title"));
        projectlaveltablecolum.setCellValueFactory(new PropertyValueFactory<Project,String>("level"));
        projecttypetablecolum.setCellValueFactory(new PropertyValueFactory<Project,String>("type"));
    }

    @FXML
    void loadonclick(ActionEvent event) {




    }

}
