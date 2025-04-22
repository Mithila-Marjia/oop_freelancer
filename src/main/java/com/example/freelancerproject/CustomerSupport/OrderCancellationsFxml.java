package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderCancellationsFxml
{
    @javafx.fxml.FXML
    private Label commentLable;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField senderidTextfield;
    @javafx.fxml.FXML
    private Label orderLable;
    @javafx.fxml.FXML
    private Label senderidLable;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;
    @javafx.fxml.FXML
    private Label cancellationLable;
    @javafx.fxml.FXML
    private TextField receveridTextField;
    @javafx.fxml.FXML
    private ComboBox reasonComboBox;
    @javafx.fxml.FXML
    private Label orderidLable;
    @javafx.fxml.FXML
    private Label receveridLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancelButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void issueButton(ActionEvent actionEvent) {
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
}