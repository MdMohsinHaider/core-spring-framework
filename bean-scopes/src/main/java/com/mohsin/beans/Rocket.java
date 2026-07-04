package com.mohsin.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rocket {

    public Rocket() {
        System.out.println("Rocket constructor");
    }

    public void launch(){
        System.out.println("Rocket launch");
    }
}
