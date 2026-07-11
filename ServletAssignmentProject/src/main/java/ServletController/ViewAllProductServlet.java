package ServletController;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import Dao.StoreDao;
import Dto.Store;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ViewAllProductServlet extends HttpServlet{
      
	@Override
	public void doGet(HttpServletRequest  req,HttpServletResponse res)throws ServletException, IOException {
		 StoreDao dao = new StoreDao();

	        List<Store> productList = dao.getAllStoreProducts();

	        res.setContentType("text/html");

	        PrintWriter out = res.getWriter();

	        out.println("<html>");
	        out.println("<body>");

	        out.println("<h2>Store Products</h2>");

	        for (Store store : productList) {

	            out.println("<p>");
	            out.println("ID : " + store.getId());
	            out.println("<br>");
	            out.println("Name : " + store.getName());
	            out.println("</p>");
	            out.println("<hr>");

	        }

	        out.println("</body>");
	        out.println("</html>");
	    }
		
}
