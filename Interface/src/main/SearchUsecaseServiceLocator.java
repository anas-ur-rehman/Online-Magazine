/**
 * SearchUsecaseServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class SearchUsecaseServiceLocator extends org.apache.axis.client.Service implements main.SearchUsecaseService {

    public SearchUsecaseServiceLocator() {
    }


    public SearchUsecaseServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchUsecaseServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchUsecase
    private java.lang.String SearchUsecase_address = "http://localhost:8080/magazine/services/SearchUsecase";

    public java.lang.String getSearchUsecaseAddress() {
        return SearchUsecase_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchUsecaseWSDDServiceName = "SearchUsecase";

    public java.lang.String getSearchUsecaseWSDDServiceName() {
        return SearchUsecaseWSDDServiceName;
    }

    public void setSearchUsecaseWSDDServiceName(java.lang.String name) {
        SearchUsecaseWSDDServiceName = name;
    }

    public main.SearchUsecase getSearchUsecase() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchUsecase_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchUsecase(endpoint);
    }

    public main.SearchUsecase getSearchUsecase(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.SearchUsecaseSoapBindingStub _stub = new main.SearchUsecaseSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchUsecaseWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchUsecaseEndpointAddress(java.lang.String address) {
        SearchUsecase_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.SearchUsecase.class.isAssignableFrom(serviceEndpointInterface)) {
                main.SearchUsecaseSoapBindingStub _stub = new main.SearchUsecaseSoapBindingStub(new java.net.URL(SearchUsecase_address), this);
                _stub.setPortName(getSearchUsecaseWSDDServiceName());
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
        if ("SearchUsecase".equals(inputPortName)) {
            return getSearchUsecase();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "SearchUsecaseService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "SearchUsecase"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchUsecase".equals(portName)) {
            setSearchUsecaseEndpointAddress(address);
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
