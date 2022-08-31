module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}
//--module-path %PATH_TO_FX%;%PATH_TO_FX%\lib