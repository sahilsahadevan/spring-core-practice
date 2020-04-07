package com.example.sahil.mixed_java_and_xml_context;

import com.example.sahil.xml_context.dao.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  This is to demonstrate how to make Xml Based Spring Application perform component Scan without using
 *      the @ComponentScan annotation
 *  Please note this is to scan only those components annotated with @Component, @Service, @Respository, @Controller
 *      etc. annotations so that we dont need to explicitly mention each bean and dependencies within the xml context.
 *  The context file can be of any name provided that it contains the springframework "beans" namespaces and
 *  	related xsd locations. In addition to that we also provide the springframework "context" namespaces and
 *  relation xsd locations
 *  ClassPathXmlApplicationContext object is used to invoked the Application Context and bring up the application.
 *  	We have to provide right context file while instantiation the context.
 *   e.g=> ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext_withComponentScan_example2.xml");
 *  To Perform Component Scan , we used the <context:component-scan /> element and declare the package to scan for.
 *   e.g   <context:component-scan base-package="com.example.sahil.java_annotation"/>
 */
public class XmlBasedConfigWithComponentScanPracticeApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(XmlBasedConfigWithComponentScanPracticeApplication.class);

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext(
                "applicationContext_withComponentScan.xml");
        int i = 1;
        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            LOGGER.info("[{}]:{}", i, beanName);
            i++;
        }
        XmlPersonDao xmlPersonDao1 = applicationContext.getBean(XmlPersonDao.class);
        LOGGER.info("==========> XmlPersonDao1 instance = {}", xmlPersonDao1);
        LOGGER.info(
                "==========> XmlPersonDao.getXmlJdbcConnection() instance = {}", xmlPersonDao1.getXmlJdbcConnection());

        XmlPersonDao xmlPersonDao2 = applicationContext.getBean(XmlPersonDao.class);
        LOGGER.info("==========> XmlPersonDao instance = {}", xmlPersonDao2);
        LOGGER.info(
                "==========> XmlPersonDao2.getXmlJdbcConnection() instance = {}", xmlPersonDao2.getXmlJdbcConnection());

        XmlPersonDao xmlPersonDao3 = applicationContext.getBean(XmlPersonDao.class);
        LOGGER.info("==========> XmlPersonDao3 instance = {}", xmlPersonDao3);
        LOGGER.info(
                "==========> XmlPersonDao3.getXmlJdbcConnection() instance = {}", xmlPersonDao3.getXmlJdbcConnection());

    }
}
