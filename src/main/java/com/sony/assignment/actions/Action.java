package com.sony.assignment.actions;
import java.util.logging.Logger;

public abstract class Action {

    Logger logger = Logger.getLogger(Action.class.getName());

    public final void invoke() {
        try{
            logger.info(String.format("Running action - %s", this.getName()));
            this.run();
        }
        catch (Exception ex){
            logger.info(String.format("Exception action - %s", this.getName()));
            logger.info(String.format("Exception message - %s", ex.getMessage()));
        }
        logger.info(String.format("Finish action - %s", this.getName()));
    }
    protected abstract void run();
    protected abstract String getName();
}
