package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class MonitorFxml
{
    @javafx.fxml.FXML
    private Label contenIDtLable;
    @javafx.fxml.FXML
    private TableColumn<Monitor,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView <Monitor>monitorcontentTableView;
    @javafx.fxml.FXML
    private TableColumn<Monitor,String>contentnameTableColumn;
    @javafx.fxml.FXML
    private ComboBox<Integer> contentidcombobox;
    @javafx.fxml.FXML
    private TableColumn <Monitor,Integer>contentidTableColumn;
    @javafx.fxml.FXML
    private Label contentLable;
    ArrayList<Monitor> monitors = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        contentidcombobox.getItems().addAll();

        contentidTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        contentnameTableColumn.setCellValueFactory(new PropertyValueFactory<Monitor,String>("name"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<Monitor,String>("status"));



    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CustomerSupport/DashBoardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("CustomerSupport DashBoard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void ignoreButton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void saveButton(ActionEvent actionEvent) {


    }
}