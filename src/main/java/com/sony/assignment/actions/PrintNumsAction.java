package com.sony.assignment.actions;

import java.util.logging.Level;

public class PrintNumsAction extends Action{
    String msg;
    @Override
    protected void run() {
        //Use try and catch to catch exceptions if there are any
        try {
            printNumber();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void printNumber() {
        for (int i = 1; i <= 100; i++) {
            logger.log(Level.INFO, String.valueOf(i));
        }
    }

    @Override
    protected String getName() {
        return "Print Numbers Action";
    }
}
