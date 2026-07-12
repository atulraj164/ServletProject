package ServletControllerCustomer;

import java.io.IOException;
import java.util.List;

import Dao.CustomerDao;
import Dto.Customer;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class GetCustomer extends HttpServlet{

	
	@Override
	public void doGet(HttpServletRequest  req,HttpServletResponse res) throws ServletException, IOException {
		CustomerDao cd=new CustomerDao();
		List<Customer>customer=cd.getAllCustomers();
		
		req.setAttribute("Customer", customer);
		RequestDispatcher rd= req.getRequestDispatcher("Customers.jsp");
		rd.forward(req, res);
		
	}
}
