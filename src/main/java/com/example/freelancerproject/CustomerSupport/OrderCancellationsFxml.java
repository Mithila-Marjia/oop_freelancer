package com.example.freelancerproject.CustomerSupport;

import com.example.freelancerproject.Admin.ChangeFreelancer;
import com.example.freelancerproject.Admin.Report;
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

public class OrderCancellationsFxml
{
    @javafx.fxml.FXML
    private Label commentLable;
    @javafx.fxml.FXML
    private TextField idTextField;
    @javafx.fxml.FXML
    private TextField senderidTextfield;
    @javafx.fxml.FXML
    private Label orderLable;
    @javafx.fxml.FXML
    private Label senderidLable;
    @javafx.fxml.FXML
    private TextArea commentsTextArea;
    @javafx.fxml.FXML
    private Label cancellationLable;
    @javafx.fxml.FXML
    private TextField receveridTextField;
    @javafx.fxml.FXML
    private ComboBox<String>reasonComboBox;
    @javafx.fxml.FXML
    private Label orderidLable;
    @javafx.fxml.FXML
    private Label receveridLable;

    ArrayList<OrderCancellation> orderCancellationss = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {
        reasonComboBox.getItems().addAll("Technical Issue","False Information","Change of mind");
    }

    @javafx.fxml.FXML
    public void cancelButton(ActionEvent actionEvent) {


    }

    @javafx.fxml.FXML
    public void issueButton(ActionEvent actionEvent) {
        String reason = reasonComboBox.getValue();
        int receverid =Integer.parseInt(receveridTextField.getText());
        int senderid =Integer.parseInt(senderidTextfield.getText());
        int id =Integer.parseInt(idTextField.getText());


        String comments = commentsTextArea.getText();

        OrderCancellation orderCancellations = new OrderCancellation(id, senderid,receverid);
        orderCancellationss.add(orderCancellations);

        writeOrderCancellation(orderCancellations);
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
    public void writeOrderCancellation(OrderCancellation orderCancellation) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("OrderCancellation.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(orderCancellation);

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
