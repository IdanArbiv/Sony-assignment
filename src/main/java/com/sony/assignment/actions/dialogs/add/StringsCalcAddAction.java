package com.sony.assignment.actions.dialogs.add;

import com.sony.assignment.RobotApplication;
import com.sony.assignment.actions.Action;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class StringsCalcAddAction extends Action {
    @Override
    protected void run() {
        //Implement run (try and catch)
        try {
            openDialog();
        }
        catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void openDialog() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(RobotApplication.class.getResource("stringsCalcAddDialog.fxml"));
        StringsCalcAddDialogController controller = new StringsCalcAddDialogController();
        Parent root = loader.load();
        Scene scene = new Scene(root);
        final Stage dialog = new Stage();
        dialog.setTitle("Add Strings Action");
        dialog.setScene(scene);
        dialog.centerOnScreen();
        dialog.showAndWait();
    }

    @Override
    //Implements getName - return the name of the action
    protected String getName() {
        return "Add Two Strings";
    }
}
