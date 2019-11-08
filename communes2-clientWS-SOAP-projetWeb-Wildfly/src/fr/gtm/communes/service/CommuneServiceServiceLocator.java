/**
 * CommuneServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.gtm.communes.service;

public class CommuneServiceServiceLocator extends org.apache.axis.client.Service implements fr.gtm.communes.service.CommuneServiceService {

    public CommuneServiceServiceLocator() {
    }


    public CommuneServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CommuneServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CommuneServicePort
    private java.lang.String CommuneServicePort_address = "http://localhost:9080/communes/CommuneService";

    public java.lang.String getCommuneServicePortAddress() {
        return CommuneServicePort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CommuneServicePortWSDDServiceName = "CommuneServicePort";

    public java.lang.String getCommuneServicePortWSDDServiceName() {
        return CommuneServicePortWSDDServiceName;
    }

    public void setCommuneServicePortWSDDServiceName(java.lang.String name) {
        CommuneServicePortWSDDServiceName = name;
    }

    public fr.gtm.communes.service.CommuneService getCommuneServicePort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CommuneServicePort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCommuneServicePort(endpoint);
    }

    public fr.gtm.communes.service.CommuneService getCommuneServicePort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fr.gtm.communes.service.CommuneServiceServiceSoapBindingStub _stub = new fr.gtm.communes.service.CommuneServiceServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCommuneServicePortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCommuneServicePortEndpointAddress(java.lang.String address) {
        CommuneServicePort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fr.gtm.communes.service.CommuneService.class.isAssignableFrom(serviceEndpointInterface)) {
                fr.gtm.communes.service.CommuneServiceServiceSoapBindingStub _stub = new fr.gtm.communes.service.CommuneServiceServiceSoapBindingStub(new java.net.URL(CommuneServicePort_address), this);
                _stub.setPortName(getCommuneServicePortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("CommuneServicePort".equals(inputPortName)) {
            return getCommuneServicePort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.communes.gtm.fr/", "CommuneServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.communes.gtm.fr/", "CommuneServicePort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CommuneServicePort".equals(portName)) {
            setCommuneServicePortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
