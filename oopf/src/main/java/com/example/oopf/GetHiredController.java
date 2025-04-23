package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class GetHiredController {

    @FXML
    private AnchorPane HirePane;

    @FXML
    private TextField budgetField;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private ComboBox<?> freelancerComboBox;

    @FXML
    private Label hireStatusLabel;

    @FXML
    private TextField projectTitleField;

    @FXML
    void handleHireAction(ActionEvent event) {

    }

}
