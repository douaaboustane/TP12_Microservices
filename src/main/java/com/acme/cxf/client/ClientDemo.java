package com.acme.cxf.client;

import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.BindingProvider;

import com.acme.cxf.api.HelloService;
import com.acme.cxf.api.HelloService_Service;
import com.acme.cxf.api.Person;

public class ClientDemo {
    public static void main(String[] args) throws Exception {
        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");

        // from your WSDL:
        QName serviceName = new QName("http://api.cxf.acme.com/", "HelloService");
        QName portName    = new QName("http://api.cxf.acme.com/", "HelloServicePort"); // <wsdl:port name="HelloServicePort">

        HelloService_Service svc = new HelloService_Service(wsdl, serviceName);

        // ✅ generic way (no need for getHelloServicePort()):
        HelloService port = svc.getPort(portName, HelloService.class);

        // calls (adjust names/return types to your generated HelloService.java)
        String msg = port.sayHello("ClientJava");
        System.out.println("sayHello -> " + msg);

        Person p = port.findPerson("P-777");  // if your method is findPersonById, rename here
        System.out.println("findPerson -> " + (p == null ? "<null>" : p.getName()));
    }
}
