
package com.jboss.soap.service;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * This class was generated by Apache CXF 2.6.6-redhat-3
 * Sun Jun 29 22:49:51 BST 2014
 * Generated source version: 2.6.6-redhat-3
 */

@XmlRootElement(name = "listAvailablePlanesResponse", namespace = "http://service.soap.jboss.com/AcmeDemo/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "listAvailablePlanesResponse", namespace = "http://service.soap.jboss.com/AcmeDemo/")

public class ListAvailablePlanesResponse {

    @XmlElement(name = "return")
    private List<com.jboss.soap.service.Flight> _return;

    public List<Flight> getReturn() {
        return this._return;
    }

    public void setReturn(List<Flight> new_return)  {
        this._return = new_return;
    }

}

