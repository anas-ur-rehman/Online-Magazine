package main_pkg;

public class PostInsertProxy implements main_pkg.PostInsert {
  private String _endpoint = null;
  private main_pkg.PostInsert postInsert = null;
  
  public PostInsertProxy() {
    _initPostInsertProxy();
  }
  
  public PostInsertProxy(String endpoint) {
    _endpoint = endpoint;
    _initPostInsertProxy();
  }
  
  private void _initPostInsertProxy() {
    try {
      postInsert = (new main_pkg.PostInsertServiceLocator()).getpostInsert();
      if (postInsert != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)postInsert)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)postInsert)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (postInsert != null)
      ((javax.xml.rpc.Stub)postInsert)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.PostInsert getPostInsert() {
    if (postInsert == null)
      _initPostInsertProxy();
    return postInsert;
  }
  
  public void main(java.lang.String title, java.lang.String description) throws java.rmi.RemoteException{
    if (postInsert == null)
      _initPostInsertProxy();
    postInsert.main(title, description);
  }
  
  
}