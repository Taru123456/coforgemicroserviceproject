/**
 * 
 */
package com.example.customer.service;

import java.util.List;

import com.example.customer.model.Customer;
import com.example.customer.model.MovieDto;



/**
 * @author Lenovo
 *
 */

public interface CustomerService {
	
	//crud operations
	
		//GET
		
		public List<Customer> getAllCustomers();
		
		//GETBYID
		
		public Customer getCustomerbyId(Long custid);
		
		//CREATE
		
		public Customer saveCustomer(Customer cust);
		
		
		//UPDATE-ID
		public Customer updateCustomer(Long custid);
		//DELETE
		public boolean deletebyId(Customer cust);
		
		public List<MovieDto> searchMovies(String keyword);
		

}
