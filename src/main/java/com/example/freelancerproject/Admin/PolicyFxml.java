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

import java.io.*;
import java.util.ArrayList;

public class PolicyFxml
{
    @javafx.fxml.FXML
    private TextField titelTextField;
    @javafx.fxml.FXML
    private Label ruleLable;
    @javafx.fxml.FXML
    private Label descriptionLable;
    @javafx.fxml.FXML
    private TextArea textTextArea;
    @javafx.fxml.FXML
    private Label policyLable;

    ArrayList<Policy> policys = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {


    }

    @javafx.fxml.FXML
    public void updateButton(ActionEvent actionEvent) {

        String tital = titelTextField.getText();
        String text = textTextArea.getText();

        Policy policy = new Policy( tital,text);
        policys.add(policy);

        writeFreelancer(policy);

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
    public void writeFreelancer(Policy changeFreelancer) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("PolicyData.bin");
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
    public ArrayList<Policy> readPolicy() {
        ArrayList<Policy> librianObservableList = new ArrayList<>() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("PolicyData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            Policy librian;
            try{
                while(true){
                    librian = (Policy) ois.readObject();
                    librianObservableList.add(librian) ;
                }
            }
            catch(Exception e){
                System.out.println("Error: " + e.getMessage());
            }
        } catch (Exception ex) {
            System.out.println("External Error: " + ex.getMessage());
        }
        finally {
            try {

                if(ois != null) ois.close();
            } catch (IOException ex) { }
        }
        return librianObservableList ;
    }
}

