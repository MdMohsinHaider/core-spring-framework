package com.mohsin;

import com.mohsin.beans.DateHelper;
import com.mohsin.beans.Rocket;
import com.mohsin.beans.Television;
import com.mohsin.config.BeanScopeConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application
{
    public static void main( String[] args ) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(BeanScopeConfig.class);

        Rocket rocket1 = applicationContext.getBean("rocket", Rocket.class);
        Rocket rocket2 = applicationContext.getBean("rocket", Rocket.class);

        System.out.println("rocket1 == rocket2 ? : " + (rocket1 == rocket2));
        // if both references are pointing to the same object, == results in true otherwise false

        Television television1 = applicationContext.getBean("ledTelevision", Television.class);
        Television television2 = applicationContext.getBean("_4kTelevision", Television.class);
        System.out.println("television1 == television2 ? : " + (television1 == television2));

        System.out.println("------------------------------***-------------------------------------\n");

        DateHelper dateHelper1 =  applicationContext.getBean("dateHelper", DateHelper.class);
        DateHelper dateHelper2 =  applicationContext.getBean("dateHelper", DateHelper.class);
        System.out.println("DateHelper1 : " + dateHelper1.hashCode());
        System.out.println("DateHelper2 : " + dateHelper2.hashCode());

        DateHelper dateHelper3 = DateHelper.getInstance();
        System.out.println("Outside the IOC DateHelper3 : " + dateHelper3.hashCode());

    }
}
