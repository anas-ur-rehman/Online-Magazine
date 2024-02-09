package main;

public class SearchProxy implements main.Search {
  private String _endpoint = null;
  private main.Search search = null;
  
  public SearchProxy() {
    _initSearchProxy();
  }
  
  public SearchProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchProxy();
  }
  
  private void _initSearchProxy() {
    try {
      search = (new main.SearchServiceLocator()).getSearch();
      if (search != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)search)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)search)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (search != null)
      ((javax.xml.rpc.Stub)search)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.Search getSearch() {
    if (search == null)
      _initSearchProxy();
    return search;
  }
  
  public java.lang.String searchPostsByCategory(java.lang.String category) throws java.rmi.RemoteException{
    if (search == null)
      _initSearchProxy();
    return search.searchPostsByCategory(category);
  }
  
  
}