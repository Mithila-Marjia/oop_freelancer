package com.example.freelancerproject.Client;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class FeedbackAndRatingsController {

    @FXML
    private TextArea commentTextArea;

    @FXML
    private TextField fNameTextField;

    @FXML
    private TextField projectNameTextField;

    @FXML
    private ComboBox<?> ratingComboBox;

    @FXML
    private Label viewFeedbackMessageLabel;

    @FXML
    void submitFeedbackButtonOnClick(ActionEvent event) {

    }

}
