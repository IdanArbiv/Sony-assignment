package com.sony.assignment;

import com.sony.assignment.actions.ActionsContainer;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;

import java.net.URL;
import java.util.ResourceBundle;

public class RobotController implements Initializable {

    @FXML
    private ListView<String> actionListView;

    private ActionsContainer actionsContainer;

    @FXML
    protected void onRunButtonClick() {
        actionsContainer.runAction(actionListView.getSelectionModel().getSelectedItem());
    }

    private void loadActions(){

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        actionsContainer = new ActionsContainer();
        actionListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        actionsContainer.getActions().stream().sorted().forEach(a->actionListView.getItems().add(a));
    }
}