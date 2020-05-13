package dbi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import beans.Livre;
import beans.Panier;
import beans.User;
import ws.Gestion;
import ws.GestionService;
import ws.GestionServiceLocator;

@WebServlet("/Panierfr")
public class Panierfr extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Panierfr() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		GestionService Service = new GestionServiceLocator();
		try {
			Gestion port = Service.getGestion();
			int id = Integer.parseInt(request.getParameter("nom"));
			Livre livre = port.chercherLivreId(id);
			
			HttpSession ses=request.getSession();
			User user = (User)ses.getAttribute("user");
	    	
	    	if(user==null){
	    		request.getRequestDispatcher("/Authentification.jsp?id="+request.getParameter("nom")).forward(request, response);
	    	}else {
	    		Panier panier = new Panier();
	    		panier.setIdd(user.getId());
	    		panier.setNom(livre.getNom());
	    		panier.setAuteur(livre.getAuteur());
	    		panier.setPrix(livre.getPrix());
	    		panier.setImage(livre.getImage());
	    		port.ajouterPanier(panier);
			}
		
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		try {
			Gestion port = Service.getGestion();
			int id = Integer.parseInt(request.getParameter("nom"));
			port.modifierLivreNbr(id);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/Francais.jsp").forward(request, response);
	}

}
