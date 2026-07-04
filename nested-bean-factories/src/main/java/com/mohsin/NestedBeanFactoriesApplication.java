package com.mohsin;

import com.mohsin.beans.Motor;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class NestedBeanFactoriesApplication
{
    public static void main( String[] args ) {
        // parent factory
        DefaultListableBeanFactory parentFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader parentReader = new XmlBeanDefinitionReader(parentFactory);
        parentReader.loadBeanDefinitions(new ClassPathResource("parent-beans.xml"));


        // child factory by nesting the parent factory
        DefaultListableBeanFactory childFactory = new DefaultListableBeanFactory(parentFactory);
        XmlBeanDefinitionReader childReader = new XmlBeanDefinitionReader(childFactory);
        childReader.loadBeanDefinitions(new ClassPathResource("child-beans.xml"));

        Motor motor = childFactory.getBean("motor", Motor.class);
        motor.run();
    }
}
