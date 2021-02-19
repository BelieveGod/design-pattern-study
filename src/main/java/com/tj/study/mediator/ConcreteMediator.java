package com.tj.study.mediator;

import java.util.List;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/2/19 11:16
 */
public class ConcreteMediator implements Mediator{

    List<Colleague> list = new CopyOnWriteArrayList();
    @Override
    public void register(Colleague colleague) {
        if(!list.contains(colleague)){
            list.add(colleague);
            colleague.setMediator(this);
        }
    }

    @Override
    public void remove(Colleague colleague) {
        list.remove(colleague);
        colleague.setMediator(null);

    }

    @Override
    public void relay(String event,Object... args) {
        new Thread(()->{
            // 这里可以改进成多线程通知。
            for (Colleague colleague1 : list) {
                colleague1.reveive(event,args);
            }
        }).start();

    }
}
