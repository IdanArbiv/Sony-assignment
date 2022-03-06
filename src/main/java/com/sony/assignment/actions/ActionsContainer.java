package com.sony.assignment.actions;

import com.sony.assignment.actions.dialogs.add.CalcAddAction;
import com.sony.assignment.actions.dialogs.add.StringsCalcAddAction;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ActionsContainer {

    private Collection<Action> actions;

    public ActionsContainer(){
        this.actions = Set.of(new LogTestAction(),new Delay(5),new Delay(3), new Delay(1),new CalcAddAction(), new RandomNumberAction(), new PrintNumsAction(), new StringsCalcAddAction());
    }

    public Collection<String> getActions(){
        return this.actions.stream().map(Action::getName).collect(Collectors.toSet());
    }

    public void runAction(String name){
        actions.stream().filter(a -> a.getName().equals(name)).findFirst().ifPresent(a -> a.invoke());
    }

}
