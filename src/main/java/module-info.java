module com.example.javaassignment1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javaassignment1 to javafx.fxml;
    exports com.example.javaassignment1;
}