package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ComplainFxml
{
    @javafx.fxml.FXML
    private TableColumn<Complain,Integer>senderidTableColumn;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private TextArea resolutionTextArea;
    @javafx.fxml.FXML
    private TableColumn<Complain,Integer> complainidTableColumn;
    @javafx.fxml.FXML
    private Label manageLabel;
    @javafx.fxml.FXML
    private TableView<Complain> disputeTableView;
    @javafx.fxml.FXML
    private TableColumn<Complain,String> descriptionTableColumn;
    @javafx.fxml.FXML
    private Label detailsLable;
    @javafx.fxml.FXML
    private Label statusLabel;
    ArrayList<Complain> complains = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<Complain,String> applicationidTableColumn;


    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Open", "Closed");

        complainidTableColumn.setCellValueFactory(new PropertyValueFactory<>("complainid"));
        senderidTableColumn.setCellValueFactory(new PropertyValueFactory<>("senderid"));
        descriptionTableColumn.setCellValueFactory(new PropertyValueFactory<Complain,String>("description"));

        complains.add(new Complain(1, 201, "Freelancer did not deliver the work on time."));
        complains.add(new Complain(2, 202, "Unclear payment terms in the contract."));
        complains.add(new Complain(3, 203, "Miscommunication about project scope."));
        complains.add(new Complain(4, 204, "Client is not responding after partial delivery."));
        complains.add(new Complain(5, 205, "Repeated delays in project milestones."));

        statusComboBox.getItems().add("Accept");
        statusComboBox.getItems().add("Reject");
        statusComboBox.getItems().add("Pending");

        disputeTableView.getItems().clear();
        disputeTableView.getItems().addAll(complains) ;
    }

    @javafx.fxml.FXML
    public void resolvedButton(ActionEvent actionEvent) {

//        String resolution = resolutionTextArea.getText();
//        String status = statusComboBox.getValue();
//        Complain complain = new Complain(id,id,description);
    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Admin/DashBoardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Admin DashBoard");
        stage.show();
    }

}