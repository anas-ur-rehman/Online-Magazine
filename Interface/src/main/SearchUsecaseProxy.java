package main;

public class SearchUsecaseProxy implements main.SearchUsecase {
  private String _endpoint = null;
  private main.SearchUsecase searchUsecase = null;
  
  public SearchUsecaseProxy() {
    _initSearchUsecaseProxy();
  }
  
  public SearchUsecaseProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchUsecaseProxy();
  }
  
  private void _initSearchUsecaseProxy() {
    try {
      searchUsecase = (new main.SearchUsecaseServiceLocator()).getSearchUsecase();
      if (searchUsecase != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchUsecase)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchUsecase)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchUsecase != null)
      ((javax.xml.rpc.Stub)searchUsecase)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public main.SearchUsecase getSearchUsecase() {
    if (searchUsecase == null)
      _initSearchUsecaseProxy();
    return searchUsecase;
  }
  
  public java.lang.String getdescription(java.lang.String searched) throws java.rmi.RemoteException{
    if (searchUsecase == null)
      _initSearchUsecaseProxy();
    return searchUsecase.getdescription(searched);
  }
  
  
}