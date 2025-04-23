package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class PaymentController {

    @FXML
    private TextField amountField;

    @FXML
    private MenuItem bankItem;

    @FXML
    private MenuItem cashItem;

    @FXML
    private Label confirmationLabel;

    @FXML
    private MenuButton methodMenu;

    @FXML
    private MenuItem mobileItem;

    @FXML
    private TextField payerNameField;

    @FXML
    private DatePicker paymentDatePicker;

    @FXML
    private AnchorPane paymentPane;

    @FXML
    void confirmPaymentAction(ActionEvent event) {

    }

}
