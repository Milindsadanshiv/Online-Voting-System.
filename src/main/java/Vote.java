

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Vote
 */
@WebServlet("/Vote")
public class Vote extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Vote() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
           dbManager db=new dbManager();
		
		   java.sql.Connection con=db.getConnection();
		    
		     String vNumber=request.getParameter("voterID");
			 String party=request.getParameter("party");
			 
			 try {
				   
				    PreparedStatement st=con.prepareStatement("select * from voter2 where voterNumber='"+vNumber+"'");
					ResultSet rs=((java.sql.Statement)st).executeQuery("select * from voter2 where voterNumber='"+vNumber+"'");
					
				 if (rs.next()) {
			  PreparedStatement st3=con.prepareStatement("insert into temp_voter_id(vNumber)values('"+vNumber+"')");
			  PreparedStatement st2=con.prepareStatement("insert into vote(voterNumber,party)values('"+vNumber+"','"+party+"')");
		     
			  st3.executeUpdate();
			  st2.executeUpdate();
				 
			 response.sendRedirect("index.jsp");
				 }
				 else
				 {
					 response.sendRedirect("invalid.jsp");
				 }
			 }catch(Exception e) {
				 e.printStackTrace();
			 }
			 
			 
	}

}
