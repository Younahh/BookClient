package dbi;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.rpc.ServiceException;

import beans.User;
import ws.Gestion;
import ws.GestionService;
import ws.GestionServiceLocator;

@WebServlet("/Effectue")
public class Effectue extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Effectue() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	HttpSession ses=request.getSession();
    	User user = (User)ses.getAttribute("user");
    
    	GestionService Service = new GestionServiceLocator();
		try {
			Gestion port = Service.getGestion();
			int idd = user.getId();			
			port.supprimerPanierIdd(idd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
		request.getRequestDispatcher("/Accueil.jsp").forward(request, response);
	}

}
