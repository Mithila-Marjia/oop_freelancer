package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ChangeFreelancerFxml
{
    @javafx.fxml.FXML
    private Label addnewfreelencerLable;
    @javafx.fxml.FXML
    private TextField emailTextField;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private DatePicker memberSinceDatePicker;
    @javafx.fxml.FXML
    private Label countryLable;
    @javafx.fxml.FXML
    private TextArea skillsTextArea;
    @javafx.fxml.FXML
    private Label nameLable;
    @javafx.fxml.FXML
    private Label emailLable;
    @javafx.fxml.FXML
    private Label rateLable;
    @javafx.fxml.FXML
    private ComboBox<String> statusComboBox;
    @javafx.fxml.FXML
    private ComboBox<String> countryComboBox;
    @javafx.fxml.FXML
    private Label statusLable;
    @javafx.fxml.FXML
    private TextField rateTextField;
    @javafx.fxml.FXML
    private Label skillsLable;
    @javafx.fxml.FXML
    private Label dateLable;

    ArrayList<ChangeFreelancer> changeFreelancerslist = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        statusComboBox.getItems().addAll("Active", "Inactive");
        countryComboBox.getItems().addAll("All", "Bangladesh", "India", "Pakistan");


    }

    @javafx.fxml.FXML
    public void cancleButton(ActionEvent actionEvent) {




    }

    @javafx.fxml.FXML
    public void saveButten(ActionEvent actionEvent) {
        String name = nameTextField.getText();
        String email = emailTextField.getText();
        String skill = skillsTextArea.getText();
        String rate = rateTextField.getText();
        LocalDate memberSince = memberSinceDatePicker.getValue();
        String status = statusComboBox.getValue();
        String country = countryComboBox.getValue();
        ChangeFreelancer changeFreelancer = new ChangeFreelancer(name,email,country,skill,status,rate,memberSince);
        changeFreelancerslist.add(changeFreelancer);
        writeFreelancer(changeFreelancer);



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

    public ArrayList<ChangeFreelancer> readFreelancer() {
        ArrayList<ChangeFreelancer> librianObservableList = new ArrayList<>() ;
        File f = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {
            f = new File("LibrianData.bin");
            fis = new FileInputStream(f);
            ois = new ObjectInputStream(fis);
            ChangeFreelancer librian;
            try{
                while(true){
                    librian = (ChangeFreelancer) ois.readObject();
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