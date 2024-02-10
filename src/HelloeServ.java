import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloeServ extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		//ServletConfig con= getServletConfig();
		//String name=con.getInitParameter("owner");
		
		ServletContext con= getServletContext();
		String name=con.getInitParameter("owner2");
		
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		out.print("Welcome to hello serv "+name+"<br/>");
		
		
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		doGet(req,resp);
}
	
	

}
