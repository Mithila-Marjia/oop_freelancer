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

public class AnnouncementFxml
{
    @javafx.fxml.FXML
    private Label DateLable;
    @javafx.fxml.FXML
    private TextField titleTextField;
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private Label TitleLable;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> audienceComboBox;
    @javafx.fxml.FXML
    private Label postLABLE;
    @javafx.fxml.FXML
    private Label audienceLable;
    @javafx.fxml.FXML
    private Label announcementLable;
    @javafx.fxml.FXML
    private Label messageLable;

    ArrayList<Announcement> announcements = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        audienceComboBox.getItems().addAll("All", "Freelancers", "Clients", "Admins");


    }

    @javafx.fxml.FXML
    public void postButton(ActionEvent actionEvent) {

        String title = titleTextField.getText();
        String message = messageTextArea.getText();
        LocalDate date = dateDatePicker.getValue();
        String audience = audienceComboBox.getValue();

        Announcement announcement = new Announcement(title,message,audience,date);
        announcements.add(announcement);


    }

    @javafx.fxml.FXML
    public void backButton(ActionEvent actionEvent) throws IOException {

        Parent root = null ;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Admin/DashBoardFxml.fxml"));
        root = fxmlLoader.load();
        Scene scene = new Scene(root) ;
        Stage stage = (Stage)((Node)actionEvent.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Admin Dashboard");
        stage.show();

    }
    public void writeFreelancer(Announcement announcement) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("AnnouncementData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(announcement);

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
