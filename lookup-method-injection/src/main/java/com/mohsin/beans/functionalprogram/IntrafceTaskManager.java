package com.mohsin.beans;

@FunctionalInterface
public interface IntrafceTaskManager {

    default void runTask(Object data){
        Task task = null;

        task = lookupTask();
        System.out.println("task id:" + task.hashCode());
        task.setData(data);
        task.execute();

        task = null;
    }

    Task lookupTask();
}
