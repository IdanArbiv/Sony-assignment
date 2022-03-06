module com.sony.assignment {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.logging;
    opens com.sony.assignment.actions.dialogs.add to javafx.fxml;
    opens com.sony.assignment to javafx.fxml;
    exports com.sony.assignment;
}