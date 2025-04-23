package com.example.freelancerproject.DevelopmentManager;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class TrackBudgetOfProjectController {

    @FXML
    private TableColumn<?, ?> budjetTableColumn;

    @FXML
    private TableView<?> budjetTableView;

    @FXML
    private TextField budjetTextField;

    @FXML
    private TableColumn<?, ?> expensesTableColumn;

    @FXML
    private TextField expensesTextField;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TextField projectNameTextField;

    @FXML
    private TextField remainingBudgetTextField;

    @FXML
    private TableColumn<?, ?> remainingBudjetTableColumn;

    @FXML
    void viewBudjetButtonOnClick(ActionEvent event) {

    }

}
