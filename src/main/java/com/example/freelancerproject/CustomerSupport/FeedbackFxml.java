package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.ChangeFreelancer;
import com.example.freelancerproject.Admin.Report;
import com.example.freelancerproject.Admin.Transaction;
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

public class FeedbackFxml
{
    @javafx.fxml.FXML
    private Label userLabel;
    @javafx.fxml.FXML
    private TableColumn<Feedback,Integer>feedbackidTableColumn;
    @javafx.fxml.FXML
    private Label feedbackidLabel;
    @javafx.fxml.FXML
    private TableView<Feedback>feedbackTableView;
    @javafx.fxml.FXML
    private TableColumn<Feedback,String>subjectTableColumn;
    @javafx.fxml.FXML
    private Label feedbackLabel;
    @javafx.fxml.FXML
    private TextArea analysisTextArea;
    @javafx.fxml.FXML
    private ComboBox<Integer>feedbackidCombobox;
    ArrayList<Feedback> feedbacks = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        feedbackidCombobox.getItems().addAll();



        feedbackidTableColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        subjectTableColumn.setCellValueFactory(new PropertyValueFactory<Feedback,String>("subject"));


        feedbacks.add(new Feedback(1, "App Crash", "The app crashes after login."));
        feedbacks.add(new Feedback(2, "Slow Response", "Support team response is delayed."));
        feedbacks.add(new Feedback(3, "Payment Issue", "Transaction failed but money was deducted."));
        feedbacks.add(new Feedback(4, "Feature Request", "Add dark mode in the next update."));
        feedbacks.add(new Feedback(5, "Bug Report", "Can't update my profile picture."));

        feedbackidCombobox.getItems().add(1);
        feedbackidCombobox.getItems().add(2);
        feedbackidCombobox.getItems().add(3);
        feedbackidCombobox.getItems().add(4);
        feedbackidCombobox.getItems().add(4);

        feedbackTableView.getItems().clear();
        feedbackTableView.getItems().addAll(feedbacks) ;
    }

    @javafx.fxml.FXML
    public void exportButton(ActionEvent actionEvent) {



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
    public void writeFeedback(Feedback feedback) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("FeedbackData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(feedback);

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
