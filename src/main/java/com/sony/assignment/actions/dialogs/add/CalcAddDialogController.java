package com.sony.assignment.actions.dialogs.add;

import com.sony.assignment.actions.LogTestAction;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Dialog;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;


public class CalcAddDialogController{

    Logger logger = Logger.getLogger(CalcAddAction.class.getName());

    //Fields

    @FXML
    private TextField num1Txt = new TextField();

    @FXML
    private TextField num2Txt = new TextField();

    @FXML
    private TextField resultTxt = new TextField();



    @FXML
    public void btnAddClicked() {
        //Changing the TextField properties to validate int only
        num1Txt.textProperty().addListener((observableValue, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                num1Txt.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        num2Txt.textProperty().addListener((observableValue, oldValue, newValue) -> {
            if (!newValue.matches("\\d*")) {
                num2Txt.setText(newValue.replaceAll("[^\\d]", ""));
            }
        });
        resultTxt.setEditable(false);

        //Using try-catch to catch any exceptions if there are any, and print a message to the user.
        try{
            int num1Value = Integer.valueOf(num1Txt.getText().trim());
            int num2Value = Integer.valueOf(num2Txt.getText().trim());
            resultTxt.setText(String.valueOf(num1Value+num2Value));
        }catch (Exception e){
            logger.log(Level.INFO, "Invalid input, please try again!" );
        }

    }


}
