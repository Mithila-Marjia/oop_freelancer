package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

public class TransactionFxml
{
    @javafx.fxml.FXML
    private TableColumn<Transaction,Integer>receiverTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <Transaction,String>statusTableColumn;
    @javafx.fxml.FXML
    private TableView<Transaction>transactionTableView;
    @javafx.fxml.FXML
    private Label monitorLabel;
    @javafx.fxml.FXML
    private TableColumn<Transaction,Integer>transactionidTablecolumn;
    @javafx.fxml.FXML
    private TableColumn <Transaction, LocalDate>dateTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Transaction,Integer>senderidTablecolumn;

    ArrayList<Transaction> transactions = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<Transaction,String> applicationidTableColumn;


    @javafx.fxml.FXML
    public void initialize() {

        receiverTablecolumn.setCellValueFactory(new PropertyValueFactory<>("receiver"));
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<Transaction,String>("status"));
        transactionidTablecolumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        dateTableColumn.setCellValueFactory(new PropertyValueFactory<>("date"));
        senderidTablecolumn.setCellValueFactory(new PropertyValueFactory<>("id"));


        transactions.add(new Transaction(1, 101, 201, "Completed", LocalDate.of(2025, 4, 20)));
        transactions.add(new Transaction(2, 102, 202, "Pending", LocalDate.of(2025, 4, 21)));
        transactions.add(new Transaction(3, 103, 203, "Failed", LocalDate.of(2025, 4, 22)));
        transactions.add(new Transaction(4, 104, 204, "Completed", LocalDate.of(2025, 4, 23)));
        transactions.add(new Transaction(5, 105, 205, "In Progress", LocalDate.of(2025, 4, 24)));

        transactionTableView.getItems().clear();
        transactionTableView.getItems().addAll(transactions) ;

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