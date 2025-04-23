package com.example.freelancerproject.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ViewPostedProjectController {

    @FXML
    private RadioButton acceptRadioButton;

    @FXML
    private TableColumn<?, ?> bidCountTableColumn;

    @FXML
    private TextField bidCountTextField;

    @FXML
    private TableColumn<?, ?> bidStatusTableColumn;

    @FXML
    private TableView<?> checkStatusTableView;

    @FXML
    private DatePicker dueDateDatePicker;

    @FXML
    private TableColumn<?, ?> dueDateTableColumn;

    @FXML
    private TextField postedProjectTitleTextField;

    @FXML
    private TableColumn<?, ?> projectTitleTableColumn;

    @FXML
    private RadioButton rejectRadioButton;

    @FXML
    void checkStatusButtonOnClick(ActionEvent event) {

    }

}

