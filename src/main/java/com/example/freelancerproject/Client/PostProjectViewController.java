package com.example.freelancerproject.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PostProjectViewController {

    @FXML
    private TextField budgetTextField;

    @FXML
    private DatePicker deadlineDatePicker;

    @FXML
    private TextArea projectDescriptionTextArea;

    @FXML
    private TextField projectTitleTextField;

    @FXML
    private Label projectVarificationLabel;

    @FXML
    private TextField skillTextField;

    @FXML
    void postProjectSubmitButtonOnClick(ActionEvent event) {

    }

}
