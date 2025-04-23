package com.example.freelancerproject.DevelopmentManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class GeneratePerformanceReportsController {

    @FXML
    private DatePicker endDateDatePicker;

    @FXML
    private TableColumn<?, ?> endDateTableColumn;

    @FXML
    private TableView<?> reportTableview;

    @FXML
    private ComboBox<?> reportTypeComboBox;

    @FXML
    private TableColumn<?, ?> reportTypeTableColumn;

    @FXML
    private DatePicker startDateDatePicker;

    @FXML
    private TableColumn<?, ?> startDateTableColumn;

    @FXML
    void generateReportButtonOnclick(ActionEvent event) {

    }

}
