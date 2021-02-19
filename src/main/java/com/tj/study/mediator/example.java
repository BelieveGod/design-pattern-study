package com.tj.study.mediator;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/2/19 11:36
 */
public class example {
    public static void main(String[] args) {
        Mediator mediator=new ConcreteMediator();
        Colleague colleague=new ConcreteColleague();
        Colleague colleague2=new ConcreteColleague2();

        mediator.register(colleague);
        mediator.register(colleague2);


        colleague2.on("a",param -> {
            System.out.println("(String)(param[0]) = " + (String) (param[0]));
            return null;
        });


        colleague.send("a","haha","dd");
        System.out.println("main end");
    }
}
