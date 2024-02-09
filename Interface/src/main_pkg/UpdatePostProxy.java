package main_pkg;

public class UpdatePostProxy implements main_pkg.UpdatePost {
  private String _endpoint = null;
  private main_pkg.UpdatePost updatePost = null;
  
  public UpdatePostProxy() {
    _initUpdatePostProxy();
  }
  
  public UpdatePostProxy(String endpoint) {
    _endpoint = endpoint;
    _initUpdatePostProxy();
  }
  
  private void _initUpdatePostProxy() {
    try {
      updatePost = (new main_pkg.UpdatePostServiceLocator()).getupdatePost();
      if (updatePost != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)updatePost)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)updatePost)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (updatePost != null)
      ((javax.xml.rpc.Stub)updatePost)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main_pkg.UpdatePost getUpdatePost() {
    if (updatePost == null)
      _initUpdatePostProxy();
    return updatePost;
  }
  
  public void main(int ID, java.lang.String category, java.lang.String description) throws java.rmi.RemoteException{
    if (updatePost == null)
      _initUpdatePostProxy();
    updatePost.main(ID, category, description);
  }
  
  public int getid(java.lang.String des) throws java.rmi.RemoteException{
    if (updatePost == null)
      _initUpdatePostProxy();
    return updatePost.getid(des);
  }
  
  
}