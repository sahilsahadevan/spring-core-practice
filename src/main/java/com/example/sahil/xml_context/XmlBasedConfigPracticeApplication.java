package com.example.sahil.xml_context;

import com.example.sahil.xml_context.dao.XmlPersonDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *  This is to demonstrate how to make SpringCore work based on Xml Context defined in resources folder.
 *  The context file can be of any name provided that it contains the spring framework beans namespaces and
 *  	related xsd locations.
 *  ClassPathXmlApplicationContext object is used to invoked the Application Context and bring up the application.
 *  	We have to provide right context file while instantiation the context.
 *   e.g=> ClassPathXmlApplicationContext applicationContext =  new ClassPathXmlApplicationContext("applicationContext.xml");
 *  The most Important Field in the applcation Context is <bean></bean> where we define the id
 *  	and class with complete Classpath to declare the Component beans
 *	In order to declare dependencies, we can use the <Property> element within <bean> structure
 */
public class XmlBasedConfigPracticeApplication {

	private static final Logger LOGGER = LoggerFactory.getLogger(XmlBasedConfigPracticeApplication.class);

	public static void main(String[] args) {
		ClassPathXmlApplicationContext applicationContext
				=  new ClassPathXmlApplicationContext("applicationContext.xml");
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
