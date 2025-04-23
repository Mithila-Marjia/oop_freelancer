package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.Announcement;
import com.example.freelancerproject.Admin.ChangeFreelancer;
import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UsercomplaintFxml
{
    @javafx.fxml.FXML
    private Label reviewLabel;
    @javafx.fxml.FXML
    private Label useridLabel;
    @javafx.fxml.FXML
    private TableColumn<Usercomplain,Integer>useridTableColumn;
    @javafx.fxml.FXML
    private TableColumn <Usercomplain,String>subjectTableColumn;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableView complaintsTableView;
    @javafx.fxml.FXML
    private Label subjectLabel;
    @javafx.fxml.FXML
    private Label descriptionLabel;
    @javafx.fxml.FXML
    private ComboBox<Integer>useridCombobox;
    ArrayList<Usercomplain> usercomplaints = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        useridCombobox.getItems().addAll();

        useridTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<Usercomplain,String>("subject"));



    }

    @javafx.fxml.FXML
    public void resolveButton(ActionEvent actionEvent) {


        String subject = subjectTextField.getText();
        String description = descriptionTextArea.getText();
        int userid= useridCombobox.getValue();


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("dashboard.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("CustomerSupport Dashboard");
        stage.show();
    }
    public void writeFreelancer(Usercomplain usercomplain) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("usercomplainData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(usercomplain);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if(oos != null) oos.close();
            } catch (IOException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        }
    }
}
