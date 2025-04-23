package com.example.freelancerproject.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class PaymentProcessController {

    @FXML
    private TableColumn<?, ?> amountTableColumn;

    @FXML
    private TextField amountTextField;

    @FXML
    private TextField finalProjectNameTextField;

    @FXML
    private TableColumn<?, ?> idTableColumn;

    @FXML
    private TextField idTextField;

    @FXML
    private TableColumn<?, ?> nameTableColumn;

    @FXML
    private TextField payFreelancerTextField;

    @FXML
    private ComboBox<?> paymentMethodComboBox;

    @FXML
    private TableColumn<?, ?> paymentTableColumn;

    @FXML
    private TableView<?> paymentTableView;

    @FXML
    private TableColumn<?, ?> projectTableColumn;

    @FXML
    void submitPaymentButtonOnClick(ActionEvent event) {

    }

}
