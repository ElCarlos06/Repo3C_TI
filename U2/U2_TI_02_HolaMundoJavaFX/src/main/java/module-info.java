module mx.edu.utez.holamundojavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens mx.edu.utez.holamundojavafx to javafx.fxml;
    exports mx.edu.utez.holamundojavafx;
}