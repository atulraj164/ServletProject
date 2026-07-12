package Dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import ConnectionFactory.storeConnection;
	import Dto.Customer;

	public class CustomerDao {

	    String INSERTQUERY = "INSERT INTO customer(id, name, address) VALUES(?, ?, ?)";
	    String GETALLCUSTOMERS = "SELECT * FROM customer";

	    Connection Sc = null;
	    PreparedStatement ps = null;

	    // Insert Customer
	    public void insertCustomer(Customer customer) {

	        storeConnection storeconnection = new storeConnection();
	        Sc = storeconnection.getStoreConnection();

	        try {

	            ps = Sc.prepareStatement(INSERTQUERY);

	            ps.setInt(1, customer.getId());
	            ps.setString(2, customer.getName());
	            ps.setString(3, customer.getAddress());

	            int success = ps.executeUpdate();

	            if (success > 0) {
	                System.out.println("Customer Inserted Successfully");
	            } else {
	                System.out.println("Customer Insertion Failed");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }

	    // Fetch All Customers
	    public List<Customer> getAllCustomers() {

	        try {

	            List<Customer> customerList = new ArrayList<>();

	            storeConnection storeconnection = new storeConnection();
	            Sc = storeconnection.getStoreConnection();

	            ps = Sc.prepareStatement(GETALLCUSTOMERS);

	            ResultSet rs = ps.executeQuery();

	            while (rs.next()) {

	                Customer customer = new Customer();

	                customer.setId(rs.getInt("id"));
	                customer.setName(rs.getString("name"));
	                customer.setAddress(rs.getString("address"));

	                customerList.add(customer);
	            }

	            return customerList;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	}
