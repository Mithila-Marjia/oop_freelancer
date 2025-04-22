module com.example.freelancerproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.freelancerproject to javafx.fxml;
    opens com.example.freelancerproject.CustomerSupport to javafx.fxml;
    opens com.example.freelancerproject.Admin to javafx.fxml;

    exports com.example.freelancerproject;
}