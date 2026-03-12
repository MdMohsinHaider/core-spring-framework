package com.mohsin;

import com.mohsin.beans.MessageWriter;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;


public class CoreDependencyInjectionApplication {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory);

        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));

        MessageWriter messageWriter = (MessageWriter) defaultListableBeanFactory.getBean("messageWriter",MessageWriter.class);

        messageWriter.writeMessage("Welcome to Spring Framework !!!");
    }
}
