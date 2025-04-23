package com.example.freelancerproject.Admin;

import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class ReportFxml
{
    @javafx.fxml.FXML
    private Label generateLable;
    @javafx.fxml.FXML
    private DatePicker fromDatePicker;
    @javafx.fxml.FXML
    private Label idLable;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> reportTypeCombobox;
    @javafx.fxml.FXML
    private TextField reportidTextField;
    @javafx.fxml.FXML
    private Label reportLable;
    @javafx.fxml.FXML
    private Label fromdateLable;
    @javafx.fxml.FXML
    private Label descriptionLable;
    ArrayList<Report> reportss = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        reportTypeCombobox.getItems().addAll("Emergency","Other");

    }

    @javafx.fxml.FXML
    public void generstereportButton(ActionEvent actionEvent) {
        int reportid =Integer.parseInt(reportidTextField.getText());
        String description = descriptionTextArea.getText();
        LocalDate from = fromDatePicker.getValue();
        String reportType = reportTypeCombobox.getValue();
        Report report = new Report(reportid,description);
        reportss.add(report);

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
