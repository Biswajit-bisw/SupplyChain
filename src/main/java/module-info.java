module com.example.supplychainbiswa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.supplychainbiswa to javafx.fxml;
    exports com.example.supplychainbiswa;
}