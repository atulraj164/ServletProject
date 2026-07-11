package ServletController;

import Dao.StoreDao;
import Dto.Store;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addProductServlet extends HttpServlet {
    
	@Override
	
	protected void doGet(HttpServletRequest req,HttpServletResponse resp)
	{
		Store store =new Store();
    	
    	store.setName(req.getParameter("ProductName"));
    	store.setId(Integer.parseInt(req.getParameter("ProductId")));
    	StoreDao storedao=new StoreDao();
    	storedao.insertStoreProduct(store);
	}
}
