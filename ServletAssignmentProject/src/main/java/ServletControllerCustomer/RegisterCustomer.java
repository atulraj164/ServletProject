package ServletControllerCustomer;

import Dao.CustomerDao;
import Dto.Customer;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class RegisterCustomer extends HttpServlet{

	public void doGet(HttpServletRequest  req,HttpServletResponse res) {
	CustomerDao cd=new CustomerDao();
	Customer customer=new Customer();
	customer.setId(Integer.parseInt(req.getParameter("id")));
	customer.setName(req.getParameter("name"));
	customer.setAddress(req.getParameter("address"));
	         cd.insertCustomer(customer);
	}
	
}
