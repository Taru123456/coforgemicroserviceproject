/**
 * 
 */
package com.example.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.customer.model.Customer;
import com.example.customer.model.MovieDto;
import com.example.customer.repository.CustomerRepository;



/**
 * @author Lenovo
 *
 */
@Service
public class CustomerServiceImpl implements CustomerService{

	
	@Autowired
	private CustomerRepository custrepo;
	
	@Autowired
	FeignProxy proxy;
	
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return this.custrepo.findAll();
	}

	@Override
	public Customer getCustomerbyId(Long custid) {
		// TODO Auto-generated method stub
		return this.custrepo.findById(custid).get();
	}

	@Override
	public Customer saveCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return this.custrepo.save(cust);
	}

	@Override
	public Customer updateCustomer(Long custid) {
		// TODO Auto-generated method stub
		Customer cust=this.custrepo.findById(custid).get();
		
		return this.custrepo.save(cust);
	}

	@Override
	public boolean deletebyId(Customer cust) {
		// TODO Auto-generated method stub
		this.custrepo.delete(cust);
		return true;
	}

	@Override
	public List<MovieDto> searchMovies(String keyword) {
		// TODO Auto-generated method stub
		return proxy.searchMovie(keyword);
	}

	

}
