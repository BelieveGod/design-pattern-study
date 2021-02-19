package com.tj.study.mediator;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/2/19 11:10
 */
public interface Mediator {

    void register(Colleague colleague);
    void remove(Colleague colleague);
    void relay(String event,Object... args);
}
