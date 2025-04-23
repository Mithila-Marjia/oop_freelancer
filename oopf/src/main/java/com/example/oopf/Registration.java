package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Registration {

    @FXML
    private Label outputLabel;

    @FXML
    void regOnAction(ActionEvent event) {
        outputLabel.setText("Register Successful!");
    }
}
