/**
 * GetpostServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class GetpostServiceLocator extends org.apache.axis.client.Service implements main.GetpostService {

    public GetpostServiceLocator() {
    }


    public GetpostServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetpostServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for getpost
    private java.lang.String getpost_address = "http://localhost:8080/magazine/services/getpost";

    public java.lang.String getgetpostAddress() {
        return getpost_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String getpostWSDDServiceName = "getpost";

    public java.lang.String getgetpostWSDDServiceName() {
        return getpostWSDDServiceName;
    }

    public void setgetpostWSDDServiceName(java.lang.String name) {
        getpostWSDDServiceName = name;
    }

    public main.Getpost getgetpost() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(getpost_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getgetpost(endpoint);
    }

    public main.Getpost getgetpost(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.GetpostSoapBindingStub _stub = new main.GetpostSoapBindingStub(portAddress, this);
            _stub.setPortName(getgetpostWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setgetpostEndpointAddress(java.lang.String address) {
        getpost_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.Getpost.class.isAssignableFrom(serviceEndpointInterface)) {
                main.GetpostSoapBindingStub _stub = new main.GetpostSoapBindingStub(new java.net.URL(getpost_address), this);
                _stub.setPortName(getgetpostWSDDServiceName());
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
        if ("getpost".equals(inputPortName)) {
            return getgetpost();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "getpostService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "getpost"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("getpost".equals(portName)) {
            setgetpostEndpointAddress(address);
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
