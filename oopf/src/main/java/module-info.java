module com.example.oopf {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopf to javafx.fxml;
    exports com.example.oopf;
    //exports kab2220564;
}