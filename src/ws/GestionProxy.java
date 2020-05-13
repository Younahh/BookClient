package ws;

public class GestionProxy implements ws.Gestion {
  private String _endpoint = null;
  private ws.Gestion gestion = null;
  
  public GestionProxy() {
    _initGestionProxy();
  }
  
  public GestionProxy(String endpoint) {
    _endpoint = endpoint;
    _initGestionProxy();
  }
  
  private void _initGestionProxy() {
    try {
      gestion = (new ws.GestionServiceLocator()).getGestion();
      if (gestion != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)gestion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)gestion)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (gestion != null)
      ((javax.xml.rpc.Stub)gestion)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public ws.Gestion getGestion() {
    if (gestion == null)
      _initGestionProxy();
    return gestion;
  }
  
  public beans.Livre chercherLivreId(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherLivreId(id);
  }
  
  public beans.Livre chercherLivre(java.lang.String nom) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherLivre(nom);
  }
  
  public void ajouterLivre(beans.Livre livre) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.ajouterLivre(livre);
  }
  
  public void modifierLivre(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.modifierLivre(id);
  }
  
  public beans.User authentifierUser(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.authentifierUser(email, password);
  }
  
  public void supprimerLivre(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.supprimerLivre(id);
  }
  
  public beans.User chercherUser(java.lang.String email) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherUser(email);
  }
  
  public void ajouterUser(beans.User user) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.ajouterUser(user);
  }
  
  public void modifierUser(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.modifierUser(id);
  }
  
  public void supprimerUser(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.supprimerUser(id);
  }
  
  public beans.Panier[] chercherPanier(int idd) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherPanier(idd);
  }
  
  public void modifierLivreNbr(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.modifierLivreNbr(id);
  }
  
  public void ajouterPanier(beans.Panier panier) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.ajouterPanier(panier);
  }
  
  public void supprimerPanier(int id) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.supprimerPanier(id);
  }
  
  public beans.Livre[] chercherLivreCategorie(java.lang.String categorie) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherLivreCategorie(categorie);
  }
  
  public beans.Livre[] chercherLivreNouveautes() throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    return gestion.chercherLivreNouveautes();
  }
  
  public void supprimerPanierIdd(int idd) throws java.rmi.RemoteException{
    if (gestion == null)
      _initGestionProxy();
    gestion.supprimerPanierIdd(idd);
  }
  
  
}