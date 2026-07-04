package com.mohsin;

import com.mohsin.beans.Robot;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class ConstructorSetterDependencyInjectionApplication {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListTableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListTableBeanFactory);

        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));

        Robot robot = (Robot) defaultListTableBeanFactory.getBean("robot", Robot.class);
        robot.powerOn();
    }
}
