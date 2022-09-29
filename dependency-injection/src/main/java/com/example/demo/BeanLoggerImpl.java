package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class BeanLoggerImpl implements BeanLogger {

    @Autowired
    ApplicationContext applicationContext;

    @Override
    public String[][] getAllBeans() {

        String allBeans = "";

        String[] beanNames = applicationContext.getBeanDefinitionNames();

        String [][] data = new String[beanNames.length][2];

        for (int i=0; i<beanNames.length; i++) {
            String beanName = beanNames[i];

            data[i][0] = beanName;
            data[i][1] = applicationContext.getBean(beanName).getClass().toString();
        }

        return data;
    }
}
