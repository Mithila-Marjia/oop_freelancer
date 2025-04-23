package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class CreateMilestoneController {

    @FXML
    private TextArea descArea;

    @FXML
    private DatePicker dueDatePicker;

    @FXML
    private AnchorPane milestonePane;

    @FXML
    private MenuButton priorityMenu;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField titleField;

    @FXML
    void addMilestoneAction(ActionEvent event) {

    }

    @FXML
    void setHighPriority(ActionEvent event) {

    }

    @FXML
    void setLowPriority(ActionEvent event) {

    }

    @FXML
    void setMediumPriority(ActionEvent event) {

    }

}
