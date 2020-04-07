package com.example.sahil.xml_context.dao;

import com.example.sahil.xml_context.connection.XmlJdbcConnection;


public class XmlPersonDao {
    private XmlJdbcConnection xmlJdbcConnection;

    public XmlJdbcConnection getXmlJdbcConnection(){
        return xmlJdbcConnection;
    }

    public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
        this.xmlJdbcConnection = xmlJdbcConnection;
    }

}
