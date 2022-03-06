package com.sony.assignment.actions;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LogTestAction extends Action{
    Logger logger = Logger.getLogger(LogTestAction.class.getName());

    @Override
    protected void run() {
        logger.log(Level.INFO, "Log action test");
    }

    @Override
    protected String getName() {
        return "Log Test Action";
    }

}
