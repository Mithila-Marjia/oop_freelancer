package com.example.oopf;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginController {

    @FXML
    private ComboBox<String> typeComboBox;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private TextField useridTextField;
    @FXML
    private Label showLabel;

    @FXML
    public void initialize() {
        // Only Freelancer and Sales Manager options
        typeComboBox.getItems().setAll("Freelancer", "Sales Manager");
    }

    @FXML
    public void loginButtonOnAction(ActionEvent actionEvent) throws IOException {
        String userId = useridTextField.getText().trim();
        String password = passwordPasswordField.getText().trim();
        String userType = typeComboBox.getValue();

        // Check if all fields are filled
        if (userId.isEmpty() || password.isEmpty() || userType == null) {
            System.out.println("⚠ Please fill in all fields.");
            showLabel.setText("Please fill in all fields.");
            return;
        }

        // Dummy login logic — replace with real DB/auth system later
        boolean isAuthenticated = false;

        // Handle the authentication for only Freelancer and Sales Manager
        switch (userType) {
            case "Freelancer":
                if (userId.equals("kab") && password.equals("1234")) {
                    switchToScene("/com/example/oopf/FreelancerDashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            case "Sales Manager":
                if (userId.equals("kab12") && password.equals("1234")) {
                    switchToScene("/com/example/oopf/SalesManagerDashboard.fxml", actionEvent);
                    isAuthenticated = true;
                }
                break;
            default:
                // In case of an invalid user type
                showLabel.setText("Invalid user type selected.");
                return;
        }

        // If not authenticated, show an error message
        if (!isAuthenticated) {
            showLabel.setText("Incorrect username or password");
        }
    }

    // Method to switch scenes
    private void switchToScene(String fxmlFile, ActionEvent actionEvent) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
        Scene scene = new Scene(loader.load());
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    // Optional: Implement or remove this method based on your requirement
    @FXML
    public void createaccountOnAction(ActionEvent actionEvent) {
        // Logic for creating a new account can be implemented here if necessary.
    }
}
