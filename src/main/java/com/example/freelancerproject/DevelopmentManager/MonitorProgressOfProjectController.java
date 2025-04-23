package com.example.freelancerproject.DevelopmentManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

class MonitorProgressOfProjectController {

    @FXML
    private TextField ProgressPercentageTextField;

    @FXML
    private DatePicker endDateDatePicker;

    @FXML
    private TableColumn<?, ?> endDateTableColumn;

    @FXML
    private TextField overallStatusTextField;

    @FXML
    private TableColumn<?, ?> percentageTableColumn;

    @FXML
    private TableView<?> progressTableView;

    @FXML
    private TextField projectTitleTextField;

    @FXML
    private DatePicker startDateDatePicker;

    @FXML
    private TableColumn<?, ?> startDateTableColumn;

    @FXML
    private TableColumn<?, ?> statusTableColumn;

    @FXML
    private TableColumn<?, ?> tittleTableColumn;

    @FXML
    void projectProgressButtonOnClick(ActionEvent event) {

    }

}
