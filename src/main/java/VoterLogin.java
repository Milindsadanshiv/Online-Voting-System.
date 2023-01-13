

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VoterLogin
 */
@WebServlet("/VoterLogin")
public class VoterLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoterLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		//PrintWriter out =response.getWriter();
		dbManager db=new dbManager();
		
		java.sql.Connection con=db.getConnection();
		
		String vNumber=request.getParameter("VoterNumber");
		
		
		try
		{
			PreparedStatement st1 =con.prepareStatement("select vNumber from temp_voter_id where vNumber='"+vNumber+"'");
		    ResultSet rs1=st1.executeQuery("select vNumber from temp_voter_id where vNumber='"+vNumber+"'");
		    
		    
		    if (rs1.next()) {
		    	response.sendRedirect("voted.jsp");
		    }
		    else
		    {
		    	PreparedStatement st =con.prepareStatement("select voterNumber from voter2 where voterNumber='"+vNumber+"'");
		    	ResultSet rs=((java.sql.Statement)st).executeQuery("select voterNumber from voter2 where voterNumber='"+vNumber+"'");
		    	if (rs.next()) {
		    		response.sendRedirect("welVoter.jsp");
		    	}
		    	else
		    	{
		    		response.sendRedirect("invalid.jsp");
		    	}
		    }
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
