package main;

public class AdminLoginProxy implements main.AdminLogin {
  private String _endpoint = null;
  private main.AdminLogin adminLogin = null;
  
  public AdminLoginProxy() {
    _initAdminLoginProxy();
  }
  
  public AdminLoginProxy(String endpoint) {
    _endpoint = endpoint;
    _initAdminLoginProxy();
  }
  
  private void _initAdminLoginProxy() {
    try {
      adminLogin = (new main.AdminLoginServiceLocator()).getAdminLogin();
      if (adminLogin != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)adminLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)adminLogin)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (adminLogin != null)
      ((javax.xml.rpc.Stub)adminLogin)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.AdminLogin getAdminLogin() {
    if (adminLogin == null)
      _initAdminLoginProxy();
    return adminLogin;
  }
  
  public boolean login(java.lang.String name, java.lang.String password) throws java.rmi.RemoteException{
    if (adminLogin == null)
      _initAdminLoginProxy();
    return adminLogin.login(name, password);
  }
  
  
}