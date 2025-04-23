package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.Application;
import com.example.freelancerproject.Admin.Report;
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

public class IdentityFxml
{
    @javafx.fxml.FXML
    private TableColumn<Identity,String> pricingTableColumn;
    @javafx.fxml.FXML
    private TableColumn<Identity,String>nameTableColumn;
    @javafx.fxml.FXML
    private Label identityLabel;
    @javafx.fxml.FXML
    private TableColumn<Identity,Integer>freelanceridTablaColumn;
    @javafx.fxml.FXML
    private TableView identityTableView;
    @javafx.fxml.FXML
    private ComboBox<Integer>freelanceridcombobox;
    @javafx.fxml.FXML
    private Label freelanceridLabel;
    @javafx.fxml.FXML
    private Label freelancerdetailsLabel;
    @javafx.fxml.FXML
    private TextArea identitydocumenttTextArea;

    @javafx.fxml.FXML
    private TableColumn<Identity, Integer> applicationidTableColumn;


    ArrayList<Identity> identities = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        freelanceridcombobox.getItems().addAll();



        freelanceridTablaColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameTableColumn.setCellValueFactory(new PropertyValueFactory<Identity,String>("name"));
        pricingTableColumn.setCellValueFactory(new PropertyValueFactory<Identity,String>("pricing"));


        identities.add (new Identity(1, "Alice Smith", "$20/hr", "Frontend Developer with React"));
        identities.add(new Identity(2, "Bob Johnson", "$25/hr", "Backend Developer with Node.js"));
        identities.add(new Identity(3, "Clara Davis", "$30/hr", "UI/UX Designer"));
        identities.add(new Identity(4, "David Wilson", "$18/hr", "Content Writer and SEO expert"));
        identities.add(new Identity(5, "Eva Brown", "$35/hr", "Full Stack Developer (Java & Angular)"));

        freelanceridcombobox.getItems().add(1);
        freelanceridcombobox.getItems().add(2);
        freelanceridcombobox.getItems().add(3);
        freelanceridcombobox.getItems().add(4);
        freelanceridcombobox.getItems().add(4);

        identityTableView.getItems().clear();
        identityTableView.getItems().addAll(identities) ;


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