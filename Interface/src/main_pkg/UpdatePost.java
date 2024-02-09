/**
 * UpdatePost.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package main_pkg;

public interface UpdatePost extends java.rmi.Remote {
    public void main(int ID, java.lang.String category, java.lang.String description) throws java.rmi.RemoteException;
    public int getid(java.lang.String des) throws java.rmi.RemoteException;
}
