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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class LivechatFxml
{
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private Label liveLable;
    @javafx.fxml.FXML
    private ComboBox messageidcombobox;
    @javafx.fxml.FXML
    private TextField senderidTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private AnchorPane messageidCombbobox;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("CustomerSupport Dashboard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException {


    }
}