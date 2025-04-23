package com.example.freelancerproject.DevelopmentManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ApproveOrRejectMilestonesController {

    @FXML
    private TextField budgeTextField;

    @FXML
    private TableColumn<?, ?> budgetTableColumn;

    @FXML
    private RadioButton highRadioButton;

    @FXML
    private RadioButton lowRadioButton;

    @FXML
    private TableColumn<?, ?> marketDemandTableColumn;

    @FXML
    private RadioButton mediumRadioButton;

    @FXML
    private ComboBox<?> milestoneComboBox;

    @FXML
    private TableColumn<?, ?> milestoneTableColumn;

    @FXML
    private TableView<?> milestoneTableview;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TextField projectNameTextField;

    @FXML
    private TableColumn<?, ?> timeLineTableColumn;

    @FXML
    private DatePicker timeLinedatePicker;

    @FXML
    private Label viewVerifyMilestoneLabel;

    @FXML
    void submitMilestoneButtonOnClick(ActionEvent event) {

    }

    @FXML
    void verifyMilestoneButtonOnClick(ActionEvent event) {

    }

}
