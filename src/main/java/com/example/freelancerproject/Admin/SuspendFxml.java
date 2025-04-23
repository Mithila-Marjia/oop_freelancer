package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class SuspendFxml
{
    @javafx.fxml.FXML
    private TextField suspendidTextField;
    @javafx.fxml.FXML
    private Label suspendedidLable;
    @javafx.fxml.FXML
    private Label reasonLable;
    @javafx.fxml.FXML
    private Label suspendidLable;
    @javafx.fxml.FXML
    private TextField suspendedidTextFiels;
    @javafx.fxml.FXML
    private Label suspendLabel;
    @javafx.fxml.FXML
    private TextArea reasonTextArea;

    ArrayList<Suspend> suspends = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void suspendButton(ActionEvent actionEvent) {

        int suspendid =Integer.parseInt(suspendidTextField.getText());
        int suspendedid =Integer.parseInt(suspendedidTextFiels.getText());
        String reason = reasonTextArea.getText();
        Suspend suspend = new Suspend(suspendid,suspendedid,reason);
        suspends.add(suspend);
//        writeFreelancer(suspend);

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
    public void writeFreelancer(ChangeFreelancer changeFreelancer) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("FreelancerData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(changeFreelancer);

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
