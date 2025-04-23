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

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ApplicationFxml
{
    @javafx.fxml.FXML
    private TableView<Application> freelancerTableView;
    @javafx.fxml.FXML
    private TableColumn<Application, String> statusTableColumn;
    @javafx.fxml.FXML
    private ComboBox<Integer> applicationComboBox;
    @javafx.fxml.FXML
    private TextArea applicationviewTextArea;
    @javafx.fxml.FXML
    private TableColumn<Application,Integer> senderidTableColumn;
    @javafx.fxml.FXML
    private Label reviewLabel;
    @javafx.fxml.FXML
    private Label applicationDetailsLabel;
    @javafx.fxml.FXML
    private Label applicationidLable;

    ArrayList<Application> applications = new ArrayList<>();
    @javafx.fxml.FXML
    private TableColumn<Application, Integer> applicationidTableColumn;

    @javafx.fxml.FXML
    public void initialize() {

        applicationComboBox.getItems().addAll();
        statusTableColumn.setCellValueFactory(new PropertyValueFactory<>("ststus"));
        senderidTableColumn.setCellValueFactory(new PropertyValueFactory<>("senderid"));
        applicationidTableColumn.setCellValueFactory(new PropertyValueFactory<>("applicationid"));

        applications.add(new Application(1, 101, "Leave Request", "Requesting leave for medical reasons.", "Pending", LocalDate.of(2025, 4, 20)));
        applications.add(new Application(2, 102, "Salary Issue", "Salary not credited for the month of March.", "Resolved", LocalDate.of(2025, 4, 18)));
        applications.add(new Application(3, 103, "Project Allocation", "Requesting a new project allocation.", "In Review", LocalDate.of(2025, 4, 19)));
        applications.add(new Application(4, 104, "Technical Support", "Facing login issues in the portal.", "Pending", LocalDate.of(2025, 4, 21)));
        applications.add(new Application(5, 105, "Certificate Request", "Requesting experience certificate.", "Approved", LocalDate.of(2025, 4, 22)));

        applicationComboBox.getItems().add(1);
        applicationComboBox.getItems().add(2);
        applicationComboBox.getItems().add(3);
        applicationComboBox.getItems().add(4);
        applicationComboBox.getItems().add(5);

        freelancerTableView.getItems().clear();
        freelancerTableView.getItems().addAll(applications) ;
    }


    @javafx.fxml.FXML
    public void rejectButton(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void approveButton(ActionEvent actionEvent) {


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
    public void writeFreelancer(Application application) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("ApplicationData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(application);

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


