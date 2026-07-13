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
	        req.setAttribute("allProduct", productList);
            RequestDispatcher sd=req.getRequestDispatcher("viewStore.jsp");
            sd.forward(req, res);
	    
	    }
		
}
