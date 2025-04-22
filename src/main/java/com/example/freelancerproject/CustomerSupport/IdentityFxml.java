package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class IdentityFxml
{
    @javafx.fxml.FXML
    private TableColumn pricingTableColumn;
    @javafx.fxml.FXML
    private TableColumn nameTableColumn;
    @javafx.fxml.FXML
    private Label identityLabel;
    @javafx.fxml.FXML
    private TableColumn freelanceridTablaColumn;
    @javafx.fxml.FXML
    private TableView identityTableView;
    @javafx.fxml.FXML
    private ComboBox freelanceridcombobox;
    @javafx.fxml.FXML
    private Label freelanceridLabel;
    @javafx.fxml.FXML
    private Label freelancerdetailsLabel;
    @javafx.fxml.FXML
    private TextArea identitydocumenttTextArea;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {
        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("CustomerSupport/DashBoardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("CustomerSupport DashBoard");
        stage.show();
    }

    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) throws IOException {

    }
}