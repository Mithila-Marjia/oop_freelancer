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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class LivechatFxml
{
    @javafx.fxml.FXML
    private TextField typeTextField;
    @javafx.fxml.FXML
    private Label liveLable;
    @javafx.fxml.FXML
    private ComboBox<Integer> messageidcombobox;
    @javafx.fxml.FXML
    private TextField senderidTextField;
    @javafx.fxml.FXML
    private TextArea messageTextArea;
    ArrayList<Livechat> livechats = new ArrayList<>();

    @javafx.fxml.FXML
    public void initialize() {

        messageidcombobox.getItems().addAll();
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

    @javafx.fxml.FXML
    public void sendButton(ActionEvent actionEvent) throws IOException {

        String type = typeTextField.getText();
        int senderid =Integer.parseInt(senderidTextField.getText());
        String message = messageTextArea.getText();


        int messageid = messageidcombobox.getValue();

        Livechat livechat = new Livechat(messageid, senderid, message,type);
        livechats.add(livechat);

        writeLivechat(livechat);


    }
    public void writeLivechat(Livechat livechat) {
        File f = null;
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            f = new File("LivechatData.bin");
            if(f.exists()){
                fos = new FileOutputStream(f,true);
//                oos = new AppendableObjectOutputStream(fos);
                oos = new ObjectOutputStream(fos) ;
            }
            else{
                fos = new FileOutputStream(f);
                oos = new ObjectOutputStream(fos);
            }

            oos.writeObject(livechat);

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
