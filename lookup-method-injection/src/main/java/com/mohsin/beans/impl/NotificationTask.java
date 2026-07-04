package com.mohsin.beans.impl;

import com.mohsin.beans.Task;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class NotificationTask implements Task {

    private Object data;

    @Override
    public void execute() {
        System.out.println("executing NotificationTask with data: " + data);
    }

    @Override
    public void setData(Object data) {
        this.data = data;
    }
}
