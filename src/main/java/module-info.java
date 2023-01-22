module com.example.supplychainbiswa {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.supplychainbiswa to javafx.fxml;
    exports com.example.supplychainbiswa;
}