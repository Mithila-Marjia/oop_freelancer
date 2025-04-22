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

public class ChangeFreelancerFxml
{
    @javafx.fxml.FXML
    private Label addnewfreelencerLable;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker memberSinceDatePicker;
    @javafx.fxml.FXML
    private Label countryLable;
    @javafx.fxml.FXML
    private TextArea skillsTextArea;
    @javafx.fxml.FXML
    private Label nameLable;
    @javafx.fxml.FXML
    private Label emailLable;
    @javafx.fxml.FXML
    private Label rateLable;
    @javafx.fxml.FXML
    private ComboBox statusComboBox;
    @javafx.fxml.FXML
    private ComboBox countryComboBox;
    @javafx.fxml.FXML
    private Label statusLable;
    @javafx.fxml.FXML
    private TextField rateTextField;
    @javafx.fxml.FXML
    private Label skillsLable;
    @javafx.fxml.FXML
    private Label dateLable;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void cancleButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveButten(ActionEvent actionEvent) {
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