/**
 * AdminLoginServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public class AdminLoginServiceLocator extends org.apache.axis.client.Service implements main.AdminLoginService {

    public AdminLoginServiceLocator() {
    }


    public AdminLoginServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AdminLoginServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AdminLogin
    private java.lang.String AdminLogin_address = "http://localhost:8080/magazine/services/AdminLogin";

    public java.lang.String getAdminLoginAddress() {
        return AdminLogin_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AdminLoginWSDDServiceName = "AdminLogin";

    public java.lang.String getAdminLoginWSDDServiceName() {
        return AdminLoginWSDDServiceName;
    }

    public void setAdminLoginWSDDServiceName(java.lang.String name) {
        AdminLoginWSDDServiceName = name;
    }

    public main.AdminLogin getAdminLogin() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AdminLogin_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAdminLogin(endpoint);
    }

    public main.AdminLogin getAdminLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main.AdminLoginSoapBindingStub _stub = new main.AdminLoginSoapBindingStub(portAddress, this);
            _stub.setPortName(getAdminLoginWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAdminLoginEndpointAddress(java.lang.String address) {
        AdminLogin_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main.AdminLogin.class.isAssignableFrom(serviceEndpointInterface)) {
                main.AdminLoginSoapBindingStub _stub = new main.AdminLoginSoapBindingStub(new java.net.URL(AdminLogin_address), this);
                _stub.setPortName(getAdminLoginWSDDServiceName());
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
        if ("AdminLogin".equals(inputPortName)) {
            return getAdminLogin();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "AdminLoginService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "AdminLogin"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AdminLogin".equals(portName)) {
            setAdminLoginEndpointAddress(address);
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
