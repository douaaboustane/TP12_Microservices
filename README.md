## REST & SOAP Services Demonstration

This section presents the implementation and testing of both RESTful and SOAP-based web services developed using Spring Boot.

### REST API – Client Service

The REST service exposes HTTP endpoints that return client data in JSON format.

![Get all clients](images/rest-all-clients.png)

The endpoint `GET /client` retrieves the complete list of clients stored in the system.

![Get client by ID](images/rest-client-by-id.png)

The endpoint `GET /client/{id}` returns the details of a specific client identified by its unique ID.

### SOAP Web Service – FindPerson

In addition to REST, a SOAP web service was implemented and tested using SoapUI.

![SOAP request and response](images/soapui-findperson.png)

The `FindPerson` operation receives an identifier inside a SOAP envelope and returns the corresponding person information in XML format.

### WSDL – Service Description

The WSDL file defines the contract of the SOAP web service, including operations, message structures, and data types.

![WSDL file](images/wsdl-hello-service.png)

The WSDL is accessible via the following URL:
