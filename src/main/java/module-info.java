module com.example.freelancerproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.freelancerproject to javafx.fxml;
    exports com.example.freelancerproject;
}