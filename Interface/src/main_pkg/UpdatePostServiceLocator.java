/**
 * UpdatePostServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public class UpdatePostServiceLocator extends org.apache.axis.client.Service implements main_pkg.UpdatePostService {

    public UpdatePostServiceLocator() {
    }


    public UpdatePostServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UpdatePostServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for updatePost
    private java.lang.String updatePost_address = "http://localhost:8080/magazine/services/updatePost";

    public java.lang.String getupdatePostAddress() {
        return updatePost_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String updatePostWSDDServiceName = "updatePost";

    public java.lang.String getupdatePostWSDDServiceName() {
        return updatePostWSDDServiceName;
    }

    public void setupdatePostWSDDServiceName(java.lang.String name) {
        updatePostWSDDServiceName = name;
    }

    public main_pkg.UpdatePost getupdatePost() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(updatePost_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getupdatePost(endpoint);
    }

    public main_pkg.UpdatePost getupdatePost(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            main_pkg.UpdatePostSoapBindingStub _stub = new main_pkg.UpdatePostSoapBindingStub(portAddress, this);
            _stub.setPortName(getupdatePostWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setupdatePostEndpointAddress(java.lang.String address) {
        updatePost_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (main_pkg.UpdatePost.class.isAssignableFrom(serviceEndpointInterface)) {
                main_pkg.UpdatePostSoapBindingStub _stub = new main_pkg.UpdatePostSoapBindingStub(new java.net.URL(updatePost_address), this);
                _stub.setPortName(getupdatePostWSDDServiceName());
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
        if ("updatePost".equals(inputPortName)) {
            return getupdatePost();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://main", "updatePostService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://main", "updatePost"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("updatePost".equals(portName)) {
            setupdatePostEndpointAddress(address);
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
