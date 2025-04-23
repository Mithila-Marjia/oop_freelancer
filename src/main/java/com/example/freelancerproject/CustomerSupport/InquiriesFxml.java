package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.ChangeFreelancer;
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


import javax.security.auth.Subject;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class InquiriesFxml
{
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TableView<Inquiries> generalTableView;
    @javafx.fxml.FXML
    private TableColumn<Inquiries,Integer>inquiryidTableColumn;
    @javafx.fxml.FXML
    private Label idLabel;
    @javafx.fxml.FXML
    private TableColumn<Inquiries,String>subjectTableColumn;
    @javafx.fxml.FXML
    private TextField subjectTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private Label subjectLabel;
    @javafx.fxml.FXML
    private Label descriptionLabel;
    @javafx.fxml.FXML
    private Label inquirieslLable;

    ArrayList<Inquiries> inquiries = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {



        inquiryidTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<>("subject"));

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

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException {

        int id =Integer.parseInt(idTextField.getText());
        String subject = subjectTextField.getText();
        String description = descriptionTextArea.getText();

        Inquiries inquirie = new Inquiries(id,subject,description);
        inquiries.add(inquirie);

        writeInquiries(inquirie);




    }
    public void writeInquiries(Inquiries inquiries) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("InquiriesData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(inquiries);

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
