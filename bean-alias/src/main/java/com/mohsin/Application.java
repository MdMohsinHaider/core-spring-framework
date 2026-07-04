package com.mohsin;

import com.mohsin.beans.Toy;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class Application
{
    public static void main( String[] args ) {
        DefaultListableBeanFactory defaultListableBeanFactory_Obj = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(defaultListableBeanFactory_Obj);
        xmlBeanDefinitionReader.loadBeanDefinitions(new ClassPathResource("application-context.xml"));

        Toy toy1 = defaultListableBeanFactory_Obj.getBean("toy",Toy.class);
        Toy toy2 = defaultListableBeanFactory_Obj.getBean("mytoy", Toy.class);
        toy1.play();
        toy2.play();
        System.out.println("toy1 == toy2: " + (toy1 == toy2));

        System.out.println("---------------------****---------------------------------");

        String[] aliases = defaultListableBeanFactory_Obj.getAliases("mytoy");
        for (String alias : aliases) {
            System.out.println("alias = " + alias);
        }


    }
}
