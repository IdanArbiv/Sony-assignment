package com.sony.assignment.actions;

import java.util.concurrent.TimeUnit;

public class Delay extends Action{

    private int second;
    public Delay(int second){
        this.second=second;
    }

    @Override
    protected void run() {
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected String getName() {
        return String.format("Delay %d",this.second);
    }

}
