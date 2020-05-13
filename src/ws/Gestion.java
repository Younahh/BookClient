/**
 * Gestion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ws;

public interface Gestion extends java.rmi.Remote {
    public beans.Livre chercherLivreId(int id) throws java.rmi.RemoteException;
    public beans.Livre chercherLivre(java.lang.String nom) throws java.rmi.RemoteException;
    public void ajouterLivre(beans.Livre livre) throws java.rmi.RemoteException;
    public void modifierLivre(int id) throws java.rmi.RemoteException;
    public beans.User authentifierUser(java.lang.String email, java.lang.String password) throws java.rmi.RemoteException;
    public void supprimerLivre(int id) throws java.rmi.RemoteException;
    public beans.User chercherUser(java.lang.String email) throws java.rmi.RemoteException;
    public void ajouterUser(beans.User user) throws java.rmi.RemoteException;
    public void modifierUser(int id) throws java.rmi.RemoteException;
    public void supprimerUser(int id) throws java.rmi.RemoteException;
    public beans.Panier[] chercherPanier(int idd) throws java.rmi.RemoteException;
    public void modifierLivreNbr(int id) throws java.rmi.RemoteException;
    public void ajouterPanier(beans.Panier panier) throws java.rmi.RemoteException;
    public void supprimerPanier(int id) throws java.rmi.RemoteException;
    public beans.Livre[] chercherLivreCategorie(java.lang.String categorie) throws java.rmi.RemoteException;
    public beans.Livre[] chercherLivreNouveautes() throws java.rmi.RemoteException;
    public void supprimerPanierIdd(int idd) throws java.rmi.RemoteException;
}
