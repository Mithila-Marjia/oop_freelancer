package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class SalesTrackingController {

    @FXML
    private TableColumn<?, ?> dateColumn;

    @FXML
    private TableColumn<?, ?> priceColumn;

    @FXML
    private TableColumn<?, ?> productColumn;

    @FXML
    private TextField productNameTextField;

    @FXML
    private TableColumn<?, ?> quantityColumn;

    @FXML
    private TextField quantitySoldTextField;

    @FXML
    private TextField saleDateTextField;

    @FXML
    private TextField salePriceTextField;

    @FXML
    private TableView<?> salesTable;

    @FXML
    void addSaleAction(ActionEvent event) {

    }

    @FXML
    void generateReportAction(ActionEvent event) {

    }

    @FXML
    void logoutOnAction(ActionEvent event) {

    }

}
