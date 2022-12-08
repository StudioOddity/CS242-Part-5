module com.example.cs242part5 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cs242part5 to javafx.fxml;
    exports com.example.cs242part5;
}