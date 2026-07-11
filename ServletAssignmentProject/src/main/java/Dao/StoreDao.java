package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import ConnectionFactory.storeConnection;
import Dto.Store;

public class StoreDao {
	String INSERTQUERY="insert into store(product_id,product_name)  values(?,?)";
	String GETALLSTOREPRODUCT="select * from store";
	
	Connection Sc=null;
	PreparedStatement ps=null;
	
   public void insertStoreProduct(Store store) {
	   storeConnection storeconnection=new storeConnection();
	   Sc=storeconnection.getStoreConnection();
	   
	   try {
	       ps=Sc.prepareStatement(INSERTQUERY);
	       ps.setInt(1, store.getId());
	       ps.setString(2, store.getName());
	       int success=ps.executeUpdate();
	       
	       if(success>0) {
	    	   System.out.println("successful Insert");
	       }else {
	    	   System.out.println("failed");
	       }
	       
	   }
	   catch(Exception e) {
           e.printStackTrace();
	   }  
   }
	
   public List<Store> getAllStoreProducts() {
	   try {
		   List<Store> productList=new ArrayList<>(); 
		   
	   storeConnection storeconnection=new storeConnection();
	    Sc=storeconnection.getStoreConnection();
	       ps=Sc.prepareStatement(GETALLSTOREPRODUCT);
          ResultSet rs=ps.executeQuery();
         
          while(rs.next()) {
        	  Store store=new Store();
        	  store.setId(rs.getInt("product_id"));
        	  store.setName(rs.getString("product_name"));
        	  productList.add(store);
          }
          return productList;
	   
	   }catch(Exception e) {
		   e.printStackTrace();
		   return null;
	   }
   }
} 
