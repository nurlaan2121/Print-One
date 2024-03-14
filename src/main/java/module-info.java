module org.example.printone {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.printone to javafx.fxml;
    exports org.example.printone;
}