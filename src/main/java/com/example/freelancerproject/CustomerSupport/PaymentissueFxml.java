package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.ChangeFreelancer;
import com.example.freelancerproject.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;

public class PaymentissueFxml
{
    @javafx.fxml.FXML
    private Label problemtypeLabel;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private Label paymentLabel;
    @javafx.fxml.FXML
    private ComboBox<String>problemtypeComboBox;
    @javafx.fxml.FXML
    private Label senderidLabel;
    @javafx.fxml.FXML
    private TextField senderidTextField;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private Label paymentidLabel;
    @javafx.fxml.FXML
    private Label descriptionLabel;
    ArrayList<Paymentissue> paymentissues = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        problemtypeComboBox.getItems().addAll("Technical Issue","Failed Transaction");
    }

    @javafx.fxml.FXML
    public void submitButton(ActionEvent actionEvent) {

        String problemtype = problemtypeComboBox.getValue();


        int id =Integer.parseInt(idTextField.getText());
        int senderid =Integer.parseInt(senderidTextField.getText());
        String description = descriptionTextArea.getText();

        Paymentissue paymentissue = new Paymentissue(id,senderid,description);
        paymentissues.add(paymentissue);

        writePaymentissue(paymentissue);


    }

    @javafx.fxml.FXML
    public void cancleButton(ActionEvent actionEvent) {
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
    public void writePaymentissue(Paymentissue paymentissue) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("PaymentissueData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(paymentissue);

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
