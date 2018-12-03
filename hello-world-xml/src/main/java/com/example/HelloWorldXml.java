package com.example;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.StringWriter;

public class HelloWorldXml {

    public static void main(String[] args) throws JAXBException {
        JAXBContext jaxb = JAXBContext.newInstance(Messages.class);
        Marshaller marshaller = jaxb.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FRAGMENT,Boolean.TRUE);
        StringWriter writer = new StringWriter();
        marshaller.marshal(new Messages(), writer);
        System.out.println(writer.toString());
    }

}
