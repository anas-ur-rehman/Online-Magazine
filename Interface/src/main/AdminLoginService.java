/**
 * AdminLoginService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main;

public interface AdminLoginService extends javax.xml.rpc.Service {
    public java.lang.String getAdminLoginAddress();

    public main.AdminLogin getAdminLogin() throws javax.xml.rpc.ServiceException;

    public main.AdminLogin getAdminLogin(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
