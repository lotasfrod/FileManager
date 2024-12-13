module com.jabbi.kursachjabbi {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.jabbi.kursachjabbi to javafx.fxml;
    exports com.jabbi.kursachjabbi;
}