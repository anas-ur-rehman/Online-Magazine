/**
 * PostInsertServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public class PostInsertServiceLocator extends org.apache.axis.client.Service implements main_pkg.PostInsertService {

    public PostInsertServiceLocator() {
    }


    public PostInsertServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PostInsertServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for postInsert
    private java.lang.String postInsert_address = "http://localhost:8080/magazine/services/postInsert";

    public java.lang.String getpostInsertAddress() {
        return postInsert_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String postInsertWSDDServiceName = "postInsert";

    public java.lang.String getpostInsertWSDDServiceName() {
        return postInsertWSDDServiceName;
    }

    public void setpostInsertWSDDServiceName(java.lang.String name) {
        postInsertWSDDServiceName = name;
    }

    public main_pkg.PostInsert getpostInsert() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(postInsert_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getpostInsert(endpoint);
    }

    public main_pkg.PostInsert getpostInsert(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main_pkg.PostInsertSoapBindingStub _stub = new main_pkg.PostInsertSoapBindingStub(portAddress, this);
            _stub.setPortName(getpostInsertWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setpostInsertEndpointAddress(java.lang.String address) {
        postInsert_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main_pkg.PostInsert.class.isAssignableFrom(serviceEndpointInterface)) {
                main_pkg.PostInsertSoapBindingStub _stub = new main_pkg.PostInsertSoapBindingStub(new java.net.URL(postInsert_address), this);
                _stub.setPortName(getpostInsertWSDDServiceName());
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
        if ("postInsert".equals(inputPortName)) {
            return getpostInsert();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "postInsertService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "postInsert"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("postInsert".equals(portName)) {
            setpostInsertEndpointAddress(address);
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
