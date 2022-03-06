package com.sony.assignment.actions.dialogs.add;

import com.sony.assignment.actions.LogTestAction;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.util.logging.Level;
import java.util.logging.Logger;

public class StringsCalcAddDialogController {
    //Fields
    Logger logger = Logger.getLogger(StringsCalcAddAction.class.getName());
    @FXML
    private TextField string1Txt;

    @FXML
    private TextField string2Txt;

    @FXML
    private TextField resultTxt;

    @FXML
    public void btnAddClicked() {
        resultTxt.setEditable(false);
        try {
            String num1Value = string1Txt.getText().trim();
            String num2Value = string2Txt.getText().trim();
            //By default, adding space between the two strings
            resultTxt.setText(num1Value + " " + num2Value);
        }catch (Exception e){
            logger.log(Level.INFO, "Please enter a valid input!" );
        }
    }
}
