package edu.bean;

import org.springframework.stereotype.Component;

@Component("exampleBean")//change testbean's bean id
public class TestBean {
    public TestBean() {
        System.out.println("TestBean created");
    }
}
