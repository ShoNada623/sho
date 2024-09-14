module com.example.mkk {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.mkk to javafx.fxml;
    exports com.example.mkk;
}