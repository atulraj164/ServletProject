package ServletControllerCustomer;

import java.io.IOException;

import Dao.CustomerDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/login")
public class CustomerLogin extends HttpServlet{
	
	  @Override
       public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
    	  
		  System.out.println("servlet working");
		  
		  
		  CustomerDao customerdao = new CustomerDao();
		  if(customerdao.checkCustomer(req.getParameter("email"),req.getParameter("password"))){
			  HttpSession session=req.getSession();
			  session.setAttribute("sessionid",req.getParameter("email") );
			  System.out.println("session id- "+req.getParameter("email"));
			  res.sendRedirect("HomePage.jsp");
		  }else {
			  req.setAttribute("message", "invalid password or email-id");
			  RequestDispatcher rs=req.getRequestDispatcher("index.jsp");
			  rs.forward(req, res);
			  }
			  
       }
}
