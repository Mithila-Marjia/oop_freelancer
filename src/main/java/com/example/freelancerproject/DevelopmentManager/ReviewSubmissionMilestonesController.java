package com.example.freelancerproject.DevelopmentManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;

class ReviewSubmissionMilestonesController {

    @FXML
    private TableColumn<?, ?> dateTableColumn;

    @FXML
    private TableColumn<?, ?> descriptionTableColumn;

    @FXML
    private TextArea descriptionTextArea;

    @FXML
    private ComboBox<?> fileNameComboBox;

    @FXML
    private TableColumn<?, ?> fileNameTableColumn;

    @FXML
    private TableView<?> milestoneTableView;

    @FXML
    private DatePicker submissionDateDatePicker;

    @FXML
    void reviewMilestoneButtonOnClick(ActionEvent event) {

    }

}
