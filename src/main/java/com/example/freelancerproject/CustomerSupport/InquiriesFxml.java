package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class InquiriesFxml
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableView generalTableView;
    @javafx.fxml.FXML
    private TableColumn inquiryidTableColumn;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private TableColumn subjectTableColumn;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private Label subjectLabel;
    @javafx.fxml.FXML
    private Label descriptionLabel;
    @javafx.fxml.FXML
    private Label inquirieslLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("CustomerSupport Dashboard");
        stage.show();
    }
}