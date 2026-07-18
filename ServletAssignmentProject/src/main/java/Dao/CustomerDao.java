package Dao;


	import java.sql.Connection;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.util.ArrayList;
	import java.util.List;

	import ConnectionFactory.storeConnection;
	import Dto.Customer;

	public class CustomerDao {

		private static final String INSERTQUERY =
			    "INSERT INTO customer(name, email, password, mobile, address) VALUES(?, ?, ?, ?, ?)";
		private static final String GETALLCUSTOMERS =
			    "SELECT * FROM customer";
		
		private static final String GETCUSTOMERBYEMAIL = "SELECT * FROM customer WHERE email = ?";
		
	    Connection Sc = null;
	    PreparedStatement ps = null;

	    // Insert Customer
	    public void insertCustomer(Customer customer) {

	        storeConnection storeconnection = new storeConnection();
	        Sc = storeconnection.getStoreConnection();

	        try {

	            ps = Sc.prepareStatement(INSERTQUERY);

	            ps.setString(1, customer.getName());
	            ps.setString(2, customer.getEmail());
	            ps.setString(3, customer.getPassword());
	            ps.setString(4, customer.getMobile());
	            ps.setString(5, customer.getAddress());

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
	                customer.setEmail(rs.getString("email"));
	                customer.setPassword(rs.getString("password"));
	                customer.setMobile(rs.getString("mobile"));
	                customer.setAddress(rs.getString("address"));

	                customerList.add(customer);
	            }

	            return customerList;

	        } catch (Exception e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
	    public boolean checkCustomer(String email, String password) {

	        try {
	            storeConnection storeconnection = new storeConnection();
	            Sc = storeconnection.getStoreConnection();

	            ps = Sc.prepareStatement(GETCUSTOMERBYEMAIL);
	            ps.setString(1, email);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                return password.equals(rs.getString("password"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }

	        return false;
	    }
	    
	    
	}
