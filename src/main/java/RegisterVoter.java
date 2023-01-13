

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterVoter
 */
@WebServlet("/RegisterVoter")
public class RegisterVoter extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public RegisterVoter() {
        super();
        // TODO Auto-generated constructor stub
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		//PrintWriter out =response.getWriter();
		dbManager db=new dbManager();
		
		java.sql.Connection con=db.getConnection();
		
		String name=request.getParameter("name");
		String number=request.getParameter("number");
		String email=request.getParameter("email");
		String voterNumber=request.getParameter("voterNumber");
		String address=request.getParameter("address");
		String dob=request.getParameter("dob");
		 
	try {
		
		PreparedStatement st=con.prepareStatement("insert into voter2(vName,vNumber,email,voterNumber,address,dob)values('"+name+"','"+number+"','"+email+"','"+voterNumber+"','"+address+"','"+dob+"')");
	    st.executeUpdate();
	    response.sendRedirect("welcomeAdmin.jsp");
	   
	}catch(Exception e){
		e.printStackTrace();
	}
	}
}
