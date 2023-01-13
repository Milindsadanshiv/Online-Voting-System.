

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/AdminLogin")
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		dbManager db=new dbManager();
		
		java.sql.Connection con=db.getConnection();
		
		String name=request.getParameter("name");
		String pass=request.getParameter("password");
		
		try {
			PreparedStatement st=con.prepareStatement("select * from adminn where aName='"+name+"' and aPassword='"+pass+"'");
			ResultSet rs=((java.sql.Statement)st).executeQuery("select * from adminn where aName='"+name+"' and aPassword='"+pass+"'");
			
			if (rs.next()) {
				HttpSession session=request.getSession();
				session.setAttribute("aName",name);
				response.sendRedirect("welcomeAdmin.jsp");
				
			}
			else {
				response.sendRedirect("wrongPass.jsp");
			}
				
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
