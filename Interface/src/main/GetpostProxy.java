package main;

public class GetpostProxy implements main.Getpost {
  private String _endpoint = null;
  private main.Getpost getpost = null;
  
  public GetpostProxy() {
    _initGetpostProxy();
  }
  
  public GetpostProxy(String endpoint) {
    _endpoint = endpoint;
    _initGetpostProxy();
  }
  
  private void _initGetpostProxy() {
    try {
      getpost = (new main.GetpostServiceLocator()).getgetpost();
      if (getpost != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)getpost)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)getpost)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (getpost != null)
      ((javax.xml.rpc.Stub)getpost)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Getpost getGetpost() {
    if (getpost == null)
      _initGetpostProxy();
    return getpost;
  }
  
  public java.lang.String get_post(java.lang.String posttitle) throws java.rmi.RemoteException{
    if (getpost == null)
      _initGetpostProxy();
    return getpost.get_post(posttitle);
  }
  
  
}