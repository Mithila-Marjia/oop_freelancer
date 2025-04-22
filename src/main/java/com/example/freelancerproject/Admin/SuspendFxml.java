package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SuspendFxml
{
    @javafx.fxml.FXML
    private TextField suspendidTextField;
    @javafx.fxml.FXML
    private Label suspendedidLable;
    @javafx.fxml.FXML
    private Label reasonLable;
    @javafx.fxml.FXML
    private Label suspendidLable;
    @javafx.fxml.FXML
    private TextField suspendedidTextFiels;
    @javafx.fxml.FXML
    private Label suspendLabel;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void suspendButton(ActionEvent actionEvent) {
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