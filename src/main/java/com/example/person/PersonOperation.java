package com.example.person;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.5.redhat-630224
 * 2017-10-26T14:52:05.516-05:00
 * Generated source version: 3.1.5.redhat-630224
 * 
 */
@WebService(targetNamespace = "http://example.com/Person/", name = "PersonOperation")
@XmlSeeAlso({ObjectFactory.class})
public interface PersonOperation {

    @WebResult(name = "out", targetNamespace = "")
    @RequestWrapper(localName = "NewOperation", targetNamespace = "http://example.com/Person/", className = "com.example.person.NewOperation")
    @WebMethod(operationName = "NewOperation", action = "http://example.com/Person/NewOperation")
    @ResponseWrapper(localName = "NewOperationResponse", targetNamespace = "http://example.com/Person/", className = "com.example.person.NewOperationResponse")
    public java.lang.String newOperation(
        @WebParam(name = "person", targetNamespace = "")
        com.example.person.PersonType person
    );
}
