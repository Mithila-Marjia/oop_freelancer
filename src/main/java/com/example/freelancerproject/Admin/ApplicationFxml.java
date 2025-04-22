package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class ApplicationFxml
{
    @javafx.fxml.FXML
    private TableView freelancerTableView;
    @javafx.fxml.FXML
    private TableColumn statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox applicationComboBox;
    @javafx.fxml.FXML
    private TextArea applicationviewTextArea;
    @javafx.fxml.FXML
    private TableColumn senderidTableColumn;
    @javafx.fxml.FXML
    private Label reviewLabel;
    @javafx.fxml.FXML
    private TableColumn applicationTableColumn;
    @javafx.fxml.FXML
    private Label applicationDetailsLabel;
    @javafx.fxml.FXML
    private Label applicationidLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Admin/DashBoardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Admin DashBoard");
        stage.show();

    }
}