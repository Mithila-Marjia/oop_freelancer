package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SendProposalsController {

    @FXML
    private AnchorPane ProposalFormPane;

    @FXML
    private TextField budgetField;

    @FXML
    private DatePicker deadlinePicker;

    @FXML
    private TextArea descriptionArea;

    @FXML
    private Label statusLabel;

    @FXML
    private TextField titleField;

    @FXML
    void handleSubmitProposal(ActionEvent event) {

    }

}
