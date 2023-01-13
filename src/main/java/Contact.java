

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Contact")
public class Contact extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Contact() {
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
		String number=request.getParameter("number");
		String email=request.getParameter("email");
		String comment=request.getParameter("Comments");
		
		try
		{
			PreparedStatement st =con.prepareStatement("insert into contact(uName,pnumber,email,cmnt)values('"+name+"','"+number+"','"+email+"','"+comment+"')");
		    st.executeUpdate();
		    System.out.println(name);
		    response.sendRedirect("index.jsp");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
