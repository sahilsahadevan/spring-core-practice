package com.example.sahil.java_annotation;

import com.example.sahil.java_annotation.service.SortServiceImpl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 *  This is to demonstrate how to make SpringCore work based on Annotations
 *  The most Important Annotation is @Configuration that defines this application as Spring Core Application and
 *      provide all the necessary tools to make this app work in SpringCore Framework
 *  The next important tool is @Component Scan that scans all Sub packages within the main class parent package
 *      i.e com.example.sahil.java_annotation
 *   Incase the user need to point out which external propety files to refer, then @PropertySource can be
 *      used for that purpose.
 *   AnnotationConfigApplicationContext object is used here to invoke the Application Context IocContainer and bring up
 *   the application
 */
@Configuration
@ComponentScan
//@PropertySource("classpath:application.yml")
public class AnnotationBasedConfigPracticeApplication {
    private static final Logger LOGGER = LoggerFactory.getLogger(AnnotationBasedConfigPracticeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(AnnotationBasedConfigPracticeApplication.class)) {
            int i = 1;
            for (String beanName : applicationContext.getBeanDefinitionNames()) {
                LOGGER.info("[{}]:{}", i, beanName);
                i++;
            }
            applicationContext.getBean(AnnotationBasedConfigPracticeApplication.class);
            SortServiceImpl sortService = applicationContext.getBean(SortServiceImpl.class);
            sortService.sort();

        }
    }
}
