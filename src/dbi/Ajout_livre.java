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
import beans.User;
import ws.Gestion;
import ws.GestionService;
import ws.GestionServiceLocator;

@WebServlet("/Ajout_livre")
public class Ajout_livre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Ajout_livre() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GestionService Service = new GestionServiceLocator();		
		try {
			Gestion port = Service.getGestion();		
			Livre livre = new Livre();
			livre.setCategorie(request.getParameter("categorie"));
			livre.setNom(request.getParameter("nom"));
			livre.setAuteur(request.getParameter("auteur"));
			livre.setDescription(request.getParameter("description"));
			livre.setPrix(Integer.parseInt(request.getParameter("prix")));
			livre.setImage(request.getParameter("image"));
			livre.setNbr(Integer.parseInt(request.getParameter("nbr")));
		
			HttpSession ses=request.getSession();
			User user = (User)ses.getAttribute("user");
    	
			port.ajouterLivre(livre);
			request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
			
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

}
