package com.example.sahil.xml_context.connection;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class XmlJdbcConnection {
    private static final Logger LOGGER = LoggerFactory.getLogger(XmlJdbcConnection.class);

    public XmlJdbcConnection() {
        LOGGER.info("============> DUMMY JDBC CONNECTION ESTABLISHED, ID = {} ", this.hashCode());

    }

}
