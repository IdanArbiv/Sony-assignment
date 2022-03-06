package com.sony.assignment.actions;

import java.util.Random;
import java.util.logging.Level;

public class RandomNumberAction extends Action{
    //Fields
    private final Random rand = new Random();
    private int randNum;

    @Override
    protected void run() {
        //Use try and catch to catch exceptions if there are any
        try {
            generateRandom();
         }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

    private void generateRandom() {
        //Generate random integer using 'Random'
        randNum = rand.nextInt();
        logger.log(Level.INFO, "Your random number is: " + randNum);
    }


    @Override
    protected String getName() {
        return "Generate Random Number Action";
    }

}
