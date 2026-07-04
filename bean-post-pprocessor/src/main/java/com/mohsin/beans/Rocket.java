package com.mohsin.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rocket {

    private Agent agent;

    @Autowired
    public void setAgent(Agent agent) {
        System.out.println("set agent");
        this.agent = agent;
    }

    @PostConstruct
    public void init(){
        System.out.println("init rocket");
    }
}
