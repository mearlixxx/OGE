module com.example.oge {
    requires javafx.controls;
    requires javafx.fxml;

    requires java.sql;


    opens com.example.oge to javafx.fxml;
    exports com.example.oge;
    exports com.example.oge.Tasks;
    opens com.example.oge.Tasks to javafx.fxml;
}