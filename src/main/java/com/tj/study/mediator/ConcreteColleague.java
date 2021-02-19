package com.tj.study.mediator;

import javafx.util.Callback;

import java.util.HashMap;
import java.util.Map;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/2/19 11:17
 */
public class ConcreteColleague implements Colleague{
    private Mediator mediator;
    private Map<String, Callback<Object[],Void>> funMap = new HashMap<>();

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void on(String event,Callback<Object[],Void> callback){
        funMap.put(event,callback);
    }

    @Override
    public void reveive(String event, Object... args) {
        Callback<Object[], Void> callback = funMap.get(event);
        if (callback != null) {
            callback.call(args);
        }
    }

    @Override
    public void send(String event, Object... args) {
        mediator.relay(event,args);
    }
}
