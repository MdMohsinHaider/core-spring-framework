package com.mohsin;

import com.mohsin.beans.functionalprogram.IntrafceTaskManager;
import com.mohsin.beans.TaskManager;
import com.mohsin.config.LMConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * lookup method injection
 */
public class LookupMethodInjectionApplication {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(LMConfig.class);
        TaskManager taskManager = (TaskManager) context.getBean("taskManager");

        taskManager.runTask("data1");
        taskManager.runTask("data2");
        taskManager.runTask("data3");
        taskManager.runTask("data4");

        // Usig Interface for functinal programmming
        // three
        IntrafceTaskManager intrafceTaskManager = (IntrafceTaskManager) context.getBean("intrafceTaskManager");
        intrafceTaskManager.runTask("data5 from IntrafceTaskManager");
        intrafceTaskManager.runTask("data6 from IntrafceTaskManager");
        intrafceTaskManager.runTask("data7 from IntrafceTaskManager");
        intrafceTaskManager.runTask("data8 from IntrafceTaskManager");
    }
}
