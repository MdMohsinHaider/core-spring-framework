package com.mohsin.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


// Optimozed way using config class
// make this class abstract
abstract public class TaskManager {

    // concret method
    public void runTask(Object data){
        Task task = null;

        task = lookupTask();
        System.out.println("task id:" + task.hashCode());
        task.setData(data);
        task.execute();

        task = null;
    }

    // abstract method
    abstract public Task lookupTask();
 }


















// first way with loose cople but it is also titghtly copule with Spring

/*
@Component
@Scope("singleton")
public class TaskManager {
    public void runTask(Object data) {
        Task task = null;

        task = lookupTask();
        System.out.println("task id: "+task.hashCode());
        task.setData(data);
        task.execute();

        task = null;
    }

    @Lookup
    public Task lookupTask() {
        return null;
    }

}

 */














//------------------------------------------________-------------------------------------------

// second way but its tight couple, 1. exposed concret class is tight couple, 2. complex the code
// Invasive
/*

@Component
@Scope("singleton")
public class TaskManager implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void runTask(Object data) {
        Task task = null;

        task = applicationContext.getBean("notificationTask",Task.class);
        System.out.println("task id: "+task.hashCode());
        task.setData(data);
        task.execute();

        task = null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}

*/